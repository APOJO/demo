// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AsynCommandDTO.java

package com.iotplatform.client.dto;

import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 * @deprecated Class AsynCommandDTO is deprecated
 */

public class AsynCommandDTO
{

    public AsynCommandDTO()
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

    public ObjectNode getParas()
    {
        return paras;
    }

    public void setParas(ObjectNode paras)
    {
        this.paras = paras;
    }

    public String toString()
    {
        return (new StringBuilder("AsynCommandDTO [serviceId=")).append(serviceId).append(", method=").append(method).append(", paras=").append(paras).append("]").toString();
    }

    private String serviceId;
    private String method;
    private ObjectNode paras;
}
