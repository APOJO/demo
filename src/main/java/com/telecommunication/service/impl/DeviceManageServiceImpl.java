package com.telecommunication.service.impl;

import com.telecommunication.dao.DeviceManageMapper;
import com.telecommunication.model.Constants;
import com.telecommunication.service.AuthorizationService;
import com.telecommunication.service.CacheService;
import com.telecommunication.service.DeviceManageService;
import com.telecommunication.util.HttpsUtil;
import com.telecommunication.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName DeviceManageServiceImpl
 * @Description
 * @Author xiebifeng
 * @Date 2019/1/3 13:55
 */
@Service
public class DeviceManageServiceImpl implements DeviceManageService {
    @Autowired
    private DeviceManageMapper deviceManageMapper;

    HashMap<String, String> mapHeader;
    @Autowired
    private CacheService cacheService;
    @Autowired
    private AuthorizationService authorizationService;
    private String mStrBaseUrl="https://"+ Constants.SERVER+":"+Constants.PORT;
    @Override
    public Map<String, Object> regDevice(String appId, String verifyCode, String nodeId, String endUserId, String psk, Integer timeout, Boolean isSecure)throws Exception {
            mapHeader = cacheService.getObject("mapHeader", HashMap.class);
            boolean flag;
            if (mapHeader==null) {
                String refreshToken = cacheService.getString("refreshToken");
                if (null==refreshToken||"".equals(refreshToken) || refreshToken.length() == 0) {
                    flag=authorizationService.getAccessToken();
                } else {
                    flag= authorizationService.refreshToken();
                }
                if (flag){
                    mapHeader=cacheService.getObject("mapHeader", HashMap.class);
                }
            }
        boolean bValidNodeId = checkParam(nodeId);
        boolean bValidVerifyCode = checkParam(verifyCode);
        if (!bValidNodeId && !bValidVerifyCode) {
            //mLogPrinter.printlnAsError("Register Direct Device, All Param are NULL.");
            return null;
        } else if (!bValidNodeId) {
            nodeId = verifyCode;
        } else if (!bValidVerifyCode) {
            verifyCode = verifyCode;
        }

        // Request URL
        String strUrlRegister = mStrBaseUrl + "/iocm/app/reg/v1.1.0/devices";
        // Param
        Map<String, Object> mParam = new HashMap<String, Object>();
        mParam.put("verifyCode", verifyCode);
        mParam.put("nodeId", nodeId);
        mParam.put("timeout", timeout);
        String strRequest = JsonUtil.jsonObj2Sting(mParam);
        // Send Request
        HttpsUtil httpsUtil=new HttpsUtil();
        httpsUtil.initSSLConfigForTwoWay();
        String strResult = httpsUtil.doPostJsonForString(strUrlRegister, mapHeader, strRequest);

        // Parse Result
        Map<String, Object> mResult = new HashMap<String, Object>();
        mResult = JsonUtil.jsonString2SimpleObj(strResult, mResult.getClass());
        if (mResult.get("error_code") != null) {
            errorHandle(mResult);
            return null;
        }

        // Return Device ID
        return mResult;
    }

    boolean parseResultString(String strResult) throws Exception {
        if (strResult == null || strResult.length() == 0) {
            return true;
        }

        Map<String, Object> mResult = new HashMap<String, Object>();
        mResult = JsonUtil.jsonString2SimpleObj(strResult, mResult.getClass());
        if (mResult.get("error_code") != null) {
            errorHandle(mResult);
            return false;
        } else {
            return true;
        }
    }
    void errorHandle(Map<String, Object> mResult) {
        String strErrCode = mResult.get("error_code").toString();
        String strErrDesc = mResult.get("error_desc").toString();
    }
    boolean checkParam(String strParam) {
        if (strParam == null || strParam.length() == 0) {
            return false;
        }
        return true;
    }
}
