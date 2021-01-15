package com.cathaybk.project.answer.dto;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderResponse {

	@JsonProperty(value = "Message")
	private String message;

	@JsonProperty(value = "Datas")
	private List<Data> datas;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Data> getDatas() {
		return datas;
	}

	public void setDatas(List<Data> datas) {
		this.datas = datas;
	}

	public static class Data {

		@JsonProperty(value = "ORDER_NO")
		private long orderNo;

		@JsonProperty(value = "CUST_ID")
		private String customerID;

		@JsonProperty(value = "MONEY")
		private BigDecimal money;

		@JsonProperty(value = "EMP_ID")
		private String empID;

		@JsonProperty(value = "OREDER_DATE")
		private Date orderDate;

		@JsonProperty(value = "ARRIVAL_DATE")
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
}
