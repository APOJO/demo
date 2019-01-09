// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OperateDevices.java

package com.iotplatform.client.dto;

import java.util.List;

public class OperateDevices
{

    public OperateDevices()
    {
    }

    public String getDeviceType()
    {
        return deviceType;
    }

    public void setDeviceType(String deviceType)
    {
        this.deviceType = deviceType;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getManufacturerName()
    {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName)
    {
        this.manufacturerName = manufacturerName;
    }

    public List getDeviceGroups()
    {
        return deviceGroups;
    }

    public void setDeviceGroups(List deviceGroups)
    {
        this.deviceGroups = deviceGroups;
    }

    public List getDevices()
    {
        return devices;
    }

    public void setDevices(List devices)
    {
        this.devices = devices;
    }

    public String toString()
    {
        return (new StringBuilder("OperateDevices [deviceType=")).append(deviceType).append(", model=").append(model).append(", manufacturerName=").append(manufacturerName).append(", deviceGroups=").append(deviceGroups).append(", devices=").append(devices).append("]").toString();
    }

    private String deviceType;
    private String model;
    private String manufacturerName;
    private List deviceGroups;
    private List devices;
}
