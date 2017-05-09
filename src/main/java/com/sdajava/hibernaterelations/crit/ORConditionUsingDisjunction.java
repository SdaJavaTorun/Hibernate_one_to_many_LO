package com.sdajava.hibernaterelations.crit;

import com.sdajava.hibernaterelations.HibUtil;
import com.sdajava.hibernaterelations.entity.Employee;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Disjunction;
import org.hibernate.criterion.Restrictions;

public class ORConditionUsingDisjunction {
public static void main(String[] args) {

	Session session = HibUtil.getSession();

	Criteria criteria = session.createCriteria(Employee.class);
	Criterion c1 = Restrictions.gt("empId", 1);
	Criterion c2 = Restrictions.lt("empId", 5);
	Criterion c3 = Restrictions.lt("empId", 5);
//	Disjunction is used for grouping conditions with OR operator
	Disjunction or = Restrictions.disjunction();

	or.add(c1);
	or.add(c2);
	or.add(c3);
	criteria.add(or);
	List<Employee> employees = criteria.list();

	for (Employee emp : employees) {
		System.out.println(emp.getEmpName());
		System.out.println(emp.getMailId());
		System.out.println(emp.getEmpId());
		System.out.println("************************************");
	}
}
}
