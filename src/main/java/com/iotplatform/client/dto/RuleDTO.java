// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   RuleDTO.java

package com.iotplatform.client.dto;

import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.List;

// Referenced classes of package com.iotplatform.client.dto:
//            TimeRange, GroupExpress

/**
 * @deprecated Class RuleDTO is deprecated
 */

public class RuleDTO
{

    public RuleDTO()
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

    public String getAppKey()
    {
        return appKey;
    }

    public void setAppKey(String appKey)
    {
        this.appKey = appKey;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public List getConditions()
    {
        return conditions;
    }

    public void setConditions(List conditions)
    {
        this.conditions = conditions;
    }

    public String getLogic()
    {
        return logic;
    }

    public void setLogic(String logic)
    {
        this.logic = logic;
    }

    public TimeRange getTimeRange()
    {
        return timeRange;
    }

    public void setTimeRange(TimeRange timeRange)
    {
        this.timeRange = timeRange;
    }

    public List getActions()
    {
        return actions;
    }

    public void setActions(List actions)
    {
        this.actions = actions;
    }

    public String getMatchNow()
    {
        return matchNow;
    }

    public void setMatchNow(String matchNow)
    {
        this.matchNow = matchNow;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public GroupExpress getGroupExpress()
    {
        return groupExpress;
    }

    public void setGroupExpress(GroupExpress groupExpress)
    {
        this.groupExpress = groupExpress;
    }

    public List getTriggerSources()
    {
        return triggerSources;
    }

    public void setTriggerSources(List triggerSources)
    {
        this.triggerSources = triggerSources;
    }

    public String getTimezoneID()
    {
        return timezoneID;
    }

    public void setTimezoneID(String timezoneID)
    {
        this.timezoneID = timezoneID;
    }

    public ObjectNode getTransData()
    {
        return transData;
    }

    public void setTransData(ObjectNode transData)
    {
        this.transData = transData;
    }

    public String getExecutor()
    {
        return executor;
    }

    public void setExecutor(String executor)
    {
        this.executor = executor;
    }

    public Boolean getRefreshId()
    {
        return refreshId;
    }

    public void setRefreshId(Boolean refreshId)
    {
        this.refreshId = refreshId;
    }

    public Boolean getCheckNullAction()
    {
        return checkNullAction;
    }

    public void setCheckNullAction(Boolean checkNullAction)
    {
        this.checkNullAction = checkNullAction;
    }

    public String getPriority()
    {
        return priority;
    }

    public void setPriority(String priority)
    {
        this.priority = priority;
    }

    public String toString()
    {
        return (new StringBuilder("RuleCreateInDTO [ruleId=")).append(ruleId).append(", appKey=").append(appKey).append(", name=").append(name).append(", description=").append(description).append(", author=").append(author).append(", conditions=").append(conditions).append(", logic=").append(logic).append(", timeRange=").append(timeRange).append(", actions=").append(actions).append(", matchNow=").append(matchNow).append(", status=").append(status).append(", groupExpress=").append(groupExpress).append(", triggerSources=").append(triggerSources).append(", timezoneID=").append(timezoneID).append(", transData=").append(transData).append(", executor=").append(executor).append(", refreshId=").append(refreshId).append(", checkNullAction=").append(checkNullAction).append(", priority=").append(priority).append("]").toString();
    }

    private String ruleId;
    private String appKey;
    private String name;
    private String description;
    private String author;
    private List conditions;
    private String logic;
    private TimeRange timeRange;
    private List actions;
    private String matchNow;
    private String status;
    private GroupExpress groupExpress;
    private List triggerSources;
    private String timezoneID;
    private ObjectNode transData;
    private String executor;
    private Boolean refreshId;
    private Boolean checkNullAction;
    private String priority;
}
