// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ConditionReason.java

package com.iotplatform.client.dto;

import com.fasterxml.jackson.databind.node.ObjectNode;

public class ConditionReason
{

    public ConditionReason()
    {
    }

    public String getSatisfactionTime()
    {
        return satisfactionTime;
    }

    public void setSatisfactionTime(String satisfactionTime)
    {
        this.satisfactionTime = satisfactionTime;
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

    public ObjectNode getInfo()
    {
        return info;
    }

    public void setInfo(ObjectNode info)
    {
        this.info = info;
    }

    public ObjectNode getTransInfo()
    {
        return transInfo;
    }

    public void setTransInfo(ObjectNode transInfo)
    {
        this.transInfo = transInfo;
    }

    public String toString()
    {
        return (new StringBuilder("ConditionReason [satisfactionTime=")).append(satisfactionTime).append(", type=").append(type).append(", id=").append(id).append(", info=").append(info).append(", transInfo=").append(transInfo).append("]").toString();
    }

    private String satisfactionTime;
    private String type;
    private String id;
    private ObjectNode info;
    private ObjectNode transInfo;
}
