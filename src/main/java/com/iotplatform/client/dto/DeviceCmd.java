// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DeviceCmd.java

package com.iotplatform.client.dto;

import java.util.List;

// Referenced classes of package com.iotplatform.client.dto:
//            CommandDTOV4

public class DeviceCmd
{

    public DeviceCmd()
    {
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public List getDeviceList()
    {
        return deviceList;
    }

    public void setDeviceList(List deviceList)
    {
        this.deviceList = deviceList;
    }

    public String getDeviceType()
    {
        return deviceType;
    }

    public void setDeviceType(String deviceType)
    {
        this.deviceType = deviceType;
    }

    public String getManufacturerId()
    {
        return manufacturerId;
    }

    public void setManufacturerId(String manufacturerId)
    {
        this.manufacturerId = manufacturerId;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getDeviceLocation()
    {
        return deviceLocation;
    }

    public void setDeviceLocation(String deviceLocation)
    {
        this.deviceLocation = deviceLocation;
    }

    public List getGroupList()
    {
        return groupList;
    }

    public void setGroupList(List groupList)
    {
        this.groupList = groupList;
    }

    public CommandDTOV4 getCommand()
    {
        return command;
    }

    public void setCommand(CommandDTOV4 command)
    {
        this.command = command;
    }

    public String getCallbackUrl()
    {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl)
    {
        this.callbackUrl = callbackUrl;
    }

    public Integer getMaxRetransmit()
    {
        return maxRetransmit;
    }

    public void setMaxRetransmit(Integer maxRetransmit)
    {
        this.maxRetransmit = maxRetransmit;
    }

    public String toString()
    {
        return (new StringBuilder("DeviceCmd [type=")).append(type).append(", deviceList=").append(deviceList).append(", deviceType=").append(deviceType).append(", manufacturerId=").append(manufacturerId).append(", model=").append(model).append(", deviceLocation=").append(deviceLocation).append(", groupList=").append(groupList).append(", command=").append(command).append(", callbackUrl=").append(callbackUrl).append(", maxRetransmit=").append(maxRetransmit).append("]").toString();
    }

    String type;
    List deviceList;
    String deviceType;
    String manufacturerId;
    String model;
    String deviceLocation;
    List groupList;
    CommandDTOV4 command;
    String callbackUrl;
    Integer maxRetransmit;
}
