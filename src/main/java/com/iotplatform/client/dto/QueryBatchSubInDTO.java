// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QueryBatchSubInDTO.java

package com.iotplatform.client.dto;


public class QueryBatchSubInDTO
{

    public QueryBatchSubInDTO()
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

    public String getNotifyType()
    {
        return notifyType;
    }

    public void setNotifyType(String notifyType)
    {
        this.notifyType = notifyType;
    }

    public String getPageNo()
    {
        return pageNo;
    }

    public void setPageNo(String pageNo)
    {
        this.pageNo = pageNo;
    }

    public String getPageSize()
    {
        return pageSize;
    }

    public void setPageSize(String pageSize)
    {
        this.pageSize = pageSize;
    }

    public String toString()
    {
        return (new StringBuilder("QueryBatchSubInDTO [appId=")).append(appId).append(", notifyType=").append(notifyType).append(", pageNo=").append(pageNo).append(", pageSize=").append(pageSize).append("]").toString();
    }

    private String appId;
    private String notifyType;
    private String pageNo;
    private String pageSize;
}
