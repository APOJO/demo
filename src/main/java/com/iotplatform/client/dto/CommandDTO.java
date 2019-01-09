// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CommandDTO.java

package com.iotplatform.client.dto;

import com.fasterxml.jackson.databind.node.ObjectNode;

// Referenced classes of package com.iotplatform.client.dto:
//            CommandNA2CloudHeader

/**
 * @deprecated Class CommandDTO is deprecated
 */

public class CommandDTO
{

    public CommandDTO()
    {
    }

    public CommandNA2CloudHeader getHeader()
    {
        return header;
    }

    public void setHeader(CommandNA2CloudHeader header)
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
        return (new StringBuilder("CommandDTO [header=")).append(header).append(", body=").append(body).append("]").toString();
    }

    private CommandNA2CloudHeader header;
    private ObjectNode body;
}
