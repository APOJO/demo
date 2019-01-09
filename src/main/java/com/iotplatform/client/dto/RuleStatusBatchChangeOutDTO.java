// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   RuleStatusBatchChangeOutDTO.java

package com.iotplatform.client.dto;

import java.util.List;

// Referenced classes of package com.iotplatform.client.dto:
//            RuleResultBodyDTO

/**
 * @deprecated Class RuleStatusBatchChangeOutDTO is deprecated
 */

public class RuleStatusBatchChangeOutDTO
{

    public RuleStatusBatchChangeOutDTO()
    {
    }

    public RuleResultBodyDTO getResult()
    {
        return result;
    }

    public void setResult(RuleResultBodyDTO result)
    {
        this.result = result;
    }

    public List getResponses()
    {
        return responses;
    }

    public void setResponses(List responses)
    {
        this.responses = responses;
    }

    public String toString()
    {
        return (new StringBuilder("RuleStatusBatchChangeOutDTO [result=")).append(result).append(", responses=").append(responses).append("]").toString();
    }

    private RuleResultBodyDTO result;
    private List responses;
}
