// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   UpdateBatchRuleStatusInDTO.java

package com.iotplatform.client.dto;

import java.util.List;

public class UpdateBatchRuleStatusInDTO
{

    public UpdateBatchRuleStatusInDTO()
    {
    }

    public List getRequests()
    {
        return requests;
    }

    public void setRequests(List requests)
    {
        this.requests = requests;
    }

    public String toString()
    {
        return (new StringBuilder("UpdateBatchRuleStatusInDTO [requests=")).append(requests).append("]").toString();
    }

    private List requests;
}
