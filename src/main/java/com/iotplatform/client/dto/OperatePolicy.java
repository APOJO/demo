// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OperatePolicy.java

package com.iotplatform.client.dto;


public class OperatePolicy
{

    public OperatePolicy()
    {
    }

    public String getExecuteType()
    {
        return executeType;
    }

    public void setExecuteType(String executeType)
    {
        this.executeType = executeType;
    }

    public String getStartTime()
    {
        return startTime;
    }

    public void setStartTime(String startTime)
    {
        this.startTime = startTime;
    }

    public String getEndTime()
    {
        return endTime;
    }

    public void setEndTime(String endTime)
    {
        this.endTime = endTime;
    }

    public boolean getRetryType()
    {
        return retryType;
    }

    public void setRetryType(boolean retryType)
    {
        this.retryType = retryType;
    }

    public Integer getRetryTimes()
    {
        return retryTimes;
    }

    public void setRetryTimes(Integer retryTimes)
    {
        this.retryTimes = retryTimes;
    }

    public String toString()
    {
        return (new StringBuilder("OperatePolicy [executeType=")).append(executeType).append(", startTime=").append(startTime).append(", endTime=").append(endTime).append(", retryType=").append(retryType).append(", retryTimes=").append(retryTimes).append("]").toString();
    }

    private String executeType;
    private String startTime;
    private String endTime;
    private boolean retryType;
    private Integer retryTimes;
}
