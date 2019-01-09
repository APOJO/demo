// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   RuleCreateOrUpdateOutDTO.java

package com.iotplatform.client.dto;


public class RuleCreateOrUpdateOutDTO
{

    public RuleCreateOrUpdateOutDTO()
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

    public String toString()
    {
        return (new StringBuilder("RuleCreateOutDTO [ruleId=")).append(ruleId).append("]").toString();
    }

    private String ruleId;
}
