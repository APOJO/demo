package com.telecommunication.service.impl;

import com.telecommunication.dao.DeviceManageMapper;
import com.telecommunication.model.Constants;
import com.telecommunication.model.Device;
import com.telecommunication.service.AuthorizationService;
import com.telecommunication.service.CacheService;
import com.telecommunication.service.DeviceManageService;
import com.telecommunication.util.HttpsUtil;
import com.telecommunication.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
    private String mStrBaseUrl = "https://" + Constants.SERVER + ":" + Constants.PORT;

    /**
     * @Description 设备注册
     * @author xiebifeng
     * @date 2019/1/3 18:53
     * @param: [appId, verifyCode, nodeId, endUserId, psk, timeout, isSecure]
     * @return: java.util.Map<java.lang.String , java.lang.Object>
     */
    @Override
    public Map<String, Object> regDevice(String appId, String verifyCode, String nodeId, String endUserId, String psk, Integer timeout, Boolean isSecure) throws Exception {
        refreshToken();
        boolean bValidNodeId = checkParam(nodeId);
        boolean bValidVerifyCode = checkParam(verifyCode);
        if (!bValidNodeId && !bValidVerifyCode) {
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
        HttpsUtil httpsUtil = new HttpsUtil();
        httpsUtil.initSSLConfigForTwoWay();
        String strResult = httpsUtil.doPostJsonForString(strUrlRegister, mapHeader, strRequest);

        // Parse Result
        Map<String, Object> mResult = new HashMap<String, Object>();
        mResult = JsonUtil.jsonString2SimpleObj(strResult, mResult.getClass());
        if (mResult.get("error_code") != null) {
            return mResult;
        } else {
            Device device = new Device();
            device.setDeviceId(mResult.get("deviceId").toString());
            device.setPsk(mResult.get("psk").toString());
            device.setTimeout(Integer.parseInt(mResult.get("timeout").toString()));
            device.setVerifyCode(mResult.get("verifyCode").toString());
            device.setCreateTime(new Date());
            device.setUpdateTime(new Date());
            deviceManageMapper.insertDevice(device);
        }
        return mResult;
    }


    private void refreshToken() throws java.io.IOException {
        mapHeader = cacheService.getObject("mapHeader", HashMap.class);
        boolean flag;
        if (mapHeader == null) {
            String refreshToken = cacheService.getString("refreshToken");
            if (null == refreshToken || "".equals(refreshToken) || refreshToken.length() == 0) {
                flag = authorizationService.getAccessToken();
            } else {
                flag = authorizationService.refreshToken();
            }
            if (flag) {
                mapHeader = cacheService.getObject("mapHeader", HashMap.class);
            }
        }
    }

    boolean checkParam(String strParam) {
        if (strParam == null || strParam.length() == 0) {
            return false;
        }
        return true;
    }
}
