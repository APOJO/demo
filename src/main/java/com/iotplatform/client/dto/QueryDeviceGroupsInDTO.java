// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QueryDeviceGroupsInDTO.java

package com.iotplatform.client.dto;


public class QueryDeviceGroupsInDTO
{

    public QueryDeviceGroupsInDTO()
    {
    }

    public String getAccessAppId()
    {
        return accessAppId;
    }

    public void setAccessAppId(String accessAppId)
    {
        this.accessAppId = accessAppId;
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

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return (new StringBuilder("QueryDeviceGroupsInDTO [accessAppId=")).append(accessAppId).append(", pageNo=").append(pageNo).append(", pageSize=").append(pageSize).append(", name=").append(name).append("]").toString();
    }

    private String accessAppId;
    private Integer pageNo;
    private Integer pageSize;
    private String name;
}
