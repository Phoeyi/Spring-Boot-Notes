package com.cathaybk.project.answer.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_ORDER")
public class OrderEntity implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ORDER_NO")
	private long orderNo;

	@Column(name = "CUST_ID")
	private String customerID;
	
	@Column(name = "MONEY")
	private BigDecimal money;
	
	@Column(name = "EMP_ID")
	private String empID;
	
	@Column(name = "OREDER_DATE")
	private Date orderDate;
	
	@Column(name = "ARRIVAL_DATE")
	private Date arrivalDate;

	public long getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(long orderNo) {
		this.orderNo = orderNo;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public BigDecimal getMoney() {
		return money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	
}
