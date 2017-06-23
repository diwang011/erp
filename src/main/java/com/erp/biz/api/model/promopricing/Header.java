package com.erp.biz.api.model.promopricing;

import java.util.List;

import com.erp.biz.api.model.response.ServiceHeader.HeaderAttributes;

public class Header
{
    private List<HeaderAttributes> headerAttributes;

    public void setHeaderAttributes(List<HeaderAttributes> headerAttributes)
    {
        this.headerAttributes = headerAttributes;
    }

    public List<HeaderAttributes> getHeaderAttributes()
    {
        return this.headerAttributes;
    }
}
