// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CreateUpgradeTaskOutDTO.java

package com.iotplatform.client.dto;


public class CreateUpgradeTaskOutDTO
{

    public CreateUpgradeTaskOutDTO()
    {
    }

    public String getOperationId()
    {
        return operationId;
    }

    public void setOperationId(String operationId)
    {
        this.operationId = operationId;
    }

    public String toString()
    {
        return (new StringBuilder("CreateUpgradeTaskOutDTO [operationId=")).append(operationId).append("]").toString();
    }

    private String operationId;
}
