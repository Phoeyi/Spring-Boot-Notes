package com.cathaybk.project.answer.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_CUSTOMER")
public class CustomerEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CUSTOMER_ID")
	private Long customerID;

	@Column(name = "NAME")
	private String name;

	@Column(name = "BIRTHDAY")
	private Date birthDay;

	@Column(name = "SEX")
	private String sex;

	@Column(name = "ID")
	private String ID;

	public Long getCustomerID() {
		return customerID;
	}

	public void setCustomerID(Long customerID) {
		this.customerID = customerID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}
}
