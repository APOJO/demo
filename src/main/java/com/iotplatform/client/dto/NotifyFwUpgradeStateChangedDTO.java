// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   NotifyFwUpgradeStateChangedDTO.java

package com.iotplatform.client.dto;


public class NotifyFwUpgradeStateChangedDTO
{

    public NotifyFwUpgradeStateChangedDTO()
    {
    }

    public String getNotifyType()
    {
        return notifyType;
    }

    public void setNotifyType(String notifyType)
    {
        this.notifyType = notifyType;
    }

    public String getDeviceId()
    {
        return deviceId;
    }

    public void setDeviceId(String deviceId)
    {
        this.deviceId = deviceId;
    }

    public String getAppId()
    {
        return appId;
    }

    public void setAppId(String appId)
    {
        this.appId = appId;
    }

    public String getOperationId()
    {
        return operationId;
    }

    public void setOperationId(String operationId)
    {
        this.operationId = operationId;
    }

    public String getSubOperationId()
    {
        return subOperationId;
    }

    public void setSubOperationId(String subOperationId)
    {
        this.subOperationId = subOperationId;
    }

    public String getStep()
    {
        return step;
    }

    public void setStep(String step)
    {
        this.step = step;
    }

    public String getStepDesc()
    {
        return stepDesc;
    }

    public void setStepDesc(String stepDesc)
    {
        this.stepDesc = stepDesc;
    }

    public String toString()
    {
        return (new StringBuilder("NotifyFwUpgradeStateChangedDTO [notifyType=")).append(notifyType).append(", deviceId=").append(deviceId).append(", appId=").append(appId).append(", operationId=").append(operationId).append(", subOperationId=").append(subOperationId).append(", step=").append(step).append(", stepDesc=").append(stepDesc).append("]").toString();
    }

    private String notifyType;
    private String deviceId;
    private String appId;
    private String operationId;
    private String subOperationId;
    private String step;
    private String stepDesc;
}
