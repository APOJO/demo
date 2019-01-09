// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Pagination.java

package com.iotplatform.client.dto;


public class Pagination
{

    public Pagination()
    {
    }

    public long getPageNo()
    {
        return pageNo;
    }

    public void setPageNo(long pageNo)
    {
        this.pageNo = pageNo;
    }

    public long getPageSize()
    {
        return pageSize;
    }

    public void setPageSize(long pageSize)
    {
        this.pageSize = pageSize;
    }

    public long getTotalSize()
    {
        return totalSize;
    }

    public void setTotalSize(long totalSize)
    {
        this.totalSize = totalSize;
    }

    public String toString()
    {
        return (new StringBuilder("Pagination [pageNo=")).append(pageNo).append(", pageSize=").append(pageSize).append(", totalSize=").append(totalSize).append("]").toString();
    }

    private long pageNo;
    private long pageSize;
    private long totalSize;
}
