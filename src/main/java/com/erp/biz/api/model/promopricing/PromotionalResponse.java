package com.erp.biz.api.model.promopricing;

import java.util.List;

import com.erp.biz.api.model.response.Errors;

public class PromotionalResponse
{
    private String status;

    private List<Errors> errors;

    private Header header;

    private Payload payload;

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return this.status;
    }

    public void setErrors(List<Errors> errors)
    {
        this.errors = errors;
    }

    public List<Errors> getErrors()
    {
        return this.errors;
    }

    public void setHeader(Header header)
    {
        this.header = header;
    }

    public Header getHeader()
    {
        return this.header;
    }

    public void setPayload(Payload payload)
    {
        this.payload = payload;
    }

    public Payload getPayload()
    {
        return this.payload;
    }
}
