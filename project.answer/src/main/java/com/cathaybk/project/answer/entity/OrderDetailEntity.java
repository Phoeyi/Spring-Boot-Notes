package com.cathaybk.project.answer.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrderDetailEntity implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ORDER_NO")
	private long orderNo;
	
	@Id
	@Column(name = "ITEM_NO")
	private String itemNo;
	
	@Column(name = "COUNT")
	private int count;
	
	@Column(name = "MONEY")
	private BigDecimal money;
}
