package com.sdajava.hibernaterelations.inheritance.entity;

import java.io.Serializable;

public class Payment implements Serializable {
	private Integer paymentId;
	private double amount;

	public Integer getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
