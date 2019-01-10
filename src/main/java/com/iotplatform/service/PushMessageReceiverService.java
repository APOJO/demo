package com.iotplatform.service;

import com.iotplatform.client.dto.*;

/**
 * @ClassName PushMessageReceiverService
 * @Description
 * @Author xiebifeng
 * @Date 2019/1/10 16:02
 */
public interface PushMessageReceiverService {

    void handleBody(String body) ;

    void handleDeviceDeleted(NotifyDeviceDeletedDTO body);

    void handleServiceInfoChanged(NotifyServiceInfoChangedDTO body);

    void handleDeviceDatasChanged(NotifyDeviceDatasChangedDTO body);

    void handleDeviceDataChanged(NotifyDeviceDataChangedDTO body);

    void handleDeviceInfoChanged(NotifyDeviceInfoChangedDTO body);

    void handleBindDevice(NotifyBindDeviceDTO body);

    void handleDeviceAdded(NotifyDeviceAddedDTO body);

    void handleMessageConfirm(NotifyMessageConfirmDTO body);

    void handleCommandRsp(NotifyCommandRspDTO body);

    void handleDeviceEvent(NotifyDeviceEventDTO body);

    void handleDeviceModelAdded(NotifyDeviceModelAddedDTO body);

    void handleDeviceModelDeleted(NotifyDeviceModelDeletedDTO body);

    void handleRuleEvent(NotifyRuleEventDTO body);

    void handleDeviceDesiredStatusChanged(NotifyDeviceDesiredStatusChangedDTO body);

    void handleSwUpgradeStateChanged(NotifySwUpgradeStateChangedDTO body);

    void handleSwUpgradeResult(NotifySwUpgradeResultDTO body);

    void handleFwUpgradeStateChanged(NotifyFwUpgradeStateChangedDTO body);

    void handleFwUpgradeResult(NotifyFwUpgradeResultDTO body);

    void handleNBCommandStateChanged(NotifyNBCommandStatusChangedDTO body);
}
