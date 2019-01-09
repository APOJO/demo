// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QueryUpgradeSubTaskInDTO.java

package com.iotplatform.client.dto;


public class QueryUpgradeSubTaskInDTO
{

    public QueryUpgradeSubTaskInDTO()
    {
    }

    public String getSubOperationStatus()
    {
        return subOperationStatus;
    }

    public void setSubOperationStatus(String subOperationStatus)
    {
        this.subOperationStatus = subOperationStatus;
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
        return (new StringBuilder("QueryUpgradeSubTaskInDTO [subOperationStatus=")).append(subOperationStatus).append(", pageNo=").append(pageNo).append(", pageSize=").append(pageSize).append("]").toString();
    }

    private String subOperationStatus;
    private Integer pageNo;
    private Integer pageSize;
}
