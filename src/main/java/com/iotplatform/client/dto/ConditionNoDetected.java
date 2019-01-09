// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ConditionNoDetected.java

package com.iotplatform.client.dto;


public class ConditionNoDetected
{

    public ConditionNoDetected()
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

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String toString()
    {
        return (new StringBuilder("ConditionNoDetected [type=")).append(type).append(", id=").append(id).append(", description=").append(description).append("]").toString();
    }

    String type;
    String id;
    String description;
}
