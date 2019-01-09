// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CommandDTO2.java

package com.iotplatform.client.dto;


// Referenced classes of package com.iotplatform.client.dto:
//            CommandNA2CloudHeader

public class CommandDTO2
{

    public CommandDTO2()
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

    public Object getBody()
    {
        return body;
    }

    public void setBody(Object body)
    {
        this.body = body;
    }

    public String toString()
    {
        return (new StringBuilder("CommandDTO2 [header=")).append(header).append(", body=").append(body).append("]").toString();
    }

    private CommandNA2CloudHeader header;
    private Object body;
}
