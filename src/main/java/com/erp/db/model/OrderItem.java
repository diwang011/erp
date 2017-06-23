package com.erp.db.model;

public class OrderItem {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderitem.id
     *
     * @mbggenerated Thu Jun 01 11:33:08 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderitem.lineNumber
     *
     * @mbggenerated Thu Jun 01 11:33:08 CST 2017
     */
    private String lineNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderitem.sku
     *
     * @mbggenerated Thu Jun 01 11:33:08 CST 2017
     */
    private String sku;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderitem.amount
     *
     * @mbggenerated Thu Jun 01 11:33:08 CST 2017
     */
    private Double amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderitem.unit
     *
     * @mbggenerated Thu Jun 01 11:33:08 CST 2017
     */
    private String unit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderitem.orderId
     *
     * @mbggenerated Thu Jun 01 11:33:08 CST 2017
     */
    private Integer orderId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderitem.id
     *
     * @return the value of orderitem.id
     *
     * @mbggenerated Thu Jun 01 11:33:08 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderitem.id
     *
     * @param id the value for orderitem.id
     *
     * @mbggenerated Thu Jun 01 11:33:08 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderitem.lineNumber
     *
     * @return the value of orderitem.lineNumber
     *
     * @mbggenerated Thu Jun 01 11:33:08 CST 2017
     */
    public String getLineNumber() {
        return lineNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderitem.lineNumber
     *
     * @param lineNumber the value for orderitem.lineNumber
     *
     * @mbggenerated Thu Jun 01 11:33:08 CST 2017
     */
    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderitem.sku
     *
     * @return the value of orderitem.sku
     *
     * @mbggenerated Thu Jun 01 11:33:08 CST 2017
     */
    public String getSku() {
        return sku;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderitem.sku
     *
     * @param sku the value for orderitem.sku
     *
     * @mbggenerated Thu Jun 01 11:33:08 CST 2017
     */
    public void setSku(String sku) {
        this.sku = sku;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderitem.amount
     *
     * @return the value of orderitem.amount
     *
     * @mbggenerated Thu Jun 01 11:33:08 CST 2017
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderitem.amount
     *
     * @param amount the value for orderitem.amount
     *
     * @mbggenerated Thu Jun 01 11:33:08 CST 2017
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderitem.unit
     *
     * @return the value of orderitem.unit
     *
     * @mbggenerated Thu Jun 01 11:33:08 CST 2017
     */
    public String getUnit() {
        return unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderitem.unit
     *
     * @param unit the value for orderitem.unit
     *
     * @mbggenerated Thu Jun 01 11:33:08 CST 2017
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderitem.orderId
     *
     * @return the value of orderitem.orderId
     *
     * @mbggenerated Thu Jun 01 11:33:08 CST 2017
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderitem.orderId
     *
     * @param orderId the value for orderitem.orderId
     *
     * @mbggenerated Thu Jun 01 11:33:08 CST 2017
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}