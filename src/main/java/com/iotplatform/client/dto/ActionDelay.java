// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ActionDelay.java

package com.iotplatform.client.dto;


public class ActionDelay
{

    public ActionDelay()
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

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public Long getTime()
    {
        return time;
    }

    public void setTime(Long time)
    {
        this.time = time;
    }

    public Object getTransInfo()
    {
        return transInfo;
    }

    public void setTransInfo(Object transInfo)
    {
        this.transInfo = transInfo;
    }

    public String toString()
    {
        return (new StringBuilder("ActionDelay [type=")).append(type).append(", id=").append(id).append(", time=").append(time).append(", transInfo=").append(transInfo).append("]").toString();
    }

    String type;
    String id;
    Long time;
    Object transInfo;
}
