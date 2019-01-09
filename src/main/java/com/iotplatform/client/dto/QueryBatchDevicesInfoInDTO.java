// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QueryBatchDevicesInfoInDTO.java

package com.iotplatform.client.dto;


public class QueryBatchDevicesInfoInDTO
{

    public QueryBatchDevicesInfoInDTO()
    {
    }

    public String getAppId()
    {
        return appId;
    }

    public void setAppId(String appId)
    {
        this.appId = appId;
    }

    public String getGatewayId()
    {
        return gatewayId;
    }

    public void setGatewayId(String gatewayId)
    {
        this.gatewayId = gatewayId;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getNodeType()
    {
        return nodeType;
    }

    public void setNodeType(String nodeType)
    {
        this.nodeType = nodeType;
    }

    public String getDeviceType()
    {
        return deviceType;
    }

    public void setDeviceType(String deviceType)
    {
        this.deviceType = deviceType;
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

    public String getSort()
    {
        return sort;
    }

    public void setSort(String sort)
    {
        this.sort = sort;
    }

    public String getSelect()
    {
        return select;
    }

    public void setSelect(String select)
    {
        this.select = select;
    }

    public String toString()
    {
        return (new StringBuilder("QueryDevicesInDTO [appId=")).append(appId).append(", gatewayId=").append(gatewayId).append(", status=").append(status).append(", nodeType=").append(nodeType).append(", deviceType=").append(deviceType).append(", pageNo=").append(pageNo).append(", pageSize=").append(pageSize).append(", startTime=").append(startTime).append(", endTime=").append(endTime).append(", sort=").append(sort).append(", select=").append(select).append("]").toString();
    }

    private String appId;
    private String gatewayId;
    private String status;
    private String nodeType;
    private String deviceType;
    private Integer pageNo;
    private Integer pageSize;
    private String startTime;
    private String endTime;
    private String sort;
    private String select;
}
