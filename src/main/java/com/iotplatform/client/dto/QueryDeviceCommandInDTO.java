// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QueryDeviceCommandInDTO.java

package com.iotplatform.client.dto;


/**
 * @deprecated Class QueryDeviceCommandInDTO is deprecated
 */

public class QueryDeviceCommandInDTO
{

    public QueryDeviceCommandInDTO()
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

    public String getDeviceId()
    {
        return deviceId;
    }

    public void setDeviceId(String deviceId)
    {
        this.deviceId = deviceId;
    }

    public String getStartTime()
    {
        return startTime;
    }

    public void setStartTime(String startTime)
    {
        this.startTime = startTime;
    }

    public String toString()
    {
        return (new StringBuilder("QueryDeviceCommandInDTO [pageNo=")).append(pageNo).append(", pageSize=").append(pageSize).append(", deviceId=").append(deviceId).append(", startTime=").append(startTime).append("]").toString();
    }

    private Integer pageNo;
    private Integer pageSize;
    private String deviceId;
    private String startTime;
}
