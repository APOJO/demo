// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   NotifyCommandRspDTO.java

package com.iotplatform.client.dto;

import com.fasterxml.jackson.databind.node.ObjectNode;

// Referenced classes of package com.iotplatform.client.dto:
//            CommandRspHeader

public class NotifyCommandRspDTO
{

    public NotifyCommandRspDTO()
    {
    }

    public String getNotifyType()
    {
        return notifyType;
    }

    public void setNotifyType(String notifyType)
    {
        this.notifyType = notifyType;
    }

    public CommandRspHeader getHeader()
    {
        return header;
    }

    public void setHeader(CommandRspHeader header)
    {
        this.header = header;
    }

    public ObjectNode getBody()
    {
        return body;
    }

    public void setBody(ObjectNode body)
    {
        this.body = body;
    }

    public String toString()
    {
        return (new StringBuilder("NotifyCommandRspDTO [notifyType=")).append(notifyType).append(", header=").append(header).append(", body=").append(body).append("]").toString();
    }

    private String notifyType;
    private CommandRspHeader header;
    private ObjectNode body;
}
