// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   NotifyDeviceModelAddedDTO.java

package com.iotplatform.client.dto;


public class NotifyDeviceModelAddedDTO
{

    public NotifyDeviceModelAddedDTO()
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

    public String getAppId()
    {
        return appId;
    }

    public void setAppId(String appId)
    {
        this.appId = appId;
    }

    public String getDeviceType()
    {
        return deviceType;
    }

    public void setDeviceType(String deviceType)
    {
        this.deviceType = deviceType;
    }

    public String getManufacturerName()
    {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName)
    {
        this.manufacturerName = manufacturerName;
    }

    public String getManufacturerId()
    {
        return manufacturerId;
    }

    public void setManufacturerId(String manufacturerId)
    {
        this.manufacturerId = manufacturerId;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getProtocolType()
    {
        return protocolType;
    }

    public void setProtocolType(String protocolType)
    {
        this.protocolType = protocolType;
    }

    public String toString()
    {
        return (new StringBuilder("NotifyDeviceModelAddedDTO [notifyType=")).append(notifyType).append(", appId=").append(appId).append(", deviceType=").append(deviceType).append(", manufacturerName=").append(manufacturerName).append(", manufacturerId=").append(manufacturerId).append(", model=").append(model).append(", protocolType=").append(protocolType).append("]").toString();
    }

    private String notifyType;
    private String appId;
    private String deviceType;
    private String manufacturerName;
    private String manufacturerId;
    private String model;
    private String protocolType;
}
