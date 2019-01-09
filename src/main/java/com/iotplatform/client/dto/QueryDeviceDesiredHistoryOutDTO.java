// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QueryDeviceDesiredHistoryOutDTO.java

package com.iotplatform.client.dto;

import java.util.List;

public class QueryDeviceDesiredHistoryOutDTO
{

    public QueryDeviceDesiredHistoryOutDTO()
    {
    }

    public long getTotalCount()
    {
        return totalCount;
    }

    public void setTotalCount(long totalCount)
    {
        this.totalCount = totalCount;
    }

    public long getPageNo()
    {
        return pageNo;
    }

    public void setPageNo(long pageNo)
    {
        this.pageNo = pageNo;
    }

    public long getPageSize()
    {
        return pageSize;
    }

    public void setPageSize(long pageSize)
    {
        this.pageSize = pageSize;
    }

    public List getDeviceDesiredHistory()
    {
        return deviceDesiredHistory;
    }

    public void setDeviceDesiredHistory(List deviceDesiredHistory)
    {
        this.deviceDesiredHistory = deviceDesiredHistory;
    }

    public String toString()
    {
        return (new StringBuilder("QueryDeviceDesiredHistoryOutDTO [totalCount=")).append(totalCount).append(", pageNo=").append(pageNo).append(", pageSize=").append(pageSize).append(", deviceDesiredHistory=").append(deviceDesiredHistory).append("]").toString();
    }

    private long totalCount;
    private long pageNo;
    private long pageSize;
    private List deviceDesiredHistory;
}
