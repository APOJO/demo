package com.iotplatform.service.impl;

import com.iotplatform.client.dto.*;
import com.iotplatform.mapper.DeviceInfoMapper;
import com.iotplatform.mapper.DeviceServiceMapper;
import com.iotplatform.mapper.NotifyMapper;
import com.iotplatform.service.PushMessageReceiverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @ClassName PushMessageReceiverServiceImpl
 * @Description
 * @Author xiebifeng
 * @Date 2019/1/8 21:07
 */

@Service
public class PushMessageReceiverServiceImpl implements PushMessageReceiverService {


    @Autowired
    private DeviceInfoMapper deviceInfoMapper;
    @Autowired
    private NotifyMapper notifyMapper;
    @Autowired
    private DeviceServiceMapper deviceServiceMapper;

    @Override
    public void handleBody(String body) {
        System.out.println("handleBody ==> " + body);
    }

    //override the callback functions if needed, otherwise, you can delete them.
    @Override
    public void handleDeviceAdded(NotifyDeviceAddedDTO body) {
        System.out.println("deviceAdded ==> " + body);
        insertNotify(body.getDeviceId(), body.getGatewayId(), body.getNotifyType());
        if (null != body.getDeviceInfo()) {
            //添加设备信息
            DeviceInfo deviceInfo = body.getDeviceInfo();
            deviceInfoMapper.insertSelective(deviceInfo);
        }

    }

    @Override
    public void handleBindDevice(NotifyBindDeviceDTO body) {
        System.out.println("bindDevice ==> " + body);
        insertNotify(body.getDeviceId(), "", body.getNotifyType());
        //TODO deal with BindDevice notification
    }

    @Override
    public void handleDeviceInfoChanged(NotifyDeviceInfoChangedDTO body) {
        System.out.println("deviceInfoChanged ==> " + body);
        //TODO deal with DeviceInfoChanged notification  写入数据库
        insertNotify(body.getDeviceId(), body.getGatewayId(), body.getNotifyType());
        DeviceInfo deviceInfo = deviceInfoMapper.selectByDeviceId(body.getDeviceId());
        deviceInfoMapper.insertChangeSelective(body.getDeviceInfo());
        if(deviceInfo==null){
            DeviceInfo deviceInfo1=new DeviceInfo();
            deviceInfo1.setDeviceId(body.getDeviceId());
            deviceInfoMapper.insertSelective(body.getDeviceInfo());
        }else{
            DeviceInfo deviceInfo1 = body.getDeviceInfo();
            deviceInfo1.setId(deviceInfo.getId());
            deviceInfoMapper.updateByPrimaryKeySelective(deviceInfo1);
        }

    }
    //消息通知类型添加到数据库
    private void insertNotify(String deviceId, String gatewayId, String notifyType) {
        Notify notify = new Notify();
        notify.setCreateTime(new Date());
        notify.setUpdateTime(new Date());
        notify.setDeviceId(deviceId);
        notify.setGatewayId(gatewayId);
        notify.setNotifyType(notifyType);
        notifyMapper.insertSelective(notify);
    }

    @Override
    public void handleDeviceDataChanged(NotifyDeviceDataChangedDTO body) {
        insertNotify(body.getDeviceId(), body.getGatewayId(), body.getNotifyType());
        //TODO 写入数据库
        System.out.println("deviceDataChanged ==> " + body);
        DeviceService service=new DeviceService();
        service.setCreateTime(new Date());
        service.setUpdateTime(new Date());
        service.setData(body.getService().getData());
        service.setDeviceId(body.getDeviceId());
        service.setEventTime(body.getService().getEventTime());
        service.setServiceInfo(body.getService().getServiceInfo());
        service.setServiceType(body.getService().getServiceType());
        deviceServiceMapper.insert(service);
    }

    @Override
    public void handleDeviceDatasChanged(NotifyDeviceDatasChangedDTO body) {
        insertNotify(body.getDeviceId(), body.getGatewayId(), body.getNotifyType());
        System.out.println("deviceDatasChanged ==> " + body);
    }

    @Override
    public void handleServiceInfoChanged(NotifyServiceInfoChangedDTO body) {
        insertNotify(body.getDeviceId(), body.getGatewayId(), body.getNotifyType());
        System.out.println("serviceInfoChanged ==> " + body);
    }

    @Override
    public void handleDeviceDeleted(NotifyDeviceDeletedDTO body) {
        insertNotify(body.getDeviceId(), body.getGatewayId(), body.getNotifyType());
        System.out.println("deviceDeleted ==> " + body);
    }

    @Override
    public void handleMessageConfirm(NotifyMessageConfirmDTO body) {
        System.out.println("messageConfirm ==> " + body);
    }

    @Override
    public void handleCommandRsp(NotifyCommandRspDTO body) {
        System.out.println("commandRsp ==> " + body);
    }

    @Override
    public void handleDeviceEvent(NotifyDeviceEventDTO body) {
        System.out.println("deviceEvent ==> " + body);
    }

    @Override
    public void handleDeviceModelAdded(NotifyDeviceModelAddedDTO body) {
        System.out.println("deviceModelAdded ==> " + body);
    }

    @Override
    public void handleDeviceModelDeleted(NotifyDeviceModelDeletedDTO body) {
        System.out.println("deviceModelDeleted ==> " + body);
    }

    @Override
    public void handleRuleEvent(NotifyRuleEventDTO body) {
        System.out.println("ruleEvent ==> " + body);
    }

    @Override
    public void handleDeviceDesiredStatusChanged(NotifyDeviceDesiredStatusChangedDTO body) {
        System.out.println("deviceDesiredStatusChanged ==> " + body);
    }

    @Override
    public void handleSwUpgradeStateChanged(NotifySwUpgradeStateChangedDTO body) {
        System.out.println("swUpgradeStateChanged ==> " + body);
    }

    @Override
    public void handleSwUpgradeResult(NotifySwUpgradeResultDTO body) {
        System.out.println("swUpgradeResult ==> " + body);
    }

    @Override
    public void handleFwUpgradeStateChanged(NotifyFwUpgradeStateChangedDTO body) {
        System.out.println("fwUpgradeStateChanged ==> " + body);
    }

    @Override
    public void handleFwUpgradeResult(NotifyFwUpgradeResultDTO body) {
        System.out.println("fwUpgradeResult ==> " + body);
    }

    @Override
    public void handleNBCommandStateChanged(NotifyNBCommandStatusChangedDTO body) {
        System.out.println("NBCommandStateChanged ==> " + body);
    }
}
