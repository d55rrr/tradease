package com.yh.tradease.stock.entity;

import java.util.Date;

public class OutStock {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column out_stock.id
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column out_stock.order_type
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    private Byte orderType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column out_stock.order_id
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    private Integer orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column out_stock.name
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column out_stock.out_date
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    private Date outDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column out_stock.transactor
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    private String transactor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column out_stock.transactor_id
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    private Integer transactorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column out_stock.out_type
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    private Byte outType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column out_stock.delivery_type
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    private Byte deliveryType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column out_stock.seller
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    private String seller;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column out_stock.seller_id
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    private Integer sellerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column out_stock.buyer
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    private String buyer;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column out_stock.buyer_id
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    private Integer buyerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column out_stock.remark
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column out_stock.cdate
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    private Date cdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column out_stock.mdate
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    private Date mdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column out_stock.flag
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    private Byte flag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column out_stock.out_status
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    private Byte outStatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column out_stock.id
     *
     * @return the value of out_stock.id
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column out_stock.id
     *
     * @param id the value for out_stock.id
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column out_stock.order_type
     *
     * @return the value of out_stock.order_type
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    public Byte getOrderType() {
        return orderType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column out_stock.order_type
     *
     * @param orderType the value for out_stock.order_type
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    public void setOrderType(Byte orderType) {
        this.orderType = orderType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column out_stock.order_id
     *
     * @return the value of out_stock.order_id
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column out_stock.order_id
     *
     * @param orderId the value for out_stock.order_id
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column out_stock.name
     *
     * @return the value of out_stock.name
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column out_stock.name
     *
     * @param name the value for out_stock.name
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column out_stock.out_date
     *
     * @return the value of out_stock.out_date
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    public Date getOutDate() {
        return outDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column out_stock.out_date
     *
     * @param outDate the value for out_stock.out_date
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column out_stock.transactor
     *
     * @return the value of out_stock.transactor
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    public String getTransactor() {
        return transactor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column out_stock.transactor
     *
     * @param transactor the value for out_stock.transactor
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    public void setTransactor(String transactor) {
        this.transactor = transactor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column out_stock.transactor_id
     *
     * @return the value of out_stock.transactor_id
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    public Integer getTransactorId() {
        return transactorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column out_stock.transactor_id
     *
     * @param transactorId the value for out_stock.transactor_id
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    public void setTransactorId(Integer transactorId) {
        this.transactorId = transactorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column out_stock.out_type
     *
     * @return the value of out_stock.out_type
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    public Byte getOutType() {
        return outType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column out_stock.out_type
     *
     * @param outType the value for out_stock.out_type
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    public void setOutType(Byte outType) {
        this.outType = outType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column out_stock.delivery_type
     *
     * @return the value of out_stock.delivery_type
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    public Byte getDeliveryType() {
        return deliveryType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column out_stock.delivery_type
     *
     * @param deliveryType the value for out_stock.delivery_type
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    public void setDeliveryType(Byte deliveryType) {
        this.deliveryType = deliveryType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column out_stock.seller
     *
     * @return the value of out_stock.seller
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    public String getSeller() {
        return seller;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column out_stock.seller
     *
     * @param seller the value for out_stock.seller
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    public void setSeller(String seller) {
        this.seller = seller;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column out_stock.seller_id
     *
     * @return the value of out_stock.seller_id
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    public Integer getSellerId() {
        return sellerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column out_stock.seller_id
     *
     * @param sellerId the value for out_stock.seller_id
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column out_stock.buyer
     *
     * @return the value of out_stock.buyer
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    public String getBuyer() {
        return buyer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column out_stock.buyer
     *
     * @param buyer the value for out_stock.buyer
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column out_stock.buyer_id
     *
     * @return the value of out_stock.buyer_id
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    public Integer getBuyerId() {
        return buyerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column out_stock.buyer_id
     *
     * @param buyerId the value for out_stock.buyer_id
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column out_stock.remark
     *
     * @return the value of out_stock.remark
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column out_stock.remark
     *
     * @param remark the value for out_stock.remark
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column out_stock.cdate
     *
     * @return the value of out_stock.cdate
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    public Date getCdate() {
        return cdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column out_stock.cdate
     *
     * @param cdate the value for out_stock.cdate
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column out_stock.mdate
     *
     * @return the value of out_stock.mdate
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    public Date getMdate() {
        return mdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column out_stock.mdate
     *
     * @param mdate the value for out_stock.mdate
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    public void setMdate(Date mdate) {
        this.mdate = mdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column out_stock.flag
     *
     * @return the value of out_stock.flag
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    public Byte getFlag() {
        return flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column out_stock.flag
     *
     * @param flag the value for out_stock.flag
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    public void setFlag(Byte flag) {
        this.flag = flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column out_stock.out_status
     *
     * @return the value of out_stock.out_status
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    public Byte getOutStatus() {
        return outStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column out_stock.out_status
     *
     * @param outStatus the value for out_stock.out_status
     *
     * @mbg.generated Thu Dec 20 01:35:20 CST 2018
     */
    public void setOutStatus(Byte outStatus) {
        this.outStatus = outStatus;
    }
}