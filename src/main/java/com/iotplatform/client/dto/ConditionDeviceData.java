// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ConditionDeviceData.java

package com.iotplatform.client.dto;


// Referenced classes of package com.iotplatform.client.dto:
//            CondiotionDeviceInfo, Strategy

public class ConditionDeviceData
{

    public ConditionDeviceData()
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

    public CondiotionDeviceInfo getDeviceInfo()
    {
        return deviceInfo;
    }

    public void setDeviceInfo(CondiotionDeviceInfo deviceInfo)
    {
        this.deviceInfo = deviceInfo;
    }

    public String getOperator()
    {
        return operator;
    }

    public void setOperator(String operator)
    {
        this.operator = operator;
    }

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

    public Object getTransInfo()
    {
        return transInfo;
    }

    public void setTransInfo(Object transInfo)
    {
        this.transInfo = transInfo;
    }

    public Integer getDuration()
    {
        return duration;
    }

    public void setDuration(Integer duration)
    {
        this.duration = duration;
    }

    public Strategy getStrategy()
    {
        return strategy;
    }

    public void setStrategy(Strategy strategy)
    {
        this.strategy = strategy;
    }

    public String toString()
    {
        return (new StringBuilder("ConditionDeviceData [type=")).append(type).append(", id=").append(id).append(", deviceInfo=").append(deviceInfo).append(", operator=").append(operator).append(", value=").append(value).append(", transInfo=").append(transInfo).append(", duration=").append(duration).append(", strategy").append(strategy).append("]").toString();
    }

    String type;
    String id;
    CondiotionDeviceInfo deviceInfo;
    String operator;
    String value;
    Object transInfo;
    Integer duration;
    Strategy strategy;
}
