// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   BatchTaskCreateInDTO2.java

package com.iotplatform.client.dto;

import java.util.List;

public class BatchTaskCreateInDTO2
{

    public BatchTaskCreateInDTO2()
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

    public Integer getTimeout()
    {
        return timeout;
    }

    public void setTimeout(Integer timeout)
    {
        this.timeout = timeout;
    }

    public String getTaskName()
    {
        return taskName;
    }

    public void setTaskName(String taskName)
    {
        this.taskName = taskName;
    }

    public String getTaskType()
    {
        return taskType;
    }

    public void setTaskType(String taskType)
    {
        this.taskType = taskType;
    }

    public Object getParam()
    {
        return param;
    }

    public void setParam(Object param)
    {
        this.param = param;
    }

    public List getTags()
    {
        return tags;
    }

    public void setTags(List tags)
    {
        this.tags = tags;
    }

    public String toString()
    {
        return (new StringBuilder("BatchTaskCreateInDTO [appId=")).append(appId).append(", timeout=").append(timeout).append(", taskName=").append(taskName).append(", taskType=").append(taskType).append(", param=").append(param).append(", tags=").append(tags).append("]").toString();
    }

    private String appId;
    private Integer timeout;
    private String taskName;
    private String taskType;
    private Object param;
    private List tags;
}
