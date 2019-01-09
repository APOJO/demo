// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QuerySingleDeviceGroupOutDTO.java

package com.iotplatform.client.dto;


public class QuerySingleDeviceGroupOutDTO
{

    public QuerySingleDeviceGroupOutDTO()
    {
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getAppId()
    {
        return appId;
    }

    public void setAppId(String appId)
    {
        this.appId = appId;
    }

    public Integer getMaxDevNum()
    {
        return maxDevNum;
    }

    public void setMaxDevNum(Integer maxDevNum)
    {
        this.maxDevNum = maxDevNum;
    }

    public Integer getCurDevNum()
    {
        return curDevNum;
    }

    public void setCurDevNum(Integer curDevNum)
    {
        this.curDevNum = curDevNum;
    }

    public String getCreator()
    {
        return creator;
    }

    public void setCreator(String creator)
    {
        this.creator = creator;
    }

    public String toString()
    {
        return (new StringBuilder("QuerySingleDeviceGroupOutDTO [name=")).append(name).append(", description=").append(description).append(", id=").append(id).append(", appId=").append(appId).append(", maxDevNum=").append(maxDevNum).append(", curDevNum=").append(curDevNum).append(", creator=").append(creator).append("]").toString();
    }

    private String name;
    private String description;
    private String id;
    private String appId;
    private Integer maxDevNum;
    private Integer curDevNum;
    private String creator;
}
