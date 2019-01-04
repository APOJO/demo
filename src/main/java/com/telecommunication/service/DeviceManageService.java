package com.telecommunication.service;

import com.telecommunication.model.DeviceConfigDTO;

import java.util.Map;

/**
 * @ClassName DeviceManageService
 * @Description
 * @Author xiebifeng
 * @Date 2019/1/3 13:52
 */
public interface DeviceManageService {
    /**
     * @Description
     * @author xiebifeng
     * @date 2019/1/3 13:54
     * @param:
     * @return:
     */
    Map<String, Object> regDevice(String appId, String verifyCode, String nodeId, String endUserId, String psk, Integer timeout, Boolean isSecure) throws Exception;

    /**
     * @Description 刷新设备验证码
     * @author xiebifeng
     * @date 2019/1/3 19:06
     * @param:
     * @return:
     */

    Map<String, Object> updateVerifyCode(String verifyCode, String nodeId, String appId, String deviceId, Integer timeout) throws Exception;

    /**
     * @Description 修改设备信息
     * @author xiebifeng
     * @date 2019/1/4 10:16
     * @param:
     * @return:
     */

    Map<String, Object> updateDeviceInfo(String deviceId, String appId, String name, String endUser, Enum mute, String manufacturerId, String manufacturerName, String deviceType, String model, String location, String protocolType, DeviceConfigDTO deviceConfig, String region, String organization, String timezone, Boolean isSecure, String psk) throws Exception;

    /**
     * @Description 删除设备
     * @author xiebifeng
     * @date 2019/1/4 11:33
     * @param:
     * @return:
     */

    Map<String, Object> deleteDevice(String deviceId, String appId) throws Exception;

    /**
     * @Description 查询设备激活状态
     * @author xiebifeng
     * @date 2019/1/4 11:49
     * @param:
     * @return:
     */

    Map<String, Object> queryDeviceStatus(String deviceId, String appId) throws Exception;
}
