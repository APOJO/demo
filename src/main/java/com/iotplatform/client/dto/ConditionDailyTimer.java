// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ConditionDailyTimer.java

package com.iotplatform.client.dto;


public class ConditionDailyTimer
{

    public ConditionDailyTimer()
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

    public String getTime()
    {
        return time;
    }

    public void setTime(String time)
    {
        this.time = time;
    }

    public String getDaysOfWeek()
    {
        return daysOfWeek;
    }

    public void setDaysOfWeek(String daysOfWeek)
    {
        this.daysOfWeek = daysOfWeek;
    }

    public String toString()
    {
        return (new StringBuilder("ConditionDailyTimer [type=")).append(type).append(", id=").append(id).append(", time=").append(time).append(", daysOfWeek=").append(daysOfWeek).append("]").toString();
    }

    String type;
    String id;
    String time;
    String daysOfWeek;
}
