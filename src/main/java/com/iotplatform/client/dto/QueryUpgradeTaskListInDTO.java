// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QueryUpgradeTaskListInDTO.java

package com.iotplatform.client.dto;


public class QueryUpgradeTaskListInDTO
{

    public QueryUpgradeTaskListInDTO()
    {
    }

    public String getOperationType()
    {
        return operationType;
    }

    public void setOperationType(String operationType)
    {
        this.operationType = operationType;
    }

    public String getOperationStatus()
    {
        return operationStatus;
    }

    public void setOperationStatus(String operationStatus)
    {
        this.operationStatus = operationStatus;
    }

    public String getDeviceType()
    {
        return deviceType;
    }

    public void setDeviceType(String deviceType)
    {
        this.deviceType = deviceType;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getManufacturerName()
    {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName)
    {
        this.manufacturerName = manufacturerName;
    }

    public String getDeviceId()
    {
        return deviceId;
    }

    public void setDeviceId(String deviceId)
    {
        this.deviceId = deviceId;
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
        return (new StringBuilder("QueryUpgradeTaskListInDTO [operationType=")).append(operationType).append(", operationStatus=").append(operationStatus).append(", deviceType=").append(deviceType).append(", model=").append(model).append(", manufacturerName=").append(manufacturerName).append(", deviceId=").append(deviceId).append(", pageNo=").append(pageNo).append(", pageSize=").append(pageSize).append("]").toString();
    }

    private String operationType;
    private String operationStatus;
    private String deviceType;
    private String model;
    private String manufacturerName;
    private String deviceId;
    private Integer pageNo;
    private Integer pageSize;
}
