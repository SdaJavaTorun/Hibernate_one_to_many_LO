package com.sdajava.hibernaterelations.entity;

import java.io.Serializable;
import java.util.Date;

public class Passport implements Serializable{
	private int id;
	private String passportNo;
	private Date expryDt;
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	public Date getExpryDt() {
		return expryDt;
	}
	public void setExpryDt(Date expryDt) {
		this.expryDt = expryDt;
	}

}
