// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DmServicesRequestDTO.java

package com.iotplatform.client.dto;

import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 * @deprecated Class DmServicesRequestDTO is deprecated
 */

public class DmServicesRequestDTO
{

    public DmServicesRequestDTO()
    {
    }

    public ObjectNode getData()
    {
        return data;
    }

    public void setData(ObjectNode data)
    {
        this.data = data;
    }

    public String toString()
    {
        return (new StringBuilder("DmServicesRequestDTO [data=")).append(data).append("]").toString();
    }

    private ObjectNode data;
}
