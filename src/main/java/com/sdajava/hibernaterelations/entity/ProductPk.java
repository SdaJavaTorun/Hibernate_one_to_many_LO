package com.sdajava.hibernaterelations.entity;

import java.io.Serializable;

public class ProductPk implements Serializable{
	private int productId;
	private int customerId;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

}
