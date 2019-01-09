package com.iotplatform.controller;

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

    @RequestMapping(value = "/notification", method = RequestMethod.POST)
    public Map<String, Object> notification(
            @RequestParam(value = "callbackUrl", required = true, defaultValue = "") String callbackUrl,
            @RequestParam(value = "notifyType", required = true, defaultValue = "") String notifyType
    )throws Exception {
        return subscribeDeviceNewsService.notification(callbackUrl,notifyType);
    }

    @RequestMapping(value = "/querySingle", method = RequestMethod.POST)
    public Map<String, Object> querySingle(
            @RequestParam(value = "subscriptionId", required = true, defaultValue = "") String subscriptionId,
            @RequestParam(value = "appId", required = false, defaultValue = "") String appId
    )throws Exception {
        return subscribeDeviceNewsService.querySingle(subscriptionId,appId);
    }


    @RequestMapping(value = "/deleteSingle", method = RequestMethod.POST)
    public Map<String, Object> deleteSingle(
            @RequestParam(value = "subscriptionId", required = true, defaultValue = "") String subscriptionId
    )throws Exception {
        return subscribeDeviceNewsService.deleteSingle(subscriptionId);
    }


    @RequestMapping(value = "/queryBatch", method = RequestMethod.POST)
    public Map<String, Object> queryBatch(
    )throws Exception {
        return subscribeDeviceNewsService.queryBatch();
    }


}
