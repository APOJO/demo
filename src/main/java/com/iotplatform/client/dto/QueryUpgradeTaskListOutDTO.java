// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QueryUpgradeTaskListOutDTO.java

package com.iotplatform.client.dto;

import java.util.List;

public class QueryUpgradeTaskListOutDTO
{

    public QueryUpgradeTaskListOutDTO()
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

    public Integer getTotalSize()
    {
        return totalSize;
    }

    public void setTotalSize(Integer totalSize)
    {
        this.totalSize = totalSize;
    }

    public List getData()
    {
        return data;
    }

    public void setData(List data)
    {
        this.data = data;
    }

    public String toString()
    {
        return (new StringBuilder("QueryUpgradeTaskListOutDTO [pageNo=")).append(pageNo).append(", pageSize=").append(pageSize).append(", totalSize=").append(totalSize).append(", data=").append(data).append("]").toString();
    }

    private Integer pageNo;
    private Integer pageSize;
    private Integer totalSize;
    private List data;
}
