// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CreateDeviceCmdCancelTaskOutDTO.java

package com.iotplatform.client.dto;

import java.util.List;

public class CreateDeviceCmdCancelTaskOutDTO
{

    public CreateDeviceCmdCancelTaskOutDTO()
    {
    }

    public String getTaskId()
    {
        return taskId;
    }

    public void setTaskId(String taskId)
    {
        this.taskId = taskId;
    }

    public String getAppId()
    {
        return appId;
    }

    public void setAppId(String appId)
    {
        this.appId = appId;
    }

    public String getDeviceId()
    {
        return deviceId;
    }

    public void setDeviceId(String deviceId)
    {
        this.deviceId = deviceId;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public Integer getTotalCount()
    {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount)
    {
        this.totalCount = totalCount;
    }

    public List getDeviceCommands()
    {
        return deviceCommands;
    }

    public void setDeviceCommands(List deviceCommands)
    {
        this.deviceCommands = deviceCommands;
    }

    public String toString()
    {
        return (new StringBuilder("CreateDeviceCmdCancelTaskOutDTO [taskId=")).append(taskId).append(", appId=").append(appId).append(", deviceId=").append(deviceId).append(", status=").append(status).append(", totalCount=").append(totalCount).append(", deviceCommands=").append(deviceCommands).append("]").toString();
    }

    private String taskId;
    private String appId;
    private String deviceId;
    private String status;
    private Integer totalCount;
    private List deviceCommands;
}
