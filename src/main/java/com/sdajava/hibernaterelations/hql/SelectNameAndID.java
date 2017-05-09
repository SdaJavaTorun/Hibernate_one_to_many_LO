package com.sdajava.hibernaterelations.hql;

import com.sdajava.hibernaterelations.HibUtil;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class SelectNameAndID {
public static void main(String[] args) {
	Session session = HibUtil.getSession();
	Query sql = session.createQuery("select empName,empId from Employee");

	List<Object[]> emps = sql.list();
	for (Object[] emp : emps) {
		System.out.println("Emp Name "+emp[0]);
		System.out.println("Emp Id "+emp[1]);
		System.out.println("--------------------------------");
	}
}
}
