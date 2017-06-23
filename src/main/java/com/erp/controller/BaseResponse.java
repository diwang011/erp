package com.erp.controller;

import java.util.Collection;

public class BaseResponse<T>
{
    private String error;
    private T data;
    private Integer total;

    /**
     * Check if the response has data, if it's a collection make sure it has element
     */
    public boolean hasData()
    {
        if (data == null)
        {
            return false;
        }

        if (data instanceof Collection)
        {
            Collection<?> list = (Collection<?>) data;
            return list.size() > 0;
        }
        return true;
    }

    public T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }

    public String getError()
    {
        if (error != null)
        {
            if ("Token Failure".equals(error))
            {
                error = error + ", please login again...";
            }
            else
            {
                error = error + ", please try again...";
            }

        }
        return error;
    }

    public void setError(String error)
    {
        this.error = error;
    }

    public Integer getTotal()
    {
        return total;
    }

    public void setTotal(Integer total)
    {
        this.total = total;
    }

}
