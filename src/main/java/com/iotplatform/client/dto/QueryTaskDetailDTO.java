// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QueryTaskDetailDTO.java

package com.iotplatform.client.dto;

import com.fasterxml.jackson.databind.node.ObjectNode;

public class QueryTaskDetailDTO
{

    public QueryTaskDetailDTO()
    {
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getOutput()
    {
        return output;
    }

    public void setOutput(String output)
    {
        this.output = output;
    }

    public String getError()
    {
        return error;
    }

    public void setError(String error)
    {
        this.error = error;
    }

    public ObjectNode getParam()
    {
        return param;
    }

    public void setParam(ObjectNode param)
    {
        this.param = param;
    }

    public String toString()
    {
        return (new StringBuilder("QueryTaskDetailDTO [status=")).append(status).append(", output=").append(output).append(", error=").append(error).append(", param=").append(param).append("]").toString();
    }

    private String status;
    private String output;
    private String error;
    private ObjectNode param;
}
