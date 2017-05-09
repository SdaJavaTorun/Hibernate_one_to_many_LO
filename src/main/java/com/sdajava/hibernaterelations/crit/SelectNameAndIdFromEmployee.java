package com.sdajava.hibernaterelations.crit;

import com.sdajava.hibernaterelations.HibUtil;
import com.sdajava.hibernaterelations.entity.Employee;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;


public class SelectNameAndIdFromEmployee {
public static void main(String[] args) {
	Session session = HibUtil.getSession();
	Criteria crit = session.createCriteria(Employee.class);
	ProjectionList projectionList = Projections.projectionList();
	projectionList.add(Projections.property("empName"));
	projectionList.add(Projections.property("empId"));
	crit.setProjection(projectionList);

	List<Object[]> names =  crit.list();
	for (Object[] data : names) {
		System.out.println("Name-> "+data[0]);
		System.out.println("Emp Id-> "+data[1]);
	}
}
}
