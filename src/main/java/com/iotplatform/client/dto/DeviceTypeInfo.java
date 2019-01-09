// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DeviceTypeInfo.java

package com.iotplatform.client.dto;


public class DeviceTypeInfo
{

    public DeviceTypeInfo()
    {
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

    public String getDeviceType()
    {
        return deviceType;
    }

    public void setDeviceType(String deviceType)
    {
        this.deviceType = deviceType;
    }

    public String getProtocolType()
    {
        return protocolType;
    }

    public void setProtocolType(String protocolType)
    {
        this.protocolType = protocolType;
    }

    public String getPath()
    {
        return path;
    }

    public void setPath(String path)
    {
        this.path = path;
    }

    public String toString()
    {
        return (new StringBuilder("DeviceTypeInfo [manufacturerId=")).append(manufacturerId).append(", model=").append(model).append(", deviceType=").append(deviceType).append(", protocolType=").append(protocolType).append(", path=").append(path).append("]").toString();
    }

    String manufacturerId;
    String model;
    String deviceType;
    String protocolType;
    String path;
}
