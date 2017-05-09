package com.sdajava.hibernaterelations.crit;

import java.util.List;

import com.sdajava.hibernaterelations.entity.Employee;
import com.sdajava.hibernaterelations.HibUtil;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;


public class OrdeyBy {
public static void main(String[] args) {

	Session session = HibUtil.getSession();

	Criteria criteria = session.createCriteria(Employee.class);
	criteria.addOrder(Order.desc("empName"));
	List<Employee> employees = criteria.list();

	for (Employee emp : employees) {
		System.out.println(emp.getEmpName());
		System.out.println(emp.getMailId());
		System.out.println("************************************");
	}
}
}
