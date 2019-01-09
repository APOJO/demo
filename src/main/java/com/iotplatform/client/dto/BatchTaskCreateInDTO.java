// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   BatchTaskCreateInDTO.java

package com.iotplatform.client.dto;

import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 * @deprecated Class BatchTaskCreateInDTO is deprecated
 */

public class BatchTaskCreateInDTO
{

    public BatchTaskCreateInDTO()
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

    public ObjectNode getParam()
    {
        return param;
    }

    public void setParam(ObjectNode param)
    {
        this.param = param;
    }

    public String toString()
    {
        return (new StringBuilder("BatchTaskCreateInDTO [appId=")).append(appId).append(", timeout=").append(timeout).append(", taskName=").append(taskName).append(", taskType=").append(taskType).append(", param=").append(param).append("]").toString();
    }

    private String appId;
    private Integer timeout;
    private String taskName;
    private String taskType;
    private ObjectNode param;
}
