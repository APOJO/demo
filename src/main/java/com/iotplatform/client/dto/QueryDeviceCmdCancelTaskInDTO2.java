// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QueryDeviceCmdCancelTaskInDTO2.java

package com.iotplatform.client.dto;


public class QueryDeviceCmdCancelTaskInDTO2
{

    public QueryDeviceCmdCancelTaskInDTO2()
    {
    }

    public Integer getPageNo()
    {
        return pageNo;
    }

    public void setPageNo(Integer pageNo)
    {
        this.pageNo = pageNo;
    }

    public Integer getPageSize()
    {
        return pageSize;
    }

    public void setPageSize(Integer pageSize)
    {
        this.pageSize = pageSize;
    }

    public String getTaskId()
    {
        return taskId;
    }

    public void setTaskId(String taskId)
    {
        this.taskId = taskId;
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

    public String getStartTime()
    {
        return startTime;
    }

    public void setStartTime(String startTime)
    {
        this.startTime = startTime;
    }

    public String getEndTime()
    {
        return endTime;
    }

    public void setEndTime(String endTime)
    {
        this.endTime = endTime;
    }

    public String getAppId()
    {
        return appId;
    }

    public void setAppId(String appId)
    {
        this.appId = appId;
    }

    public String toString()
    {
        return (new StringBuilder("QueryDeviceCmdCancelTaskInDTO2 [pageNo=")).append(pageNo).append(", pageSize=").append(pageSize).append(", taskId=").append(taskId).append(", deviceId=").append(deviceId).append(", status=").append(status).append(", startTime=").append(startTime).append(", endTime=").append(endTime).append(", appId=").append(appId).append("]").toString();
    }

    private Integer pageNo;
    private Integer pageSize;
    private String taskId;
    private String deviceId;
    private String status;
    private String startTime;
    private String endTime;
    private String appId;
}
