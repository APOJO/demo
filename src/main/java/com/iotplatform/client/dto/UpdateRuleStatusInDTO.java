// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   UpdateRuleStatusInDTO.java

package com.iotplatform.client.dto;


public class UpdateRuleStatusInDTO
{

    public UpdateRuleStatusInDTO()
    {
    }

    public String getRuleId()
    {
        return ruleId;
    }

    public void setRuleId(String ruleId)
    {
        this.ruleId = ruleId;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String toString()
    {
        return (new StringBuilder("RuleStatusChangeInDTO [ruleId=")).append(ruleId).append(", status=").append(status).append("]").toString();
    }

    private String ruleId;
    private String status;
}
