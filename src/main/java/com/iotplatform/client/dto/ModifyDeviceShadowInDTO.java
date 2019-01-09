// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ModifyDeviceShadowInDTO.java

package com.iotplatform.client.dto;

import java.util.List;

public class ModifyDeviceShadowInDTO
{

    public ModifyDeviceShadowInDTO()
    {
    }

    public List getServiceDesireds()
    {
        return serviceDesireds;
    }

    public void setServiceDesireds(List serviceDesireds)
    {
        this.serviceDesireds = serviceDesireds;
    }

    public String toString()
    {
        return (new StringBuilder("ModifyDeviceShadowInDTO [serviceDesireds=")).append(serviceDesireds).append("]").toString();
    }

    List serviceDesireds;
}
