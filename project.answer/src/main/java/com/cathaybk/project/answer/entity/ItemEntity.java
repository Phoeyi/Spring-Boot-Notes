package com.cathaybk.project.answer.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ItemEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ITEM_NO")
	private String itemNo;
	
	@Column(name = "ITEM_NAME")
	private String itemName;
	
	@Column(name = "PRICE")
	private BigDecimal price;
}
