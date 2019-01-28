package com.iotplatform.service.impl;

import com.aliyuncs.exceptions.ClientException;
import com.iotplatform.client.dto.*;
import com.iotplatform.mapper.DeviceInfoMapper;
import com.iotplatform.mapper.DeviceServiceMapper;
import com.iotplatform.mapper.NotifyMapper;
import com.iotplatform.mapper.ServiceInfoMapper;
import com.iotplatform.model.DeviceServiceSub;
import com.iotplatform.model.ServiceInfoSub;
import com.iotplatform.model.testDEV;
import com.iotplatform.service.DeviceManageService;
import com.iotplatform.service.PushMessageReceiverService;
import com.iotplatform.vms.VmsDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

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
    @Autowired
    private ServiceInfoMapper serviceInfoMapper;
    @Autowired
    private DeviceManageService deviceManageService;

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
        //根据设备nodeId查找设备
        DeviceInfo deviceInfo = deviceInfoMapper.selectByDeviceId(body.getDeviceInfo().getNodeId());
        //添加一条变更记录
        deviceInfoMapper.insertChangeSelective(body.getDeviceInfo());
        if (deviceInfo == null) {
            //如果设备没找到就添加一条数据
            deviceInfoMapper.insert(body.getDeviceInfo());
        } else {
            //修改设备信息，更新数据库
            DeviceInfo deviceInfo1 = body.getDeviceInfo();
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
        System.out.println("deviceDataChanged ==> " + body);
        //将设备信息转换
        DeviceServiceSub service = new DeviceServiceSub();
        service.setServiceId(body.getService().getServiceId());
        service.setCreateTime(new Date());
        service.setUpdateTime(new Date());
        service.setData(body.getService().getData());
        if(body.getService().getData()!=null){
            service.setDataStr(body.getService().getData().toString());
        }
        service.setDeviceId(body.getDeviceId());
        service.setEventTime(body.getService().getEventTime());
        service.setServiceType(body.getService().getServiceType());
        //将信息写入数据库
        deviceServiceMapper.insert(service);
        //判断有无设备服务信息。有则入库
        if (null != body.getService().getServiceInfo()) {
            ServiceInfoSub serviceInfo = new ServiceInfoSub();
            serviceInfo.setServiceId(service.getServiceId());
            serviceInfoMapper.insertSelective(serviceInfo);
        }
        //判断报警
        System.out.println("===========serviceType="+body.getService().getServiceType()+"============");
        System.out.println("============serviceDataStr="+body.getService().getData().toString()+"============");
        System.out.println("============报警判断="+(body.getService().getServiceType().equals("BizType")&&body.getService().getData().toString().equals("{\"Biz_Type\":1,\"BizData\":1}"))+"============");
        if (body.getService().getServiceType().equals("BizType")&&body.getService().getData().toString().equals("{\"Biz_Type\":1,\"BizData\":1}")) {
            System.out.println("=============进入报警==================");
            call(body);
            System.out.println("=============完成报警==================");
        }

    }

    /**
     * PushMessageReceiverServiceImpl
     * @author  Arlen
     * @date    2019/1/22 13:12
     * @params
     * @return
     */
    private void call(NotifyDeviceDataChangedDTO body) {
        //获取注册设备信息 设备编号等

        //创建报警通知对象
        ArrayList<testDEV> testDEVS = new ArrayList<>();
        testDEVS.add(new testDEV("贾彬彬", "f511f319-9dc7-4e05-bf74-9fdcf59cf258", new String[]{"15614175320"}, "天滋嘉鲤商务中心A座1403厨房"));
        testDEVS.add(new testDEV("王磊", "f511f319-9dc7-4e05-bf74-9fdcf59cf258", new String[]{"15032865101"}, "创新大厦5楼"));
//       用户数据
        testDEVS.add(new testDEV("宫连巧", "4a0481c2-6e7a-4644-aef6-886daa0ff5af", new String[]{"15373969682","17743786925"}, "兴顺路24号"));
        testDEVS.add(new testDEV("宫连巧2", "4a0481c2-6e7a-4644-aef6-886daa0ff5af", new String[]{"17743786925"}, "兴顺路24号"));
        testDEVS.add(new testDEV("宫海云", "62b02808-40a6-4713-b6c7-18ac590225a5", new String[]{"15373631839"}, "富强三巷13号"));
        testDEVS.add(new testDEV("宫文亮", "2ab635ef-41b7-49ac-8b92-e9414cf21e2c", new String[]{"13703219367"}, "丁香路19号"));
        testDEVS.add(new testDEV("吴风路", "b22e2170-a559-4e2c-9da1-ebcbbf77d693", new String[]{"13073109528","13930103233"}, "平和路19号"));
        testDEVS.add(new testDEV("吴风路2", "b22e2170-a559-4e2c-9da1-ebcbbf77d693", new String[]{"13930103233"}, "平和路19号"));
        testDEVS.add(new testDEV("金立峰", "d66fb0c6-37e1-46de-8f77-90fd2c553dd4", new String[]{"15033725602","18132058536"}, "兴顺路13号"));
        testDEVS.add(new testDEV("金立峰2", "d66fb0c6-37e1-46de-8f77-90fd2c553dd4", new String[]{"18132058536"}, "兴顺路13号"));
        testDEVS.add(new testDEV("王充献", "5588f4af-945b-4cd5-a509-f9f0b7ba464d", new String[]{"13933166088","15100319996"}, "文明路29号"));
        testDEVS.add(new testDEV("王充献2", "5588f4af-945b-4cd5-a509-f9f0b7ba464d", new String[]{"15100319996"}, "文明路29号"));
        testDEVS.add(new testDEV("张雪霞", "89c814a2-4879-41fd-a572-c5a992e4b07d", new String[]{"15830685796","17367735796"}, "同盟路23号"));
        testDEVS.add(new testDEV("张雪霞2", "89c814a2-4879-41fd-a572-c5a992e4b07d", new String[]{"17367735796"}, "同盟路23号"));
        testDEVS.add(new testDEV("王卫国", "6bc40132-63fd-4a16-a0d6-a167ba1e6df2", new String[]{"13785194811","13315959756"}, "无影山巷11号"));
        testDEVS.add(new testDEV("王卫国2", "6bc40132-63fd-4a16-a0d6-a167ba1e6df2", new String[]{"13315959756"}, "无影山巷11号"));

        for (testDEV td:
             testDEVS) {
            //通知指定用户
            if (td.getDevID().equals(body.getDeviceId())) {
                System.out.println("---------START-------开始通知"+td.getUserName()+",电话"+td.getPhoneList()[0]+"--------------------");
                try {
                    //拼装外呼信息
                    String showNumber = "031166857110";
                    String number = td.getPhoneList()[0];
                    String ttsID = "TTS_112470691";
                    HashMap<String, Object> templateParam = new HashMap<>();
                    templateParam.put("police_type", "燃气");
                    templateParam.put("address", td.getAddr());
                    //调用外呼方法
                    try {
                        new VmsDemo().call(showNumber, number, ttsID, templateParam);
                        System.out.println("-----------END-----完成对"+td.getUserName()+"的通知,通知电话为"+td.getPhoneList()[0]+"--------------------");
                    } catch (ClientException e) {
                        e.printStackTrace();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
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
