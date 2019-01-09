// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ConditionCycleTimer.java

package com.iotplatform.client.dto;


// Referenced classes of package com.iotplatform.client.dto:
//            TimeRange

public class ConditionCycleTimer
{

    public ConditionCycleTimer()
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

    public TimeRange getTimeRange()
    {
        return timeRange;
    }

    public void setTimeRange(TimeRange timeRange)
    {
        this.timeRange = timeRange;
    }

    public Integer getInterval()
    {
        return interval;
    }

    public void setInterval(Integer interval)
    {
        this.interval = interval;
    }

    public String toString()
    {
        return (new StringBuilder("ConditionCycleTimer [type=")).append(type).append(", id=").append(id).append(", timeRange=").append(timeRange).append(", interval=").append(interval).append("]").toString();
    }

    String type;
    String id;
    TimeRange timeRange;
    Integer interval;
}
