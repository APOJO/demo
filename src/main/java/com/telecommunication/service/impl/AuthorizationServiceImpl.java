package com.telecommunication.service.impl;

import com.telecommunication.model.Constants;
import com.telecommunication.service.AuthorizationService;
import com.telecommunication.service.CacheService;
import com.telecommunication.util.HttpsUtil;
import com.telecommunication.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName AuthorizationServiceImpl
 * @Description
 * @Author xiebifeng
 * @Date 2019/1/2 12:35
 */
@Service
public class AuthorizationServiceImpl implements AuthorizationService {
    /**
     * @Description 鉴权
     * @author xiebifeng
     * @date 2019/1/3 10:38
     * @param: [serverIp, port, appId, secret]
     * @return: com.telecommunication.model.AuthResult
     */
    @Autowired
    private CacheService cacheService;
    Map<String, String> mapHeader;
    String mStrRefreshToken;

    @Override
    public Boolean getAccessToken() {
        Map<String, String> params = new HashMap<>(16);
        params.put("appId", Constants.APPID);
        params.put("secret", Constants.APPSECRET);
        Map<String, Object> mResult = new HashMap<>(16);
        try {
            HttpsUtil http = new HttpsUtil();
            http.initSSLConfigForTwoWay();
            String strResult = http.doPostFormUrlEncodedForString("https://" + Constants.SERVER + ":" + Constants.PORT + "/iocm/app/sec/v1.1.0/login", params);
            mResult = JsonUtil.jsonString2SimpleObj(strResult, mResult.getClass());
            if (mResult.get("error_code") != null) {
                return false;
            }

            // Update Data Member
            mapHeader = new HashMap<String, String>();
            mapHeader.put("app_key", Constants.APPID);
            mapHeader.put("Authorization", mResult.get("tokenType").toString() + " " + mResult.get("accessToken").toString());
            mStrRefreshToken = mResult.get("refreshToken").toString();
            cacheService.putObject("mapHeader",mapHeader,Integer.parseInt(mResult.get("expiresIn").toString()));
            cacheService.putString("refreshToken",mResult.get("accessToken").toString());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    /**
     * @Description 刷新token
     * @author xiebifeng
     * @date 2019/1/3 15:27
     * @param:
     * @return:
     */

    public Boolean refreshToken(){
        String strUrl = "https://" + Constants.SERVER + ":" + Constants.PORT  + "/iocm/app/sec/v1.1.0/refreshToken";
        Map<String, String> mParam = new HashMap<String, String>();
        mParam.put("appId", Constants.APPID);
        mParam.put("secret", Constants.APPSECRET);
        mParam.put("refreshToken", mStrRefreshToken);
        String strRequest = JsonUtil.jsonObj2Sting(mParam);
        // Send Request
        try{
            HttpsUtil httpsUtil=new HttpsUtil();
            httpsUtil.initSSLConfigForTwoWay();
            String strResult = httpsUtil.doPostJsonForString(strUrl, strRequest);

            // Parse Result
            Map<String, Object> mResult = new HashMap<String, Object>();
            mResult = JsonUtil.jsonString2SimpleObj(strResult, mResult.getClass());
            if (mResult.get("error_code") != null) {
                return false;
            }
            mapHeader = new HashMap<String, String>();
            mapHeader.put("app_key", Constants.APPID);
            mapHeader.put("Authorization", mResult.get("tokenType").toString() + " " + mResult.get("accessToken").toString());
            mStrRefreshToken = mResult.get("refreshToken").toString();
            cacheService.putObject("mapHeader",mapHeader,Integer.parseInt(mResult.get("expiresIn").toString()));
            cacheService.putString("refreshToken",mResult.get("accessToken").toString());
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
       return false;
    }

   
}
