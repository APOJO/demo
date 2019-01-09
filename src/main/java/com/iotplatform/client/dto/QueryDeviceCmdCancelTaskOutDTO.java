// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QueryDeviceCmdCancelTaskOutDTO.java

package com.iotplatform.client.dto;

import java.util.List;

// Referenced classes of package com.iotplatform.client.dto:
//            Pagination

/**
 * @deprecated Class QueryDeviceCmdCancelTaskOutDTO is deprecated
 */

public class QueryDeviceCmdCancelTaskOutDTO
{

    public QueryDeviceCmdCancelTaskOutDTO()
    {
    }

    public Pagination getPagination()
    {
        return pagination;
    }

    public void setPagination(Pagination pagination)
    {
        this.pagination = pagination;
    }

    public List getData()
    {
        return data;
    }

    public void setData(List data)
    {
        this.data = data;
    }

    public String toString()
    {
        return (new StringBuilder("QueryDeviceCmdCancelTaskOutDTO [pagination=")).append(pagination).append(", data=").append(data).append("]").toString();
    }

    private Pagination pagination;
    private List data;
}
