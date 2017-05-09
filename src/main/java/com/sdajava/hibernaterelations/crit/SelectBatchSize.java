package com.sdajava.hibernaterelations.crit;

import com.sdajava.hibernaterelations.entity.Address;
import com.sdajava.hibernaterelations.HibUtil;
import com.sdajava.hibernaterelations.entity.Employee;

import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;


public class SelectBatchSize {
public static void main(String[] args) {

	Session session = HibUtil.getSession();

	Criteria criteria = session.createCriteria(Employee.class);
	List<Employee> employees = criteria.list();

	for (Employee emp : employees) {
		System.out.println(emp.getEmpName());
		Set<Address> addList = emp.getAddress();
		for (Address add : addList) {
			System.out.println(add.getCountry());
		}
	}
}
}
