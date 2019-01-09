// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TriggerSourceTimer.java

package com.iotplatform.client.dto;


public class TriggerSourceTimer
{

    public TriggerSourceTimer()
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

    public String toString()
    {
        return (new StringBuilder("TriggerSourceTimer [type=")).append(type).append("]").toString();
    }

    String type;
}
