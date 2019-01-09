// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TimeRange.java

package com.iotplatform.client.dto;


public class TimeRange
{

    public TimeRange()
    {
    }

    public String getStartTime()
    {
        return startTime;
    }

    public void setStartTime(String startTime)
    {
        this.startTime = startTime;
    }

    public String getEndTime()
    {
        return endTime;
    }

    public void setEndTime(String endTime)
    {
        this.endTime = endTime;
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
        return (new StringBuilder("TimeRange [startTime=")).append(startTime).append(", endTime=").append(endTime).append(", daysOfWeek=").append(daysOfWeek).append("]").toString();
    }

    private String startTime;
    private String endTime;
    private String daysOfWeek;
}
