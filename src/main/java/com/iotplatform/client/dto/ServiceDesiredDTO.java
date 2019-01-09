// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ServiceDesiredDTO.java

package com.iotplatform.client.dto;


public class ServiceDesiredDTO
{

    public ServiceDesiredDTO()
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

    public Object getDesired()
    {
        return desired;
    }

    public void setDesired(Object desired)
    {
        this.desired = desired;
    }

    public String toString()
    {
        return (new StringBuilder("ServiceDesiredDTO [serviceId=")).append(serviceId).append(", desired=").append(desired).append("]").toString();
    }

    private String serviceId;
    private Object desired;
}
