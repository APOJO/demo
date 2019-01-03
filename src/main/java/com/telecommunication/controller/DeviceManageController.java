package com.telecommunication.controller;

import com.telecommunication.service.DeviceManageService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping(value = "/reg", method = RequestMethod.POST)
    public Map<String, Object> regDevice(
            @RequestParam(value = "appId", required = false, defaultValue = "") String appId,
            @RequestParam(value = "verifyCode", required = false, defaultValue = "") String verifyCode,
            @RequestParam(value = "nodeId", required = false, defaultValue = "") String nodeId,
            @RequestParam(value = "endUserId", required = false, defaultValue = "") String endUserId,
            @RequestParam(value = "psk", required = false, defaultValue = "") String psk,
            @RequestParam(value = "timeout", required = false, defaultValue = "180") Integer timeout,
            @RequestParam(value = "isSecure", required = false, defaultValue = "false") Boolean isSecure
    ) throws Exception {
        return deviceManageService.regDevice(appId, verifyCode, nodeId, endUserId, psk, timeout, isSecure);
    }
    @RequestMapping(value = "/updateVerifyCode", method = RequestMethod.PUT)
    public Map<String, Object> updateVerifyCode(@RequestParam(value = "verifyCode", required = false, defaultValue = "") String verifyCode,
                                                @RequestParam(value = "nodeId", required = true, defaultValue = "") String nodeId,
                                                @RequestParam(value = "appId", required = false, defaultValue = "") String appId,
                                                @RequestParam(value = "deviceId", required = false, defaultValue = "") String deviceId,
                                                @RequestParam(value = "timeout", required = false, defaultValue = "180") Integer timeout
    ) throws Exception {
        return deviceManageService.updateVerifyCode(verifyCode, nodeId, appId, deviceId, timeout);
    }
}
