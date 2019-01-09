// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   NotifyDeviceDesiredStatusChangedDTO.java

package com.iotplatform.client.dto;

import com.fasterxml.jackson.databind.node.ObjectNode;

public class NotifyDeviceDesiredStatusChangedDTO
{

    public NotifyDeviceDesiredStatusChangedDTO()
    {
    }

    public String getNotifyType()
    {
        return notifyType;
    }

    public void setNotifyType(String notifyType)
    {
        this.notifyType = notifyType;
    }

    public String getDeviceId()
    {
        return deviceId;
    }

    public void setDeviceId(String deviceId)
    {
        this.deviceId = deviceId;
    }

    public String getServiceId()
    {
        return serviceId;
    }

    public void setServiceId(String serviceId)
    {
        this.serviceId = serviceId;
    }

    public ObjectNode getProperties()
    {
        return properties;
    }

    public void setProperties(ObjectNode properties)
    {
        this.properties = properties;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String toString()
    {
        return (new StringBuilder("NotifyDeviceDesiredStatusChangedDTO [notifyType=")).append(notifyType).append(", deviceId=").append(deviceId).append(", serviceId=").append(serviceId).append(", properties=").append(properties).append(", status=").append(status).append("]").toString();
    }

    private String notifyType;
    private String deviceId;
    private String serviceId;
    private ObjectNode properties;
    private String status;
}
