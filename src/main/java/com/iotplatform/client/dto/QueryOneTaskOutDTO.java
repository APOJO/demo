// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QueryOneTaskOutDTO.java

package com.iotplatform.client.dto;

import com.fasterxml.jackson.databind.node.ObjectNode;

public class QueryOneTaskOutDTO
{

    public QueryOneTaskOutDTO()
    {
    }

    public String getTaskId()
    {
        return taskId;
    }

    public void setTaskId(String taskId)
    {
        this.taskId = taskId;
    }

    public String getTaskName()
    {
        return taskName;
    }

    public void setTaskName(String taskName)
    {
        this.taskName = taskName;
    }

    public String getAppId()
    {
        return appId;
    }

    public void setAppId(String appId)
    {
        this.appId = appId;
    }

    public String getOperator()
    {
        return operator;
    }

    public void setOperator(String operator)
    {
        this.operator = operator;
    }

    public String getTaskFrom()
    {
        return taskFrom;
    }

    public void setTaskFrom(String taskFrom)
    {
        this.taskFrom = taskFrom;
    }

    public String getTaskType()
    {
        return taskType;
    }

    public void setTaskType(String taskType)
    {
        this.taskType = taskType;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStartTime()
    {
        return startTime;
    }

    public void setStartTime(String startTime)
    {
        this.startTime = startTime;
    }

    public int getTimeout()
    {
        return timeout;
    }

    public void setTimeout(int timeout)
    {
        this.timeout = timeout;
    }

    public int getProgress()
    {
        return progress;
    }

    public void setProgress(int progress)
    {
        this.progress = progress;
    }

    public int getTotalCnt()
    {
        return totalCnt;
    }

    public void setTotalCnt(int totalCnt)
    {
        this.totalCnt = totalCnt;
    }

    public int getSuccessCnt()
    {
        return successCnt;
    }

    public void setSuccessCnt(int successCnt)
    {
        this.successCnt = successCnt;
    }

    public int getSuccessRate()
    {
        return successRate;
    }

    public void setSuccessRate(int successRate)
    {
        this.successRate = successRate;
    }

    public int getFailCnt()
    {
        return failCnt;
    }

    public void setFailCnt(int failCnt)
    {
        this.failCnt = failCnt;
    }

    public int getTimeoutCnt()
    {
        return timeoutCnt;
    }

    public void setTimeoutCnt(int timeoutCnt)
    {
        this.timeoutCnt = timeoutCnt;
    }

    public int getExpiredCnt()
    {
        return expiredCnt;
    }

    public void setExpiredCnt(int expiredCnt)
    {
        this.expiredCnt = expiredCnt;
    }

    public int getCompleteCnt()
    {
        return completeCnt;
    }

    public void setCompleteCnt(int completeCnt)
    {
        this.completeCnt = completeCnt;
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
        return (new StringBuilder("QueryOneTaskOutDTO [taskId=")).append(taskId).append(", taskName=").append(taskName).append(", appId=").append(appId).append(", operator=").append(operator).append(", taskFrom=").append(taskFrom).append(", taskType=").append(taskType).append(", status=").append(status).append(", startTime=").append(startTime).append(", timeout=").append(timeout).append(", progress=").append(progress).append(", totalCnt=").append(totalCnt).append(", successCnt=").append(successCnt).append(", successRate=").append(successRate).append(", failCnt=").append(failCnt).append(", timeoutCnt=").append(timeoutCnt).append(", expiredCnt=").append(expiredCnt).append(", completeCnt=").append(completeCnt).append(", param=").append(param).append("]").toString();
    }

    private String taskId;
    private String taskName;
    private String appId;
    private String operator;
    private String taskFrom;
    private String taskType;
    private String status;
    private String startTime;
    private int timeout;
    private int progress;
    private int totalCnt;
    private int successCnt;
    private int successRate;
    private int failCnt;
    private int timeoutCnt;
    private int expiredCnt;
    private int completeCnt;
    private ObjectNode param;
}
