package com.sdajava.hibernaterelations.hql;

import com.sdajava.hibernaterelations.HibUtil;
import com.sdajava.hibernaterelations.entity.Employee;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

public class NativeSQLSelectAll {
public static void main(String[] args) {
	Session session = HibUtil.getSession();
	SQLQuery sql = session.createSQLQuery("select * from EMPLOYEE");
	sql.addEntity(Employee.class);
	List<Employee> emps = sql.list();
	for (Employee emp : emps) {
		System.out.println("Emp Id "+emp.getEmpId());
		System.out.println("Emp Name "+emp.getEmpName());
		System.out.println("Email "+emp.getMailId());
		System.out.println("--------------------------------");
	}
}
}
