package com.cathaybk.project.answer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class OrderDetailPKEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ORDER_NO")
	private long orderNo;

	@Id
	@Column(name = "ITEM_NO")
	private String itemNo;

	public long getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(long orderNo) {
		this.orderNo = orderNo;
	}

	public String getItemNo() {
		return itemNo;
	}

	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	/**
	 * 複寫equals方法
	 */
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}

		if (!(other instanceof OrderDetailPKEntity)) {
			return false;
		}

		OrderDetailPKEntity castOther = (OrderDetailPKEntity) other;

		return this.orderNo == castOther.orderNo && this.itemNo.equals(castOther.itemNo);
	}

	/**
	 * 複寫hashCode方法
	 */
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((Long)this.orderNo).hashCode();
		hash = hash * prime + this.itemNo.hashCode();
		
		return hash;
	}
}
