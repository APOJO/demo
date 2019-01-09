// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   NotifySwUpgradeResultDTO.java

package com.iotplatform.client.dto;


public class NotifySwUpgradeResultDTO
{

    public NotifySwUpgradeResultDTO()
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

    public String getSwUpgradeResult()
    {
        return swUpgradeResult;
    }

    public void setSwUpgradeResult(String swUpgradeResult)
    {
        this.swUpgradeResult = swUpgradeResult;
    }

    public String getUpgradeTime()
    {
        return upgradeTime;
    }

    public void setUpgradeTime(String upgradeTime)
    {
        this.upgradeTime = upgradeTime;
    }

    public String getResultDesc()
    {
        return resultDesc;
    }

    public void setResultDesc(String resultDesc)
    {
        this.resultDesc = resultDesc;
    }

    public String getErrorCode()
    {
        return errorCode;
    }

    public void setErrorCode(String errorCode)
    {
        this.errorCode = errorCode;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String toString()
    {
        return (new StringBuilder("NotifySwUpgradeResultDTO [notifyType=")).append(notifyType).append(", deviceId=").append(deviceId).append(", appId=").append(appId).append(", operationId=").append(operationId).append(", subOperationId=").append(subOperationId).append(", curVersion=").append(curVersion).append(", targetVersion=").append(targetVersion).append(", sourceVersion=").append(sourceVersion).append(", swUpgradeResult=").append(swUpgradeResult).append(", upgradeTime=").append(upgradeTime).append(", resultDesc=").append(resultDesc).append(", errorCode=").append(errorCode).append(", description=").append(description).append("]").toString();
    }

    private String notifyType;
    private String deviceId;
    private String appId;
    private String operationId;
    private String subOperationId;
    private String curVersion;
    private String targetVersion;
    private String sourceVersion;
    private String swUpgradeResult;
    private String upgradeTime;
    private String resultDesc;
    private String errorCode;
    private String description;
}
