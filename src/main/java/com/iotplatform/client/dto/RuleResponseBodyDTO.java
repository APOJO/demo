// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   RuleResponseBodyDTO.java

package com.iotplatform.client.dto;


// Referenced classes of package com.iotplatform.client.dto:
//            ExceptionMsg

public class RuleResponseBodyDTO
{

    public RuleResponseBodyDTO()
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

    public ExceptionMsg getResponse()
    {
        return response;
    }

    public void setResponse(ExceptionMsg response)
    {
        this.response = response;
    }

    public String toString()
    {
        return (new StringBuilder("RuleResponseBodyDTO [ruleId=")).append(ruleId).append(", response=").append(response).append("]").toString();
    }

    private String ruleId;
    private ExceptionMsg response;
}
