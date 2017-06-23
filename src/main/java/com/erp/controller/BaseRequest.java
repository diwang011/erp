package com.erp.controller;

import com.erp.common.Common;

public class BaseRequest<T>
{
    private T data;
    private String token;
    private Integer offset;

    public Integer getOffset()
    {
        return (offset - 1) * Common.LIMIT;
    }

    public void setOffset(Integer offset)
    {
        this.offset = offset;
    }

    public T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }

    public String getToken()
    {
        return token;
    }

    public void setToken(String token)
    {
        this.token = token;
    }

}
