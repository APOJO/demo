package com.iotplatform.controller;

import com.iotplatform.model.DeviceInfo;
import com.iotplatform.service.SubscribeDeviceNewsService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @ClassName SubscribeDeviceNews
 * @Description
 * @Author xiebifeng
 * @Date 2019/1/4 13:58
 */
@RequestMapping("/subscribe")
@Api(tags = "订阅设备消息")
@RestController
public class SubscribeDeviceNewsController {
    @Autowired
    private SubscribeDeviceNewsService subscribeDeviceNewsService;

    @RequestMapping(value = "/deviceInfoChanged", method = RequestMethod.POST)
    public Map<String, Object> deviceInfoChanged(
            @RequestParam(value = "notifyType", required = false, defaultValue = "") String notifyType,
            @RequestParam(value = "deviceId", required = false, defaultValue = "") String deviceId,
            @RequestParam(value = "gatewayId", required = false, defaultValue = "") String gatewayId,
            DeviceInfo deviceInfo
    ) {

        return subscribeDeviceNewsService.deviceInfoChanged(notifyType,deviceId,gatewayId,deviceInfo);
    }

}
