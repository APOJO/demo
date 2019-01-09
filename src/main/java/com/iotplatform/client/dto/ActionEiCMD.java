// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ActionEiCMD.java

package com.iotplatform.client.dto;


public class ActionEiCMD
{

    public ActionEiCMD()
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

    public String getSubSystem()
    {
        return subSystem;
    }

    public void setSubSystem(String subSystem)
    {
        this.subSystem = subSystem;
    }

    public String getDeviceId()
    {
        return deviceId;
    }

    public void setDeviceId(String deviceId)
    {
        this.deviceId = deviceId;
    }

    public String getMessageType()
    {
        return messageType;
    }

    public void setMessageType(String messageType)
    {
        this.messageType = messageType;
    }

    public Object getMessageBody()
    {
        return messageBody;
    }

    public void setMessageBody(Object messageBody)
    {
        this.messageBody = messageBody;
    }

    public String toString()
    {
        return (new StringBuilder("ActionEiCMD [type=")).append(type).append(", id=").append(id).append(", subSystem=").append(subSystem).append(", deviceId=").append(deviceId).append(", messageType=").append(messageType).append(", messageBody=").append(messageBody).append("]").toString();
    }

    String type;
    String id;
    String subSystem;
    String deviceId;
    String messageType;
    Object messageBody;
}
