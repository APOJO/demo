// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QueryDeviceGroupMembersInDTO.java

package com.iotplatform.client.dto;


public class QueryDeviceGroupMembersInDTO
{

    public QueryDeviceGroupMembersInDTO()
    {
    }

    public String getDevGroupId()
    {
        return devGroupId;
    }

    public void setDevGroupId(String devGroupId)
    {
        this.devGroupId = devGroupId;
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

    public String toString()
    {
        return (new StringBuilder("QueryDeviceGroupMembersInDTO [devGroupId=")).append(devGroupId).append(", accessAppId=").append(accessAppId).append(", pageNo=").append(pageNo).append(", pageSize=").append(pageSize).append("]").toString();
    }

    private String devGroupId;
    private String accessAppId;
    private Integer pageNo;
    private Integer pageSize;
}
