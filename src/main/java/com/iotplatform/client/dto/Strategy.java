// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Strategy.java

package com.iotplatform.client.dto;


public class Strategy
{

    public Strategy()
    {
    }

    public String getTrigger()
    {
        return trigger;
    }

    public void setTrigger(String trigger)
    {
        this.trigger = trigger;
    }

    public Integer geteValidTime()
    {
        return eValidTime;
    }

    public void seteValidTime(Integer eValidTime)
    {
        this.eValidTime = eValidTime;
    }

    public String toString()
    {
        return (new StringBuilder("Strategy [trigger=")).append(trigger).append(", eValidTime=").append(eValidTime).append("]").toString();
    }

    String trigger;
    Integer eValidTime;
}
