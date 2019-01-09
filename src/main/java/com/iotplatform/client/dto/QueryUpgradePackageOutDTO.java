// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QueryUpgradePackageOutDTO.java

package com.iotplatform.client.dto;


public class QueryUpgradePackageOutDTO
{

    public QueryUpgradePackageOutDTO()
    {
    }

    public String getFileId()
    {
        return fileId;
    }

    public void setFileId(String fileId)
    {
        this.fileId = fileId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getVersion()
    {
        return version;
    }

    public void setVersion(String version)
    {
        this.version = version;
    }

    public String getFileType()
    {
        return fileType;
    }

    public void setFileType(String fileType)
    {
        this.fileType = fileType;
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

    public String getProtocolType()
    {
        return protocolType;
    }

    public void setProtocolType(String protocolType)
    {
        this.protocolType = protocolType;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public String getUploadTime()
    {
        return uploadTime;
    }

    public void setUploadTime(String uploadTime)
    {
        this.uploadTime = uploadTime;
    }

    public String toString()
    {
        return (new StringBuilder("QueryUpgradePackageOutDTO [fileId=")).append(fileId).append(", name=").append(name).append(", version=").append(version).append(", fileType=").append(fileType).append(", deviceType=").append(deviceType).append(", model=").append(model).append(", manufacturerName=").append(manufacturerName).append(", protocolType=").append(protocolType).append(", description=").append(description).append(", date=").append(date).append(", uploadTime=").append(uploadTime).append("]").toString();
    }

    private String fileId;
    private String name;
    private String version;
    private String fileType;
    private String deviceType;
    private String model;
    private String manufacturerName;
    private String protocolType;
    private String description;
    private String date;
    private String uploadTime;
}
