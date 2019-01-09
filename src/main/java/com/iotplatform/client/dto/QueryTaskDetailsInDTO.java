// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QueryTaskDetailsInDTO.java

package com.iotplatform.client.dto;


public class QueryTaskDetailsInDTO
{

    public QueryTaskDetailsInDTO()
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

    public String getTaskId()
    {
        return taskId;
    }

    public void setTaskId(String taskId)
    {
        this.taskId = taskId;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public Integer getIndex()
    {
        return index;
    }

    public void setIndex(Integer index)
    {
        this.index = index;
    }

    public String getNodeId()
    {
        return nodeId;
    }

    public void setNodeId(String nodeId)
    {
        this.nodeId = nodeId;
    }

    public String getDeviceId()
    {
        return deviceId;
    }

    public void setDeviceId(String deviceId)
    {
        this.deviceId = deviceId;
    }

    public String getCommandId()
    {
        return commandId;
    }

    public void setCommandId(String commandId)
    {
        this.commandId = commandId;
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
        return (new StringBuilder("QueryTaskDetailsInDTO [appId=")).append(appId).append(", taskId=").append(taskId).append(", status=").append(status).append(", index=").append(index).append(", nodeId=").append(nodeId).append(", deviceId=").append(deviceId).append(", commandId=").append(commandId).append(", pageNo=").append(pageNo).append(", pageSize=").append(pageSize).append("]").toString();
    }

    private String appId;
    private String taskId;
    private String status;
    private Integer index;
    private String nodeId;
    private String deviceId;
    private String commandId;
    private Integer pageNo;
    private Integer pageSize;
}
