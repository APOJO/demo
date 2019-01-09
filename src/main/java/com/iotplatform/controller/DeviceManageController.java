package com.iotplatform.controller;

import com.iotplatform.model.DeviceConfigDTO;
import com.iotplatform.service.DeviceManageService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @ClassName DeviceManageController
 * @Description
 * @Author xiebifeng
 * @Date 2019/1/3 13:50
 */
@RequestMapping("/device")
@Api(tags = "设备管理")
@RestController
public class DeviceManageController {
    @Autowired
    private DeviceManageService deviceManageService;

    /**
     * @Description 设备注册
     * @author xiebifeng
     * @date 2019/1/4 10:17
     * @param: [appId, verifyCode, nodeId, endUserId, psk, timeout, isSecure]
     * @return: java.util.Map<java.lang.String               ,               java.lang.Object>
     */
    @RequestMapping(value = "/reg", method = RequestMethod.POST)
    public Map<String, Object> regDevice(
            @RequestParam(value = "appId", required = false, defaultValue = "") String appId,
            @RequestParam(value = "verifyCode", required = false, defaultValue = "") String verifyCode,
            @RequestParam(value = "nodeId", required = false, defaultValue = "") String nodeId,
            @RequestParam(value = "endUserId", required = false, defaultValue = "") String endUserId,
            @RequestParam(value = "psk", required = false, defaultValue = "") String psk,
            @RequestParam(value = "timeout", required = false, defaultValue = "3000") Integer timeout,
            @RequestParam(value = "isSecure", required = false, defaultValue = "false") Boolean isSecure
    ) throws Exception {


        return deviceManageService.regDevice(appId, verifyCode, nodeId, endUserId, psk, timeout, isSecure);
    }

    /**
     * @Description 设备验证码刷新
     * @author xiebifeng
     * @date 2019/1/4 10:18
     * @param: [verifyCode, nodeId, appId, deviceId, timeout]
     * @return: java.util.Map<java.lang.String               ,               java.lang.Object>
     */
    @RequestMapping(value = "/updateVerifyCode", method = RequestMethod.PUT)
    public Map<String, Object> updateVerifyCode(@RequestParam(value = "verifyCode", required = false, defaultValue = "") String verifyCode,
                                                @RequestParam(value = "nodeId", required = false, defaultValue = "") String nodeId,
                                                @RequestParam(value = "appId", required = false, defaultValue = "") String appId,
                                                @RequestParam(value = "deviceId", required = true, defaultValue = "") String deviceId,
                                                @RequestParam(value = "timeout", required = false, defaultValue = "3000") Integer timeout
    ) throws Exception {

        return deviceManageService.updateVerifyCode(verifyCode, nodeId, appId, deviceId, timeout);
    }

    /**
     * @Description 设备信息修改
     * @author xiebifeng
     * @date 2019/1/4 10:18
     * @param: [deviceId, appId, name, endUser, mute, manufacturerId, manufacturerName, deviceType, model, location, protocolType, deviceConfig, region, organization, timezone, isSecure, psk]
     * @return: java.util.Map<java.lang.String               ,               java.lang.Object>
     */
    @RequestMapping(value = "/updateDeviceInfo", method = RequestMethod.PUT)
    public Map<String, Object> updateDeviceInfo(@RequestParam(value = "deviceId", required = true, defaultValue = "") String deviceId,
                                                @RequestParam(value = "appId", required = false, defaultValue = "") String appId,
                                                @RequestParam(value = "name", required = false, defaultValue = "") String name,
                                                @RequestParam(value = "endUser", required = false) String endUser,
                                                 Enum mute,
                                                @RequestParam(value = "manufacturerId", required = false, defaultValue = "") String manufacturerId,
                                                @RequestParam(value = "manufacturerName", required = false, defaultValue = "") String manufacturerName,
                                                @RequestParam(value = "deviceType", required = false, defaultValue = "") String deviceType,
                                                @RequestParam(value = "model", required = false, defaultValue = "") String model,
                                                @RequestParam(value = "location", required = false, defaultValue = "") String location,
                                                @RequestParam(value = "protocolType", required = false, defaultValue = "") String protocolType,
                                                  DeviceConfigDTO deviceConfig,
                                                @RequestParam(value = "region", required = false, defaultValue = "") String region,
                                                @RequestParam(value = "organization", required = false, defaultValue = "") String organization,
                                                @RequestParam(value = "timezone", required = false, defaultValue = "") String timezone,
                                                @RequestParam(value = "isSecure", required = false, defaultValue = "") Boolean isSecure,
                                                @RequestParam(value = "psk", required = false, defaultValue = "") String psk
    ) throws Exception {
        return deviceManageService.updateDeviceInfo(deviceId, appId, name, endUser, mute, manufacturerId,
                manufacturerName, deviceType, model, location, protocolType, deviceConfig, region, organization,
                timezone, isSecure, psk);
    }

    /**
     * @Description 删除设备
     * @author xiebifeng
     * @date 2019/1/4 11:47
     * @param: [appId, deviceId]
     * @return: java.util.Map<java.lang.String   ,   java.lang.Object>
     */
    @RequestMapping(value = "/deleteDevice", method = RequestMethod.DELETE)
    public Map<String, Object> deleteDevice(@RequestParam(value = "appId", required = false, defaultValue = "") String appId,
                                            @RequestParam(value = "deviceId", required = true, defaultValue = "") String deviceId

    ) throws Exception {
        return deviceManageService.deleteDevice(deviceId, appId);
    }

    @RequestMapping(value = "/queryDeviceStatus", method = RequestMethod.GET)
    public Map<String, Object> queryDeviceStatus(@RequestParam(value = "appId", required = false, defaultValue = "") String appId,
                                            @RequestParam(value = "deviceId", required = true, defaultValue = "") String deviceId

    ) throws Exception {
        return deviceManageService.queryDeviceStatus(deviceId, appId);
    }
}
