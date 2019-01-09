// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ServiceCommandResponse.java

package com.iotplatform.client.dto;

import java.util.List;

public class ServiceCommandResponse
{

    public ServiceCommandResponse()
    {
    }

    public String getResponseName()
    {
        return responseName;
    }

    public void setResponseName(String responseName)
    {
        this.responseName = responseName;
    }

    public List getParas()
    {
        return paras;
    }

    public void setParas(List paras)
    {
        this.paras = paras;
    }

    public String toString()
    {
        return (new StringBuilder("ServiceCommandResponse [responseName=")).append(responseName).append(", paras=").append(paras).append("]").toString();
    }

    private String responseName;
    private List paras;
}
