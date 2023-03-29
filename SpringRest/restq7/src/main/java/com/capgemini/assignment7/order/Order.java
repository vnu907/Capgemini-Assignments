package com.capgemini.assignment7.order;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="orderDetail")
public class Order {

	@Id
	private String id;
	private String orderName;
	private String orderPrice;
	private String paymentStatus;

	public Order(String id, String orderName, String orderPrice, String paymentStatus) {
		super();
		this.id = id;
		this.orderName = orderName;
		this.orderPrice = orderPrice;
		this.paymentStatus = paymentStatus;
	}

	public Order() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(String orderPrice) {
		this.orderPrice = orderPrice;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

}
