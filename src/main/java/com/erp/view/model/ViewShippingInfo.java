package com.erp.view.model;

public class ViewShippingInfo
{
    private String phone;
    private Long estimatedDeliveryDate;
    private Long estimatedShipDate;
    //"methodCode": "VALUE",
    //    "postalAddress": {
    private String name;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    private String addressType;
    public String getPhone()
    {
        return phone;
    }
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    public Long getEstimatedDeliveryDate()
    {
        return estimatedDeliveryDate;
    }
    public void setEstimatedDeliveryDate(Long estimatedDeliveryDate)
    {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }
    public Long getEstimatedShipDate()
    {
        return estimatedShipDate;
    }
    public void setEstimatedShipDate(Long estimatedShipDate)
    {
        this.estimatedShipDate = estimatedShipDate;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getAddress1()
    {
        return address1;
    }
    public void setAddress1(String address1)
    {
        this.address1 = address1;
    }
    public String getAddress2()
    {
        return address2;
    }
    public void setAddress2(String address2)
    {
        this.address2 = address2;
    }
    public String getCity()
    {
        return city;
    }
    public void setCity(String city)
    {
        this.city = city;
    }
    public String getState()
    {
        return state;
    }
    public void setState(String state)
    {
        this.state = state;
    }
    public String getPostalCode()
    {
        return postalCode;
    }
    public void setPostalCode(String postalCode)
    {
        this.postalCode = postalCode;
    }
    public String getCountry()
    {
        return country;
    }
    public void setCountry(String country)
    {
        this.country = country;
    }
    public String getAddressType()
    {
        return addressType;
    }
    public void setAddressType(String addressType)
    {
        this.addressType = addressType;
    }
}
