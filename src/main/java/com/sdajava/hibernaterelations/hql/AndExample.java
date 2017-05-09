package com.sdajava.hibernaterelations.hql;

import com.sdajava.hibernaterelations.HibUtil;
import com.sdajava.hibernaterelations.entity.Employee;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class AndExample {
public static void main(String[] args) {
	Session session = HibUtil.getSession();
	Query sql = session.createQuery("from Employee where empId=? and empName=?");
	sql.setInteger(0, 1);
	sql.setString(1, "Chandra");
	List<Employee> emps = sql.list();
	for (Employee emp : emps) {
		System.out.println("Emp Id "+emp.getEmpId());
		System.out.println("Emp Name "+emp.getEmpName());
		System.out.println("Email "+emp.getMailId());
		System.out.println("--------------------------------");
	}
}
}
