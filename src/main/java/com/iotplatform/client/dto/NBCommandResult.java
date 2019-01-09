// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   NBCommandResult.java

package com.iotplatform.client.dto;

import com.fasterxml.jackson.databind.node.ObjectNode;

public class NBCommandResult
{

    public NBCommandResult()
    {
    }

    public String getResultCode()
    {
        return resultCode;
    }

    public void setResultCode(String resultCode)
    {
        this.resultCode = resultCode;
    }

    public ObjectNode getResultDetail()
    {
        return resultDetail;
    }

    public void setResultDetail(ObjectNode resultDetail)
    {
        this.resultDetail = resultDetail;
    }

    public String toString()
    {
        return (new StringBuilder("NBCommandResult [resultCode=")).append(resultCode).append(", resultDetail=").append(resultDetail).append("]").toString();
    }

    private String resultCode;
    private ObjectNode resultDetail;
}
