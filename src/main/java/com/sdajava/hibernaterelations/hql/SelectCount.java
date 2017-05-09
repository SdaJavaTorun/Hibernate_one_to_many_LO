package com.sdajava.hibernaterelations.hql;

import com.sdajava.hibernaterelations.HibUtil;

import org.hibernate.Query;
import org.hibernate.Session;

public class SelectCount {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Query sql = session.createQuery("select count(empName) from Employee");
		long count = (Long) sql.uniqueResult();
		System.out.println("No of Employees "+count);

	}
}
