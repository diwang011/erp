package com.erp.db.model;

public class Charges {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column charges.id
     *
     * @mbggenerated Tue Jul 11 11:08:57 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column charges.orderItemId
     *
     * @mbggenerated Tue Jul 11 11:08:57 CST 2017
     */
    private Integer orderItemId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column charges.chargeType
     *
     * @mbggenerated Tue Jul 11 11:08:57 CST 2017
     */
    private String chargeType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column charges.chargeName
     *
     * @mbggenerated Tue Jul 11 11:08:57 CST 2017
     */
    private String chargeName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column charges.chargeAmount
     *
     * @mbggenerated Tue Jul 11 11:08:57 CST 2017
     */
    private Double chargeAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column charges.chargeCurrency
     *
     * @mbggenerated Tue Jul 11 11:08:57 CST 2017
     */
    private String chargeCurrency;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column charges.taxName
     *
     * @mbggenerated Tue Jul 11 11:08:57 CST 2017
     */
    private String taxName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column charges.taxAmount
     *
     * @mbggenerated Tue Jul 11 11:08:57 CST 2017
     */
    private Double taxAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column charges.taxCurrency
     *
     * @mbggenerated Tue Jul 11 11:08:57 CST 2017
     */
    private String taxCurrency;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column charges.refundReason
     *
     * @mbggenerated Tue Jul 11 11:08:57 CST 2017
     */
    private String refundReason;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column charges.chargeCategory
     *
     * @mbggenerated Tue Jul 11 11:08:57 CST 2017
     */
    private String chargeCategory;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column charges.id
     *
     * @return the value of charges.id
     *
     * @mbggenerated Tue Jul 11 11:08:57 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column charges.id
     *
     * @param id the value for charges.id
     *
     * @mbggenerated Tue Jul 11 11:08:57 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column charges.orderItemId
     *
     * @return the value of charges.orderItemId
     *
     * @mbggenerated Tue Jul 11 11:08:57 CST 2017
     */
    public Integer getOrderItemId() {
        return orderItemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column charges.orderItemId
     *
     * @param orderItemId the value for charges.orderItemId
     *
     * @mbggenerated Tue Jul 11 11:08:57 CST 2017
     */
    public void setOrderItemId(Integer orderItemId) {
        this.orderItemId = orderItemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column charges.chargeType
     *
     * @return the value of charges.chargeType
     *
     * @mbggenerated Tue Jul 11 11:08:57 CST 2017
     */
    public String getChargeType() {
        return chargeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column charges.chargeType
     *
     * @param chargeType the value for charges.chargeType
     *
     * @mbggenerated Tue Jul 11 11:08:57 CST 2017
     */
    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column charges.chargeName
     *
     * @return the value of charges.chargeName
     *
     * @mbggenerated Tue Jul 11 11:08:57 CST 2017
     */
    public String getChargeName() {
        return chargeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column charges.chargeName
     *
     * @param chargeName the value for charges.chargeName
     *
     * @mbggenerated Tue Jul 11 11:08:57 CST 2017
     */
    public void setChargeName(String chargeName) {
        this.chargeName = chargeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column charges.chargeAmount
     *
     * @return the value of charges.chargeAmount
     *
     * @mbggenerated Tue Jul 11 11:08:57 CST 2017
     */
    public Double getChargeAmount() {
        return chargeAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column charges.chargeAmount
     *
     * @param chargeAmount the value for charges.chargeAmount
     *
     * @mbggenerated Tue Jul 11 11:08:57 CST 2017
     */
    public void setChargeAmount(Double chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column charges.chargeCurrency
     *
     * @return the value of charges.chargeCurrency
     *
     * @mbggenerated Tue Jul 11 11:08:57 CST 2017
     */
    public String getChargeCurrency() {
        return chargeCurrency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column charges.chargeCurrency
     *
     * @param chargeCurrency the value for charges.chargeCurrency
     *
     * @mbggenerated Tue Jul 11 11:08:57 CST 2017
     */
    public void setChargeCurrency(String chargeCurrency) {
        this.chargeCurrency = chargeCurrency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column charges.taxName
     *
     * @return the value of charges.taxName
     *
     * @mbggenerated Tue Jul 11 11:08:57 CST 2017
     */
    public String getTaxName() {
        return taxName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column charges.taxName
     *
     * @param taxName the value for charges.taxName
     *
     * @mbggenerated Tue Jul 11 11:08:57 CST 2017
     */
    public void setTaxName(String taxName) {
        this.taxName = taxName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column charges.taxAmount
     *
     * @return the value of charges.taxAmount
     *
     * @mbggenerated Tue Jul 11 11:08:57 CST 2017
     */
    public Double getTaxAmount() {
        return taxAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column charges.taxAmount
     *
     * @param taxAmount the value for charges.taxAmount
     *
     * @mbggenerated Tue Jul 11 11:08:57 CST 2017
     */
    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column charges.taxCurrency
     *
     * @return the value of charges.taxCurrency
     *
     * @mbggenerated Tue Jul 11 11:08:57 CST 2017
     */
    public String getTaxCurrency() {
        return taxCurrency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column charges.taxCurrency
     *
     * @param taxCurrency the value for charges.taxCurrency
     *
     * @mbggenerated Tue Jul 11 11:08:57 CST 2017
     */
    public void setTaxCurrency(String taxCurrency) {
        this.taxCurrency = taxCurrency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column charges.refundReason
     *
     * @return the value of charges.refundReason
     *
     * @mbggenerated Tue Jul 11 11:08:57 CST 2017
     */
    public String getRefundReason() {
        return refundReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column charges.refundReason
     *
     * @param refundReason the value for charges.refundReason
     *
     * @mbggenerated Tue Jul 11 11:08:57 CST 2017
     */
    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column charges.chargeCategory
     *
     * @return the value of charges.chargeCategory
     *
     * @mbggenerated Tue Jul 11 11:08:57 CST 2017
     */
    public String getChargeCategory() {
        return chargeCategory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column charges.chargeCategory
     *
     * @param chargeCategory the value for charges.chargeCategory
     *
     * @mbggenerated Tue Jul 11 11:08:57 CST 2017
     */
    public void setChargeCategory(String chargeCategory) {
        this.chargeCategory = chargeCategory;
    }
}