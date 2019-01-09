// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CreateDeviceGroupInDTO.java

package com.iotplatform.client.dto;

import java.util.List;

public class CreateDeviceGroupInDTO
{

    public CreateDeviceGroupInDTO()
    {
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getAppId()
    {
        return appId;
    }

    public void setAppId(String appId)
    {
        this.appId = appId;
    }

    public Integer getMaxDevNum()
    {
        return maxDevNum;
    }

    public void setMaxDevNum(Integer maxDevNum)
    {
        this.maxDevNum = maxDevNum;
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
        return (new StringBuilder("CreateDeviceGroupInDTO [name=")).append(name).append(", description=").append(description).append(", appId=").append(appId).append(", maxDevNum=").append(maxDevNum).append(", deviceIds=").append(deviceIds).append("]").toString();
    }

    private String name;
    private String description;
    private String appId;
    private Integer maxDevNum;
    private List deviceIds;
}
