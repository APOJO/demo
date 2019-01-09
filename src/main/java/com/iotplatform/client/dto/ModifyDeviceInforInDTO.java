// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ModifyDeviceInforInDTO.java

package com.iotplatform.client.dto;


// Referenced classes of package com.iotplatform.client.dto:
//            DeviceConfigDTO

public class ModifyDeviceInforInDTO
{

    public ModifyDeviceInforInDTO()
    {
    }

    public DeviceConfigDTO getDeviceConfig()
    {
        return deviceConfig;
    }

    public void setDeviceConfig(DeviceConfigDTO deviceConfig)
    {
        this.deviceConfig = deviceConfig;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEndUser()
    {
        return endUser;
    }

    public void setEndUser(String endUser)
    {
        this.endUser = endUser;
    }

    public String getMute()
    {
        return mute;
    }

    public void setMute(String mute)
    {
        this.mute = mute;
    }

    public String getManufacturerId()
    {
        return manufacturerId;
    }

    public void setManufacturerId(String manufacturerId)
    {
        this.manufacturerId = manufacturerId;
    }

    public String getManufacturerName()
    {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName)
    {
        this.manufacturerName = manufacturerName;
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

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public String getProtocolType()
    {
        return protocolType;
    }

    public void setProtocolType(String protocolType)
    {
        this.protocolType = protocolType;
    }

    public String getRegion()
    {
        return region;
    }

    public void setRegion(String region)
    {
        this.region = region;
    }

    public String getOrganization()
    {
        return organization;
    }

    public void setOrganization(String organization)
    {
        this.organization = organization;
    }

    public String getTimezone()
    {
        return timezone;
    }

    public void setTimezone(String timezone)
    {
        this.timezone = timezone;
    }

    public String getImsi()
    {
        return imsi;
    }

    public void setImsi(String imsi)
    {
        this.imsi = imsi;
    }

    public String toString()
    {
        return (new StringBuilder("ModifyDeviceInforInDTO [name=")).append(name).append(", endUser=").append(endUser).append(", mute=").append(mute).append(", manufacturerId=").append(manufacturerId).append(", manufacturerName=").append(manufacturerName).append(", deviceType=").append(deviceType).append(", model=").append(model).append(", location=").append(location).append(", protocolType=").append(protocolType).append(", region=").append(region).append(", organization=").append(organization).append(", timezone=").append(timezone).append(", imsi=").append(imsi).append(", deviceConfig=").append(deviceConfig).append("]").toString();
    }

    private String name;
    private String endUser;
    private String mute;
    private String manufacturerId;
    private String manufacturerName;
    private String deviceType;
    private String model;
    private String location;
    private String protocolType;
    private String region;
    private String organization;
    private String timezone;
    private String imsi;
    private DeviceConfigDTO deviceConfig;
}
