package com.telecommunication.service.impl;

import com.telecommunication.dao.DeviceManageMapper;
import com.telecommunication.model.Constants;
import com.telecommunication.model.Device;
import com.telecommunication.model.DeviceConfigDTO;
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
     * @return: java.util.Map<java.lang.String                               ,                               java.lang.Object>
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
            device.setNodeId(nodeId);
            device.setCreateTime(new Date());
            device.setUpdateTime(new Date());
            deviceManageMapper.insertDevice(device);
        }
        return mResult;
    }

    /**
     * @Description 刷新验证码
     * @author xiebifeng
     * @date 2019/1/3 19:32
     * @param: [verifyCode, nodeId, appId, deviceId, timeout]
     * @return: java.util.Map<java.lang.String               ,               java.lang.Object>
     */
    @Override
    public Map<String, Object> updateVerifyCode(String verifyCode, String nodeId, String appId, String deviceId, Integer timeout) throws Exception {

        refreshToken();
        String strUrlRegister = mStrBaseUrl + "/iocm/app/reg/v1.1.0/deviceCredentials/" + deviceId;
        // Param
        Map<String, Object> mParam = new HashMap<String, Object>();
        mParam.put("verifyCode", verifyCode);
        mParam.put("nodeId", nodeId);
        mParam.put("timeout", timeout);
        mParam.put("appId", appId);
        String strRequest = JsonUtil.jsonObj2Sting(mParam);
        // Send Request
        HttpsUtil httpsUtil = new HttpsUtil();
        httpsUtil.initSSLConfigForTwoWay();
        String strResult = httpsUtil.doPutJsonForString(strUrlRegister, mapHeader, strRequest);
        Map<String, Object> mResult = new HashMap<String, Object>();
        mResult = JsonUtil.jsonString2SimpleObj(strResult, mResult.getClass());
        if (mResult.get("error_code") != null) {
            return mResult;
        } else {
            Device device = deviceManageMapper.selectByDeviceId(deviceId);
            device.setNodeId(mResult.get("nodeId").toString());
            device.setTimeout(Integer.parseInt(mResult.get("timeout").toString()));
            device.setVerifyCode(mResult.get("verifyCode").toString());
            device.setUpdateTime(new Date());
            deviceManageMapper.updateDevice(device);
        }
        return mResult;
    }

    /**
     * @Description 设备信息更新
     * @author xiebifeng
     * @date 2019/1/4 10:21
     * @param: [deviceId, appId, name, endUser, mute, manufacturerId, manufacturerName, deviceType, model, location, protocolType, deviceConfig, region, organization, timezone, isSecure, psk]
     * @return: java.util.Map<java.lang.String       ,       java.lang.Object>
     */
    @Override
    public Map<String, Object> updateDeviceInfo(String deviceId, String appId, String name, String endUser, Enum mute, String manufacturerId, String manufacturerName, String deviceType, String model, String location, String protocolType, DeviceConfigDTO deviceConfig, String region, String organization, String timezone, Boolean isSecure, String psk) throws Exception {
        refreshToken();
        String strUrlRegister = mStrBaseUrl + "/iocm/app/dm/v1.4.0/devices/" + deviceId;
        // Param
        Map<String, Object> mParam = new HashMap<String, Object>();
        mParam.put("deviceId", deviceId);
        mParam.put("appId", appId);
        mParam.put("name", name);
        mParam.put("endUser", endUser);
        mParam.put("mute", mute);
        mParam.put("manufacturerId", manufacturerId);
        mParam.put("manufacturerName", manufacturerName);
        mParam.put("deviceType", deviceType);
        mParam.put("model", model);
        mParam.put("location", location);
        mParam.put("protocolType", protocolType);
        mParam.put("deviceConfig", deviceConfig);
        mParam.put("region", region);
        mParam.put("organization", organization);
        mParam.put("timezone", timezone);
        mParam.put("isSecure", isSecure);
        mParam.put("psk", psk);
        String strRequest = JsonUtil.jsonObj2Sting(mParam);
        // Send Request
        HttpsUtil httpsUtil = new HttpsUtil();
        httpsUtil.initSSLConfigForTwoWay();
        String strResult = httpsUtil.doPutJsonForString(strUrlRegister, mapHeader, strRequest);
        Map<String, Object> mResult = new HashMap<String, Object>();
        mResult = JsonUtil.jsonString2SimpleObj(strResult, mResult.getClass());
        if (mResult.get("error_code") != null) {
            return mResult;
        } else {

        }
        return mResult;
    }

    /**
     * @Description 删除设备
     * @author xiebifeng
     * @date 2019/1/4 11:34
     * @param: [deviceId, appId]
     * @return: java.util.Map<java.lang.String , java.lang.Object>
     */
    @Override
    public Map<String, Object> deleteDevice(String deviceId, String appId) throws Exception {
        refreshToken();
        String strUrlRegister = mStrBaseUrl + "/iocm/app/dm/v1.4.0/devices/" + deviceId+"?appId="+appId;
        HttpsUtil httpsUtil = new HttpsUtil();
        httpsUtil.initSSLConfigForTwoWay();
        String strResult = httpsUtil.doDeleteForString(strUrlRegister, mapHeader);
        Map<String, Object> mResult = new HashMap<String, Object>();
        mResult = JsonUtil.jsonString2SimpleObj(strResult, mResult.getClass());
        if (mResult.get("error_code") != null) {
            return mResult;
        } else {
        Device device=deviceManageMapper.selectByDeviceId(deviceId);
        if (device!=null){
            int r=deviceManageMapper.deleteDeviceById(deviceId);
            if (r>0){
                mResult.put("deleteFromDB","true");
            }else{
                mResult.put("deleteFromDB","false");
            }
        }
        }
        return mResult;
    }

    @Override
    public Map<String, Object> queryDeviceStatus(String deviceId, String appId) throws Exception {
        refreshToken();
        String strUrlRegister = mStrBaseUrl + "/iocm/app/reg/v1.1.0/deviceCredentials/" + deviceId+"?appId="+appId;
        HttpsUtil httpsUtil = new HttpsUtil();
        httpsUtil.initSSLConfigForTwoWay();
        Map<String, String> mParam = new HashMap<String, String>();
        mParam.put("deviceId", deviceId);
        mParam.put("appId", appId);
        String strResult = httpsUtil.doGetWithParasForString(strUrlRegister, mParam,mapHeader);
        Map<String, Object> mResult = new HashMap<String, Object>();
        mResult = JsonUtil.jsonString2SimpleObj(strResult, mResult.getClass());
        if (mResult.get("error_code") != null) {
            return mResult;
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
