package com.erp.view.model;

import java.util.List;

public class ViewOrders
{
    private Long orderDate;
    private ViewShippingInfo shippingInfo;
    private List<ViewOrderItem> items;
    public Long getOrderDate()
    {
        return orderDate;
    }
    public void setOrderDate(Long orderDate)
    {
        this.orderDate = orderDate;
    }
    public ViewShippingInfo getShippingInfo()
    {
        return shippingInfo;
    }
    public void setShippingInfo(ViewShippingInfo shippingInfo)
    {
        this.shippingInfo = shippingInfo;
    }
    public List<ViewOrderItem> getItems()
    {
        return items;
    }
    public void setItems(List<ViewOrderItem> items)
    {
        this.items = items;
    }
   
}
