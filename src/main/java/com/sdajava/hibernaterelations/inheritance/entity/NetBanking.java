package com.sdajava.hibernaterelations.inheritance.entity;

public class NetBanking extends Payment{
	private String bankName;
	private String accNumber;
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

}
