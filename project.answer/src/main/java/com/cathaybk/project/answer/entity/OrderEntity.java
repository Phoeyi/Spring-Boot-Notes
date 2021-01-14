package com.cathaybk.project.answer.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
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
	
}
