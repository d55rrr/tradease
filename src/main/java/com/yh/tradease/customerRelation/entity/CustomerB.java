package com.yh.tradease.customerRelation.entity;

import java.util.Date;
import java.util.List;

public class CustomerB {
    private Integer id;

    private String name;

    private String code;

    private String address;

    private Byte level;

    private String representative;

    private String phone;

    private String fax;

    private Byte bank;

    private String bankAccount;

    private String licenseno;

    private String taxLocalNo;

    private String taxNationalNo;

    private Double registerFee;

    private Double accountAmount;

    private String remark;

    private Byte status;

    private Date cdate;

    private Date mdate;

    private Byte flag;
    
    private List<CustomerbContacts> contacts;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Byte getLevel() {
        return level;
    }

    public void setLevel(Byte level) {
        this.level = level;
    }

    public String getRepresentative() {
        return representative;
    }

    public void setRepresentative(String representative) {
        this.representative = representative;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public Byte getBank() {
        return bank;
    }

    public void setBank(Byte bank) {
        this.bank = bank;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getLicenseno() {
        return licenseno;
    }

    public void setLicenseno(String licenseno) {
        this.licenseno = licenseno;
    }

    public String getTaxLocalNo() {
        return taxLocalNo;
    }

    public void setTaxLocalNo(String taxLocalNo) {
        this.taxLocalNo = taxLocalNo;
    }

    public String getTaxNationalNo() {
        return taxNationalNo;
    }

    public void setTaxNationalNo(String taxNationalNo) {
        this.taxNationalNo = taxNationalNo;
    }

    public Double getRegisterFee() {
        return registerFee;
    }

    public void setRegisterFee(Double registerFee) {
        this.registerFee = registerFee;
    }

    public Double getAccountAmount() {
        return accountAmount;
    }

    public void setAccountAmount(Double accountAmount) {
        this.accountAmount = accountAmount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCdate() {
        return cdate;
    }

    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }

    public Date getMdate() {
        return mdate;
    }

    public void setMdate(Date mdate) {
        this.mdate = mdate;
    }

    public Byte getFlag() {
        return flag;
    }

    public void setFlag(Byte flag) {
        this.flag = flag;
    }

	public List<CustomerbContacts> getContacts() {
		return contacts;
	}

	public void setContacts(List<CustomerbContacts> contacts) {
		this.contacts = contacts;
	}
    
}