package com.iotplatform.service.impl;

import com.iotplatform.client.NorthApiClient;
import com.iotplatform.client.NorthApiException;
import com.iotplatform.client.dto.*;
import com.iotplatform.client.invokeapi.Authentication;
import com.iotplatform.client.invokeapi.DeviceManagement;
import com.iotplatform.client.invokeapi.SubscriptionManagement;
import com.iotplatform.mapper.DeviceManageMapper;
import com.iotplatform.model.Constants;
import com.iotplatform.model.Device;
import com.iotplatform.model.DeviceConfigDTO;
import com.iotplatform.service.AuthorizationService;
import com.iotplatform.service.CacheService;
import com.iotplatform.service.DeviceManageService;
import com.iotplatform.utils.AuthUtil;
import com.iotplatform.utils.HttpsUtil;
import com.iotplatform.utils.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

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
    private NorthApiClient northApiClient = AuthUtil.initApiClient();
    private Authentication authentication = new Authentication(northApiClient);;
    private DeviceManagement deviceManagement = new DeviceManagement(northApiClient);;
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
        Map<String, Object> map = new HashMap<>();
        AuthOutDTO authOutDTO = authentication.getAuthToken();
        String accessToken = authOutDTO.getAccessToken();
        RegDirectDeviceInDTO2 directDeviceInDTO2 = new RegDirectDeviceInDTO2();

        boolean bValidNodeId = checkParam(nodeId);
        boolean bValidVerifyCode = checkParam(verifyCode);
        if (!bValidNodeId && !bValidVerifyCode) {
            return null;
        } else if (!bValidNodeId) {
            nodeId = verifyCode;
        } else if (!bValidVerifyCode) {
            verifyCode = verifyCode;
        }
        directDeviceInDTO2.setNodeId(nodeId);
        directDeviceInDTO2.setVerifyCode(verifyCode);
        directDeviceInDTO2.setTimeout(timeout);
        directDeviceInDTO2.setEndUserId(endUserId);
        directDeviceInDTO2.setIsSecure(isSecure);
        try {
            RegDirectDeviceOutDTO rddod = deviceManagement.regDirectDevice(directDeviceInDTO2, null, accessToken);
            if (rddod!=null){
                int reslut=deviceManageMapper.insertRegDirectDeviceOutDTO(rddod);
                if (reslut>0){
                    map.put("code",200);
                    map.put("msg","设备注册成功");
                }else{
                    map.put("code",500);
                    map.put("msg","设备注册失败");
                }
            }
        } catch (NorthApiException e) {
            map.put("error_massage",e);
        }


      return map;
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
        Map<String, Object> map = new HashMap<>();
        AuthOutDTO authOutDTO = authentication.getAuthToken();
        String accessToken = authOutDTO.getAccessToken();
        RefreshDeviceKeyInDTO rdkInDTO = new RefreshDeviceKeyInDTO();
        rdkInDTO.setNodeId(nodeId);
        rdkInDTO.setVerifyCode(verifyCode);
        rdkInDTO.setTimeout(timeout);
        try {
            RefreshDeviceKeyOutDTO rdkOutDTO = deviceManagement.refreshDeviceKey(rdkInDTO, deviceId, appId, accessToken);
            Device device = deviceManageMapper.selectByDeviceId(deviceId);
            device.setVerifyCode(rdkOutDTO.getVerifyCode());
            device.setUpdateTime(new Date());
            int result=deviceManageMapper.updateDevice(device);
            if (result>0){
                map.put("code",200);
                map.put("msg","刷新成功");
                map.put("rdkOutDTO",rdkOutDTO);
            }else{
                map.put("code",500);
                map.put("msg","刷新失败");
            }
        } catch (NorthApiException e) {
            map.put("error_massage",e);
        }
        return map;

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
        Map<String, Object> map = new HashMap<>();

        AuthOutDTO authOutDTO = authentication.getAuthToken();
        String accessToken = authOutDTO.getAccessToken();
        Device device=deviceManageMapper.selectByDeviceId(deviceId);
        if (device!=null){
            int r=deviceManageMapper.deleteDeviceById(deviceId);
            if (r>0){
                map.put("deleteFromDB","true");
            }else{
                map.put("deleteFromDB","false");
            }
        }
        try {
            deviceManagement.deleteDirectDevice(deviceId, true, appId, accessToken);
        }catch (Exception e){
            map.put("error_massage",e);
        }
        return map;
    }

    @Override
    public Map<String, Object> queryDeviceStatus(String deviceId, String appId) throws Exception {
        Map<String, Object> map=new HashMap<>();
        AuthOutDTO authOutDTO = authentication.getAuthToken();
        String accessToken = authOutDTO.getAccessToken();
        if (deviceId!=null&&!"".equals(deviceId)){
            QueryDeviceStatusOutDTO qdsOutDTO = deviceManagement.queryDeviceStatus(deviceId, appId, accessToken);
            map.put("qdsOutDTO",qdsOutDTO);
        }
        return map;
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
