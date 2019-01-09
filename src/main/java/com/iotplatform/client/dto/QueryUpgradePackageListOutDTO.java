// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QueryUpgradePackageListOutDTO.java

package com.iotplatform.client.dto;

import java.util.List;

public class QueryUpgradePackageListOutDTO
{

    public QueryUpgradePackageListOutDTO()
    {
    }

    public List getData()
    {
        return data;
    }

    public void setData(List data)
    {
        this.data = data;
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

    public String toString()
    {
        return (new StringBuilder("QueryUpgradePackageListOutDTO [pageNo=")).append(pageNo).append(", pageSize=").append(pageSize).append(", totalCount=").append(totalCount).append(", data=").append(data).append("]").toString();
    }

    private List data;
    private Integer pageNo;
    private Integer pageSize;
    private Integer totalCount;
}
