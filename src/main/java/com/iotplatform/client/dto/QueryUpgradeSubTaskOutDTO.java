// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QueryUpgradeSubTaskOutDTO.java

package com.iotplatform.client.dto;

import java.util.List;

public class QueryUpgradeSubTaskOutDTO
{

    public QueryUpgradeSubTaskOutDTO()
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

    public Integer getTotalCount()
    {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount)
    {
        this.totalCount = totalCount;
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
        return (new StringBuilder("QueryUpgradeSubTaskOutDTO [pageNo=")).append(pageNo).append(", pageSize=").append(pageSize).append(", totalCount=").append(totalCount).append(", data=").append(data).append("]").toString();
    }

    private Integer pageNo;
    private Integer pageSize;
    private Integer totalCount;
    private List data;
}
