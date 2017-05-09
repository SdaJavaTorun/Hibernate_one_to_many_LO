package com.sdajava.hibernaterelations.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Employee implements Serializable{
	private int empId;
	private String empName;
	private String mailId;
	private Set<Address> address = new HashSet<Address>();
	private Passport passport;

	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public Set<Address> getAddress() {
		return address;
	}
	public void setAddress(Set<Address> address) {
		this.address = address;
	}



}
