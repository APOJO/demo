// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ServiceInfo.java

package com.iotplatform.client.dto;

import java.util.List;

public class ServiceInfo
{

    public ServiceInfo()
    {
    }

    public List getMuteCmds()
    {
        return muteCmds;
    }

    public void setMuteCmds(List muteCmds)
    {
        this.muteCmds = muteCmds;
    }

    public String toString()
    {
        return (new StringBuilder("ServiceInfo [muteCmds=")).append(muteCmds).append("]").toString();
    }

    private List muteCmds;
}
