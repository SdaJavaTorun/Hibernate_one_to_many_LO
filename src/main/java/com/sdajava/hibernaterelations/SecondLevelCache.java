package com.sdajava.hibernaterelations;

import com.sdajava.hibernaterelations.entity.Employee;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class SecondLevelCache {
public static void main(String[] args) {
	Session session1 = HibUtil.getSession();
	Employee emp1 = (Employee) session1.get(Employee.class, 1);

	System.out.println(emp1.getEmpName());
	Session session2 = HibUtil.getSession();
	Transaction tx = session2.beginTransaction();
	Employee emp2 = (Employee) session2.get(Employee.class, 1);
	emp2.setEmpName("Kammana");
	tx.commit();
	System.out.println(emp2.getEmpName());

}
}
