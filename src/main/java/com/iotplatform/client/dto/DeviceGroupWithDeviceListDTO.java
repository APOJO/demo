// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DeviceGroupWithDeviceListDTO.java

package com.iotplatform.client.dto;

import java.util.List;

public class DeviceGroupWithDeviceListDTO
{

    public DeviceGroupWithDeviceListDTO()
    {
    }

    public String getDevGroupId()
    {
        return devGroupId;
    }

    public void setDevGroupId(String devGroupId)
    {
        this.devGroupId = devGroupId;
    }

    public List getDeviceIds()
    {
        return deviceIds;
    }

    public void setDeviceIds(List deviceIds)
    {
        this.deviceIds = deviceIds;
    }

    public String toString()
    {
        return (new StringBuilder("DeviceGroupWithDeviceListDTO [devGroupId=")).append(devGroupId).append(", deviceIds=").append(deviceIds).append("]").toString();
    }

    private String devGroupId;
    private List deviceIds;
}
