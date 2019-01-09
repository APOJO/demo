// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   NotifyRuleEventDTO.java

package com.iotplatform.client.dto;

import java.util.List;

public class NotifyRuleEventDTO
{

    public NotifyRuleEventDTO()
    {
    }

    public String getNotifyType()
    {
        return notifyType;
    }

    public void setNotifyType(String notifyType)
    {
        this.notifyType = notifyType;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getRuleId()
    {
        return ruleId;
    }

    public void setRuleId(String ruleId)
    {
        this.ruleId = ruleId;
    }

    public String getRuleName()
    {
        return ruleName;
    }

    public void setRuleName(String ruleName)
    {
        this.ruleName = ruleName;
    }

    public String getLogic()
    {
        return logic;
    }

    public void setLogic(String logic)
    {
        this.logic = logic;
    }

    public List getReasons()
    {
        return reasons;
    }

    public void setReasons(List reasons)
    {
        this.reasons = reasons;
    }

    public String getTriggerTime()
    {
        return triggerTime;
    }

    public void setTriggerTime(String triggerTime)
    {
        this.triggerTime = triggerTime;
    }

    public List getActionsResults()
    {
        return actionsResults;
    }

    public void setActionsResults(List actionsResults)
    {
        this.actionsResults = actionsResults;
    }

    public String toString()
    {
        return (new StringBuilder("NotifyRuleEventDTO [notifyType=")).append(notifyType).append(", author=").append(author).append(", ruleId=").append(ruleId).append(", ruleName=").append(ruleName).append(", logic=").append(logic).append(", reasons=").append(reasons).append(", triggerTime=").append(triggerTime).append(", actionsResults=").append(actionsResults).append("]").toString();
    }

    private String notifyType;
    private String author;
    private String ruleId;
    private String ruleName;
    private String logic;
    private List reasons;
    private String triggerTime;
    private List actionsResults;
}
