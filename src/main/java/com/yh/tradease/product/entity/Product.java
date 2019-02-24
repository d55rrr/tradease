package com.yh.tradease.product.entity;

import java.util.Date;

public class Product {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.id
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.name
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.type
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.type_name
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    private String typeName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.brand_name
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    private String brandName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.brand_id
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    private Integer brandId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.original
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    private String original;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.weight
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    private Double weight;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.code
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    private String code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.duration
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    private Double duration;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.buy_price
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    private Double buyPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.sale_price
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    private Double salePrice;
    
    private Double wholesalePrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.sale_status
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    private Byte saleStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.cdate
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    private Date cdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.mdate
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    private Date mdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.flag
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    private Byte flag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.id
     *
     * @return the value of product.id
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.id
     *
     * @param id the value for product.id
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.name
     *
     * @return the value of product.name
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.name
     *
     * @param name the value for product.name
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.type
     *
     * @return the value of product.type
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.type
     *
     * @param type the value for product.type
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.type_name
     *
     * @return the value of product.type_name
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.type_name
     *
     * @param typeName the value for product.type_name
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.brand_name
     *
     * @return the value of product.brand_name
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.brand_name
     *
     * @param brandName the value for product.brand_name
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.brand_id
     *
     * @return the value of product.brand_id
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    public Integer getBrandId() {
        return brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.brand_id
     *
     * @param brandId the value for product.brand_id
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.original
     *
     * @return the value of product.original
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    public String getOriginal() {
        return original;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.original
     *
     * @param original the value for product.original
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    public void setOriginal(String original) {
        this.original = original;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.weight
     *
     * @return the value of product.weight
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.weight
     *
     * @param weight the value for product.weight
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.code
     *
     * @return the value of product.code
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.code
     *
     * @param code the value for product.code
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.duration
     *
     * @return the value of product.duration
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    public Double getDuration() {
        return duration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.duration
     *
     * @param duration the value for product.duration
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    public void setDuration(Double duration) {
        this.duration = duration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.buy_price
     *
     * @return the value of product.buy_price
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    public Double getBuyPrice() {
        return buyPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.buy_price
     *
     * @param buyPrice the value for product.buy_price
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    public void setBuyPrice(Double buyPrice) {
        this.buyPrice = buyPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.sale_price
     *
     * @return the value of product.sale_price
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    public Double getSalePrice() {
        return salePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.sale_price
     *
     * @param salePrice the value for product.sale_price
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.sale_status
     *
     * @return the value of product.sale_status
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    public Byte getSaleStatus() {
        return saleStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.sale_status
     *
     * @param saleStatus the value for product.sale_status
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    public void setSaleStatus(Byte saleStatus) {
        this.saleStatus = saleStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.cdate
     *
     * @return the value of product.cdate
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    public Date getCdate() {
        return cdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.cdate
     *
     * @param cdate the value for product.cdate
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.mdate
     *
     * @return the value of product.mdate
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    public Date getMdate() {
        return mdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.mdate
     *
     * @param mdate the value for product.mdate
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    public void setMdate(Date mdate) {
        this.mdate = mdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.flag
     *
     * @return the value of product.flag
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    public Byte getFlag() {
        return flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.flag
     *
     * @param flag the value for product.flag
     *
     * @mbg.generated Sun Dec 23 23:11:34 CST 2018
     */
    public void setFlag(Byte flag) {
        this.flag = flag;
    }

	public Double getWholesalePrice() {
		return wholesalePrice;
	}

	public void setWholesalePrice(Double wholesalePrice) {
		this.wholesalePrice = wholesalePrice;
	}
    
}