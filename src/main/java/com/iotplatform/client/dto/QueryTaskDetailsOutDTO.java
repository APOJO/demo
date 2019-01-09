// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QueryTaskDetailsOutDTO.java

package com.iotplatform.client.dto;

import java.util.List;

public class QueryTaskDetailsOutDTO
{

    public QueryTaskDetailsOutDTO()
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

    public List getTaskDetails()
    {
        return taskDetails;
    }

    public void setTaskDetails(List taskDetails)
    {
        this.taskDetails = taskDetails;
    }

    public String toString()
    {
        return (new StringBuilder("QueryTaskDetailsOutDTO [totalCount=")).append(totalCount).append(", pageNo=").append(pageNo).append(", pageSize=").append(pageSize).append(", taskDetails=").append(taskDetails).append("]").toString();
    }

    private long totalCount;
    private long pageNo;
    private long pageSize;
    private List taskDetails;
}
