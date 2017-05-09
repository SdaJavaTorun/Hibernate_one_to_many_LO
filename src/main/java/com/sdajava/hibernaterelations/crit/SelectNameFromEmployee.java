package com.sdajava.hibernaterelations.crit;

import com.sdajava.hibernaterelations.HibUtil;
import com.sdajava.hibernaterelations.entity.Employee;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;


public class SelectNameFromEmployee {
public static void main(String[] args) {
	Session session = HibUtil.getSession();
	Criteria crit = session.createCriteria(Employee.class);
	crit.setProjection(Projections.property("empName"));
	List<String> names =  crit.list();
	for (String name : names) {
		System.out.println(name);
	}
}
}
