// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SubOperationInfo.java

package com.iotplatform.client.dto;

import com.fasterxml.jackson.databind.node.ObjectNode;

public class SubOperationInfo
{

    public SubOperationInfo()
    {
    }

    public String getSubOperationId()
    {
        return subOperationId;
    }

    public void setSubOperationId(String subOperationId)
    {
        this.subOperationId = subOperationId;
    }

    public String getCreateTime()
    {
        return createTime;
    }

    public void setCreateTime(String createTime)
    {
        this.createTime = createTime;
    }

    public String getStartTime()
    {
        return startTime;
    }

    public void setStartTime(String startTime)
    {
        this.startTime = startTime;
    }

    public String getStopTime()
    {
        return stopTime;
    }

    public void setStopTime(String stopTime)
    {
        this.stopTime = stopTime;
    }

    public String getOperateType()
    {
        return operateType;
    }

    public void setOperateType(String operateType)
    {
        this.operateType = operateType;
    }

    public String getDeviceId()
    {
        return deviceId;
    }

    public void setDeviceId(String deviceId)
    {
        this.deviceId = deviceId;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getDetailInfo()
    {
        return detailInfo;
    }

    public void setDetailInfo(String detailInfo)
    {
        this.detailInfo = detailInfo;
    }

    public ObjectNode getExtendInfo()
    {
        return extendInfo;
    }

    public void setExtendInfo(ObjectNode extendInfo)
    {
        this.extendInfo = extendInfo;
    }

    public String toString()
    {
        return (new StringBuilder("SubOperationInfo [subOperationId=")).append(subOperationId).append(", createTime=").append(createTime).append(", startTime=").append(startTime).append(", stopTime=").append(stopTime).append(", operateType=").append(operateType).append(", deviceId=").append(deviceId).append(", status=").append(status).append(", detailInfo=").append(detailInfo).append(", extendInfo=").append(extendInfo).append("]").toString();
    }

    private String subOperationId;
    private String createTime;
    private String startTime;
    private String stopTime;
    private String operateType;
    private String deviceId;
    private String status;
    private String detailInfo;
    private ObjectNode extendInfo;
}
