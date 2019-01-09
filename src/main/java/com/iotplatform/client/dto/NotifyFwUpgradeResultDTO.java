// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   NotifyFwUpgradeResultDTO.java

package com.iotplatform.client.dto;


public class NotifyFwUpgradeResultDTO
{

    public NotifyFwUpgradeResultDTO()
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

    public String getCurVersion()
    {
        return curVersion;
    }

    public void setCurVersion(String curVersion)
    {
        this.curVersion = curVersion;
    }

    public String getTargetVersion()
    {
        return targetVersion;
    }

    public void setTargetVersion(String targetVersion)
    {
        this.targetVersion = targetVersion;
    }

    public String getSourceVersion()
    {
        return sourceVersion;
    }

    public void setSourceVersion(String sourceVersion)
    {
        this.sourceVersion = sourceVersion;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatusDesc()
    {
        return statusDesc;
    }

    public void setStatusDesc(String statusDesc)
    {
        this.statusDesc = statusDesc;
    }

    public String getUpgradeTime()
    {
        return upgradeTime;
    }

    public void setUpgradeTime(String upgradeTime)
    {
        this.upgradeTime = upgradeTime;
    }

    public String toString()
    {
        return (new StringBuilder("NotifyFwUpgradeResultDTO [notifyType=")).append(notifyType).append(", deviceId=").append(deviceId).append(", appId=").append(appId).append(", operationId=").append(operationId).append(", subOperationId=").append(subOperationId).append(", curVersion=").append(curVersion).append(", targetVersion=").append(targetVersion).append(", sourceVersion=").append(sourceVersion).append(", status=").append(status).append(", statusDesc=").append(statusDesc).append(", upgradeTime=").append(upgradeTime).append("]").toString();
    }

    private String notifyType;
    private String deviceId;
    private String appId;
    private String operationId;
    private String subOperationId;
    private String curVersion;
    private String targetVersion;
    private String sourceVersion;
    private String status;
    private String statusDesc;
    private String upgradeTime;
}
