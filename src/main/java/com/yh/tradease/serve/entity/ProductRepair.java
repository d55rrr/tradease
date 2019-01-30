package com.yh.tradease.serve.entity;

import java.util.Date;

public class ProductRepair {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_repair.id
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_repair.order_id
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    private Integer orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_repair.product_id
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    private Integer productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_repair.inner_code
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    private String innerCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_repair.outter_code
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    private String outterCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_repair.malfunction
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    private String malfunction;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_repair.malfunction_code
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    private String malfunctionCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_repair.repair_way
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    private String repairWay;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_repair.customer
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    private String customer;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_repair.phone
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_repair.address
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_repair.service_man
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    private String serviceMan;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_repair.man_id
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    private Integer manId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_repair.service_time
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    private Date serviceTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_repair.service_status
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    private Byte serviceStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_repair.cdate
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    private Date cdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_repair.mdate
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    private Date mdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_repair.flag
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    private Byte flag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_repair.remark
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_repair.id
     *
     * @return the value of product_repair.id
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_repair.id
     *
     * @param id the value for product_repair.id
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_repair.order_id
     *
     * @return the value of product_repair.order_id
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_repair.order_id
     *
     * @param orderId the value for product_repair.order_id
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_repair.product_id
     *
     * @return the value of product_repair.product_id
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_repair.product_id
     *
     * @param productId the value for product_repair.product_id
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_repair.inner_code
     *
     * @return the value of product_repair.inner_code
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    public String getInnerCode() {
        return innerCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_repair.inner_code
     *
     * @param innerCode the value for product_repair.inner_code
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    public void setInnerCode(String innerCode) {
        this.innerCode = innerCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_repair.outter_code
     *
     * @return the value of product_repair.outter_code
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    public String getOutterCode() {
        return outterCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_repair.outter_code
     *
     * @param outterCode the value for product_repair.outter_code
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    public void setOutterCode(String outterCode) {
        this.outterCode = outterCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_repair.malfunction
     *
     * @return the value of product_repair.malfunction
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    public String getMalfunction() {
        return malfunction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_repair.malfunction
     *
     * @param malfunction the value for product_repair.malfunction
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    public void setMalfunction(String malfunction) {
        this.malfunction = malfunction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_repair.malfunction_code
     *
     * @return the value of product_repair.malfunction_code
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    public String getMalfunctionCode() {
        return malfunctionCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_repair.malfunction_code
     *
     * @param malfunctionCode the value for product_repair.malfunction_code
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    public void setMalfunctionCode(String malfunctionCode) {
        this.malfunctionCode = malfunctionCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_repair.repair_way
     *
     * @return the value of product_repair.repair_way
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    public String getRepairWay() {
        return repairWay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_repair.repair_way
     *
     * @param repairWay the value for product_repair.repair_way
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    public void setRepairWay(String repairWay) {
        this.repairWay = repairWay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_repair.customer
     *
     * @return the value of product_repair.customer
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_repair.customer
     *
     * @param customer the value for product_repair.customer
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_repair.phone
     *
     * @return the value of product_repair.phone
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_repair.phone
     *
     * @param phone the value for product_repair.phone
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_repair.address
     *
     * @return the value of product_repair.address
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_repair.address
     *
     * @param address the value for product_repair.address
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_repair.service_man
     *
     * @return the value of product_repair.service_man
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    public String getServiceMan() {
        return serviceMan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_repair.service_man
     *
     * @param serviceMan the value for product_repair.service_man
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    public void setServiceMan(String serviceMan) {
        this.serviceMan = serviceMan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_repair.man_id
     *
     * @return the value of product_repair.man_id
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    public Integer getManId() {
        return manId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_repair.man_id
     *
     * @param manId the value for product_repair.man_id
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    public void setManId(Integer manId) {
        this.manId = manId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_repair.service_time
     *
     * @return the value of product_repair.service_time
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    public Date getServiceTime() {
        return serviceTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_repair.service_time
     *
     * @param serviceTime the value for product_repair.service_time
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    public void setServiceTime(Date serviceTime) {
        this.serviceTime = serviceTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_repair.service_status
     *
     * @return the value of product_repair.service_status
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    public Byte getServiceStatus() {
        return serviceStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_repair.service_status
     *
     * @param serviceStatus the value for product_repair.service_status
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    public void setServiceStatus(Byte serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_repair.cdate
     *
     * @return the value of product_repair.cdate
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    public Date getCdate() {
        return cdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_repair.cdate
     *
     * @param cdate the value for product_repair.cdate
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_repair.mdate
     *
     * @return the value of product_repair.mdate
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    public Date getMdate() {
        return mdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_repair.mdate
     *
     * @param mdate the value for product_repair.mdate
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    public void setMdate(Date mdate) {
        this.mdate = mdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_repair.flag
     *
     * @return the value of product_repair.flag
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    public Byte getFlag() {
        return flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_repair.flag
     *
     * @param flag the value for product_repair.flag
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    public void setFlag(Byte flag) {
        this.flag = flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_repair.remark
     *
     * @return the value of product_repair.remark
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_repair.remark
     *
     * @param remark the value for product_repair.remark
     *
     * @mbg.generated Tue Dec 18 01:18:05 CST 2018
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}