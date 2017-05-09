package com.sdajava.hibernaterelations;

import com.sdajava.hibernaterelations.entity.Employee;
import com.sdajava.hibernaterelations.entity.Passport;

import org.hibernate.Session;

public class FetechOneToOne {
public static void main(String[] args) {
	Session session = HibUtil.getSession();
	Employee emp = (Employee) session.get(Employee.class, 2);
	System.out.println(emp.getEmpId());
	System.out.println(emp.getEmpName());
	System.out.println(emp.getMailId());

	Passport pspt = emp.getPassport();
	System.out.println(pspt.getId());
	System.out.println(pspt.getPassportNo());
	System.out.println(pspt.getExpryDt());
}
}
