// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CommandDTOV4.java

package com.iotplatform.client.dto;


public class CommandDTOV4
{

    public CommandDTOV4()
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

    public String getMethod()
    {
        return method;
    }

    public void setMethod(String method)
    {
        this.method = method;
    }

    public Object getParas()
    {
        return paras;
    }

    public void setParas(Object paras)
    {
        this.paras = paras;
    }

    public String toString()
    {
        return (new StringBuilder("CommandDTOV4 [serviceId=")).append(serviceId).append(", method=").append(method).append(", paras=").append(paras).append("]").toString();
    }

    private String serviceId;
    private String method;
    private Object paras;
}
