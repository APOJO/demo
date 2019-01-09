// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CMD.java

package com.iotplatform.client.dto;


public class CMD
{

    public CMD()
    {
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

    public String getServiceId()
    {
        return serviceId;
    }

    public void setServiceId(String serviceId)
    {
        this.serviceId = serviceId;
    }

    public String toString()
    {
        return (new StringBuilder("CMD [messageType=")).append(messageType).append(", messageBody=").append(messageBody).append(", serviceId=").append(serviceId).append("]").toString();
    }

    String messageType;
    Object messageBody;
    String serviceId;
}
