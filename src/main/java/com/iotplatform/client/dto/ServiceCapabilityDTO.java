// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ServiceCapabilityDTO.java

package com.iotplatform.client.dto;

import java.util.List;

public class ServiceCapabilityDTO
{

    public ServiceCapabilityDTO()
    {
    }

    public String getServiceId()
    {
        return serviceId;
    }

    public void setServiceId(String serviceId)
    {
        this.serviceId = serviceId;
    }

    public String getServiceType()
    {
        return serviceType;
    }

    public void setServiceType(String serviceType)
    {
        this.serviceType = serviceType;
    }

    public String getOption()
    {
        return option;
    }

    public void setOption(String option)
    {
        this.option = option;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public List getCommands()
    {
        return commands;
    }

    public void setCommands(List commands)
    {
        this.commands = commands;
    }

    public List getProperties()
    {
        return properties;
    }

    public void setProperties(List properties)
    {
        this.properties = properties;
    }

    public String toString()
    {
        return (new StringBuilder("ServiceCapabilityDTO [serviceId=")).append(serviceId).append(", serviceType=").append(serviceType).append(", option=").append(option).append(", description=").append(description).append(", commands=").append(commands).append(", properties=").append(properties).append("]").toString();
    }

    private String serviceId;
    private String serviceType;
    private String option;
    private String description;
    private List commands;
    private List properties;
}
