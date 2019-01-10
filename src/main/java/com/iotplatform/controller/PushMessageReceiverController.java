package com.iotplatform.controller;

import com.iotplatform.client.dto.*;
import com.iotplatform.service.PushMessageReceiverService;
import com.iotplatform.utils.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PushMessageReceiverController {

    @Autowired
    private PushMessageReceiverService pushMessageReceiverservice;

    @RequestMapping(
            value = {"/v1.0.0/messageReceiver"},
            method = {RequestMethod.POST}
    )
    @ResponseBody
    public String receive(@RequestBody String body) throws Exception {
        pushMessageReceiverservice.handleBody(body);
        if (body.contains("\"notifyType\":\"deviceAdded\"")) {
            pushMessageReceiverservice.handleDeviceAdded((NotifyDeviceAddedDTO) JsonUtil.jsonString2SimpleObj(body, NotifyDeviceAddedDTO.class));
        }

        if (body.contains("\"notifyType\":\"bindDevice\"")) {
            pushMessageReceiverservice.handleBindDevice((NotifyBindDeviceDTO) JsonUtil.jsonString2SimpleObj(body, NotifyBindDeviceDTO.class));
        }

        if (body.contains("\"notifyType\":\"deviceInfoChanged\"")) {
            pushMessageReceiverservice.handleDeviceInfoChanged((NotifyDeviceInfoChangedDTO) JsonUtil.jsonString2SimpleObj(body, NotifyDeviceInfoChangedDTO.class));
        }

        if (body.contains("\"notifyType\":\"deviceDataChanged\"")) {
            pushMessageReceiverservice.handleDeviceDataChanged((NotifyDeviceDataChangedDTO) JsonUtil.jsonString2SimpleObj(body, NotifyDeviceDataChangedDTO.class));
        }

        if (body.contains("\"notifyType\":\"deviceDatasChanged\"")) {
            pushMessageReceiverservice.handleDeviceDatasChanged((NotifyDeviceDatasChangedDTO) JsonUtil.jsonString2SimpleObj(body, NotifyDeviceDatasChangedDTO.class));
        }

        if (body.contains("\"notifyType\":\"serviceInfoChanged\"")) {
            pushMessageReceiverservice.handleServiceInfoChanged((NotifyServiceInfoChangedDTO) JsonUtil.jsonString2SimpleObj(body, NotifyServiceInfoChangedDTO.class));
        }

        if (body.contains("\"notifyType\":\"deviceDeleted\"")) {
            pushMessageReceiverservice.handleDeviceDeleted((NotifyDeviceDeletedDTO) JsonUtil.jsonString2SimpleObj(body, NotifyDeviceDeletedDTO.class));
        }

        if (body.contains("\"notifyType\":\"messageConfirm\"")) {
            pushMessageReceiverservice.handleMessageConfirm((NotifyMessageConfirmDTO) JsonUtil.jsonString2SimpleObj(body, NotifyMessageConfirmDTO.class));
        }

        if (body.contains("\"notifyType\":\"commandRsp\"")) {
            pushMessageReceiverservice.handleCommandRsp((NotifyCommandRspDTO) JsonUtil.jsonString2SimpleObj(body, NotifyCommandRspDTO.class));
        }

        if (body.contains("\"notifyType\":\"deviceEvent\"")) {
            pushMessageReceiverservice.handleDeviceEvent((NotifyDeviceEventDTO) JsonUtil.jsonString2SimpleObj(body, NotifyDeviceEventDTO.class));
        }

        if (body.contains("\"notifyType\":\"deviceModelAdded\"")) {
            pushMessageReceiverservice.handleDeviceModelAdded((NotifyDeviceModelAddedDTO) JsonUtil.jsonString2SimpleObj(body, NotifyDeviceModelAddedDTO.class));
        }

        if (body.contains("\"notifyType\":\"deviceModelDeleted\"")) {
            pushMessageReceiverservice.handleDeviceModelDeleted((NotifyDeviceModelDeletedDTO) JsonUtil.jsonString2SimpleObj(body, NotifyDeviceModelDeletedDTO.class));
        }

        if (body.contains("\"notifyType\":\"ruleEvent\"")) {
            pushMessageReceiverservice.handleRuleEvent((NotifyRuleEventDTO) JsonUtil.jsonString2SimpleObj(body, NotifyRuleEventDTO.class));
        }

        if (body.contains("\"notifyType\":\"deviceDesiredPropertiesModifyStatusChanged\"")) {
            pushMessageReceiverservice.handleDeviceDesiredStatusChanged((NotifyDeviceDesiredStatusChangedDTO) JsonUtil.jsonString2SimpleObj(body, NotifyDeviceDesiredStatusChangedDTO.class));
        }

        if (body.contains("\"notifyType\":\"swUpgradeStateChangeNotify\"")) {
            pushMessageReceiverservice.handleSwUpgradeStateChanged((NotifySwUpgradeStateChangedDTO) JsonUtil.jsonString2SimpleObj(body, NotifySwUpgradeStateChangedDTO.class));
        }

        if (body.contains("\"notifyType\":\"swUpgradeResultNotify\"")) {
            pushMessageReceiverservice.handleSwUpgradeResult((NotifySwUpgradeResultDTO) JsonUtil.jsonString2SimpleObj(body, NotifySwUpgradeResultDTO.class));
        }

        if (body.contains("\"notifyType\":\"fwUpgradeStateChangeNotify\"")) {
            pushMessageReceiverservice.handleFwUpgradeStateChanged((NotifyFwUpgradeStateChangedDTO) JsonUtil.jsonString2SimpleObj(body, NotifyFwUpgradeStateChangedDTO.class));
        }

        if (body.contains("\"notifyType\":\"fwUpgradeResultNotify\"")) {
            pushMessageReceiverservice.handleFwUpgradeResult((NotifyFwUpgradeResultDTO) JsonUtil.jsonString2SimpleObj(body, NotifyFwUpgradeResultDTO.class));
        }

        return "ok";
    }

    @RequestMapping(
            value = {"/v1.0.0/messageReceiver/cmd"},
            method = {RequestMethod.POST}
    )
    @ResponseBody
    public String receiveCmdResult(@RequestBody String body) throws Exception {
        pushMessageReceiverservice.handleBody(body);
        pushMessageReceiverservice.handleNBCommandStateChanged((NotifyNBCommandStatusChangedDTO) JsonUtil.jsonString2SimpleObj(body, NotifyNBCommandStatusChangedDTO.class));
        return "ok";
    }
}
