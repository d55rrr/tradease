package com.yh.tradease.sales.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;
import com.yh.tradease.mybatis.entity.BaseEntity;

public class SaleRecord{

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sale_record.id
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sale_record.broker
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	private Integer broker;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sale_record.total_price
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	private Double totalPrice;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sale_record.name
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sale_record.type
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	private Byte type;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sale_record.real_price
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	private Double realPrice;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sale_record.payed
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	private Double payed;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sale_record.unpayed
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	private Double unpayed;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sale_record.buyer
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	private String buyer;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sale_record.buyer_phone
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	private String buyerPhone;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sale_record.buy_time
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:ss:mm")
	private Date buyTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sale_record.receiver
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	private String receiver;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sale_record.receiver_phone
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	private String receiverPhone;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sale_record.customer_type
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	private Byte customerType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sale_record.delivery_time
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:ss:mm")
	private Date deliveryTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sale_record.delivery_address
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	private String deliveryAddress;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sale_record.service_status
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	private Byte serviceStatus;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sale_record.pay_status
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	private Byte payStatus;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sale_record.cdate
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:ss:mm")
	private Date cdate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sale_record.mdate
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:ss:mm")
	private Date mdate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sale_record.flag
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	private Byte flag;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sale_record.id
	 * @return  the value of sale_record.id
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sale_record.id
	 * @param id  the value for sale_record.id
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sale_record.broker
	 * @return  the value of sale_record.broker
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	public Integer getBroker() {
		return broker;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sale_record.broker
	 * @param broker  the value for sale_record.broker
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	public void setBroker(Integer broker) {
		this.broker = broker;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sale_record.total_price
	 * @return  the value of sale_record.total_price
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	public Double getTotalPrice() {
		return totalPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sale_record.total_price
	 * @param totalPrice  the value for sale_record.total_price
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sale_record.name
	 * @return  the value of sale_record.name
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sale_record.name
	 * @param name  the value for sale_record.name
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sale_record.type
	 * @return  the value of sale_record.type
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	public Byte getType() {
		return type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sale_record.type
	 * @param type  the value for sale_record.type
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	public void setType(Byte type) {
		this.type = type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sale_record.real_price
	 * @return  the value of sale_record.real_price
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	public Double getRealPrice() {
		return realPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sale_record.real_price
	 * @param realPrice  the value for sale_record.real_price
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	public void setRealPrice(Double realPrice) {
		this.realPrice = realPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sale_record.payed
	 * @return  the value of sale_record.payed
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	public Double getPayed() {
		return payed;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sale_record.payed
	 * @param payed  the value for sale_record.payed
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	public void setPayed(Double payed) {
		this.payed = payed;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sale_record.unpayed
	 * @return  the value of sale_record.unpayed
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	public Double getUnpayed() {
		return unpayed;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sale_record.unpayed
	 * @param unpayed  the value for sale_record.unpayed
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	public void setUnpayed(Double unpayed) {
		this.unpayed = unpayed;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sale_record.buyer
	 * @return  the value of sale_record.buyer
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	public String getBuyer() {
		return buyer;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sale_record.buyer
	 * @param buyer  the value for sale_record.buyer
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sale_record.buyer_phone
	 * @return  the value of sale_record.buyer_phone
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	public String getBuyerPhone() {
		return buyerPhone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sale_record.buyer_phone
	 * @param buyerPhone  the value for sale_record.buyer_phone
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	public void setBuyerPhone(String buyerPhone) {
		this.buyerPhone = buyerPhone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sale_record.buy_time
	 * @return  the value of sale_record.buy_time
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	public Date getBuyTime() {
		return buyTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sale_record.buy_time
	 * @param buyTime  the value for sale_record.buy_time
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	public void setBuyTime(Date buyTime) {
		this.buyTime = buyTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sale_record.receiver
	 * @return  the value of sale_record.receiver
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	public String getReceiver() {
		return receiver;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sale_record.receiver
	 * @param receiver  the value for sale_record.receiver
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sale_record.receiver_phone
	 * @return  the value of sale_record.receiver_phone
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	public String getReceiverPhone() {
		return receiverPhone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sale_record.receiver_phone
	 * @param receiverPhone  the value for sale_record.receiver_phone
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sale_record.customer_type
	 * @return  the value of sale_record.customer_type
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	public Byte getCustomerType() {
		return customerType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sale_record.customer_type
	 * @param customerType  the value for sale_record.customer_type
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	public void setCustomerType(Byte customerType) {
		this.customerType = customerType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sale_record.delivery_time
	 * @return  the value of sale_record.delivery_time
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	public Date getDeliveryTime() {
		return deliveryTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sale_record.delivery_time
	 * @param deliveryTime  the value for sale_record.delivery_time
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	public void setDeliveryTime(Date deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sale_record.delivery_address
	 * @return  the value of sale_record.delivery_address
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sale_record.delivery_address
	 * @param deliveryAddress  the value for sale_record.delivery_address
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sale_record.service_status
	 * @return  the value of sale_record.service_status
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	public Byte getServiceStatus() {
		return serviceStatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sale_record.service_status
	 * @param serviceStatus  the value for sale_record.service_status
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	public void setServiceStatus(Byte serviceStatus) {
		this.serviceStatus = serviceStatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sale_record.pay_status
	 * @return  the value of sale_record.pay_status
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	public Byte getPayStatus() {
		return payStatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sale_record.pay_status
	 * @param payStatus  the value for sale_record.pay_status
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	public void setPayStatus(Byte payStatus) {
		this.payStatus = payStatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sale_record.cdate
	 * @return  the value of sale_record.cdate
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	public Date getCdate() {
		return cdate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sale_record.cdate
	 * @param cdate  the value for sale_record.cdate
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sale_record.mdate
	 * @return  the value of sale_record.mdate
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	public Date getMdate() {
		return mdate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sale_record.mdate
	 * @param mdate  the value for sale_record.mdate
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	public void setMdate(Date mdate) {
		this.mdate = mdate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sale_record.flag
	 * @return  the value of sale_record.flag
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	public Byte getFlag() {
		return flag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sale_record.flag
	 * @param flag  the value for sale_record.flag
	 * @mbg.generated  Mon Dec 10 23:32:09 CST 2018
	 */
	public void setFlag(Byte flag) {
		this.flag = flag;
	}
}