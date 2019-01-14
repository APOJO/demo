package com.iotplatform.model;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.iotplatform.client.dto.DeviceService;
import com.iotplatform.client.dto.ServiceInfo;

import java.util.Date;

/**
 * @ClassName DeviceServiceSub
 * @Description
 * @Author xiebifeng
 * @Date 2019/1/14 19:32
 */
public class DeviceServiceSub extends DeviceService {

    private Date createTime;
    private Date updateTime;
    private Integer id;
    private String deviceId;
    private String dataStr;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDataStr() {
        return dataStr;
    }

    public void setDataStr(String dataStr) {
        this.dataStr = super.getData().toString();
    }

    public DeviceServiceSub() {
        super();
    }

    @Override
    public String getServiceId() {
        return super.getServiceId();
    }

    @Override
    public void setServiceId(String serviceId) {
        super.setServiceId(serviceId);
    }

    @Override
    public String getServiceType() {
        return super.getServiceType();
    }

    @Override
    public void setServiceType(String serviceType) {
        super.setServiceType(serviceType);
    }

    @Override
    public ObjectNode getData() {
        return super.getData();
    }

    @Override
    public void setData(ObjectNode data) {
        super.setData(data);
    }

    @Override
    public String getEventTime() {
        return super.getEventTime();
    }

    @Override
    public void setEventTime(String eventTime) {
        super.setEventTime(eventTime);
    }

    @Override
    public ServiceInfo getServiceInfo() {
        return super.getServiceInfo();
    }

    @Override
    public void setServiceInfo(ServiceInfo serviceInfo) {
        super.setServiceInfo(serviceInfo);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
