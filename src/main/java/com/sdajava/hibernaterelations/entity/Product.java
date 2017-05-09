package com.sdajava.hibernaterelations.entity;

import java.io.Serializable;

public class Product implements Serializable{
	private ProductPk pk;
	private String productName;
	private Double cost;
	public ProductPk getPk() {
		return pk;
	}
	public void setPk(ProductPk pk) {
		this.pk = pk;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}

}
