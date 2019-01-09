// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ActionResult.java

package com.iotplatform.client.dto;

import com.fasterxml.jackson.databind.node.ObjectNode;

public class ActionResult
{

    public ActionResult()
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

    public String getException()
    {
        return exception;
    }

    public void setException(String exception)
    {
        this.exception = exception;
    }

    public ObjectNode getResult()
    {
        return result;
    }

    public void setResult(ObjectNode result)
    {
        this.result = result;
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
        return (new StringBuilder("ActionResult [type=")).append(type).append(", id=").append(id).append(", exception=").append(exception).append(", result=").append(result).append(", info=").append(info).append(", transInfo=").append(transInfo).append("]").toString();
    }

    private String type;
    private String id;
    private String exception;
    private ObjectNode result;
    private ObjectNode info;
    private ObjectNode transInfo;
}
