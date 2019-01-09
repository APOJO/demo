// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QueryDataHistoryInDTO.java

package com.iotplatform.client.dto;


/**
 * @deprecated Class QueryDataHistoryInDTO is deprecated
 */

public class QueryDataHistoryInDTO
{

    public QueryDataHistoryInDTO()
    {
    }

    public String getServiceId()
    {
        return serviceId;
    }

    public void setServiceId(String serviceId)
    {
        this.serviceId = serviceId;
    }

    public String getProperty()
    {
        return property;
    }

    public void setProperty(String property)
    {
        this.property = property;
    }

    public String getDeviceId()
    {
        return deviceId;
    }

    public void setDeviceId(String deviceId)
    {
        this.deviceId = deviceId;
    }

    public String getGatewayId()
    {
        return gatewayId;
    }

    public void setGatewayId(String gatewayId)
    {
        this.gatewayId = gatewayId;
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

    public String toString()
    {
        return (new StringBuilder("QueryDataHistoryInDTO [serviceId=")).append(serviceId).append(", property=").append(property).append(", deviceId=").append(deviceId).append(", gatewayId=").append(gatewayId).append(", pageNo=").append(pageNo).append(", pageSize=").append(pageSize).append(", startTime=").append(startTime).append(", endTime=").append(endTime).append("]").toString();
    }

    private String serviceId;
    private String property;
    private String deviceId;
    private String gatewayId;
    private Integer pageNo;
    private Integer pageSize;
    private String startTime;
    private String endTime;
}
