package com.sdajava.hibernaterelations.hql;

import com.sdajava.hibernaterelations.HibUtil;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class SelectName {
public static void main(String[] args) {
	Session session = HibUtil.getSession();
	Query sql = session.createQuery("select empName from Employee");

	List<String> emps = sql.list();
	for (String emp : emps) {
		System.out.println("Emp Name "+emp);
		System.out.println("--------------------------------");
	}
}
}
