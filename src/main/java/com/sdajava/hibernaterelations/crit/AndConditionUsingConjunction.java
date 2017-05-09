package com.sdajava.hibernaterelations.crit;

import com.sdajava.hibernaterelations.HibUtil;
import com.sdajava.hibernaterelations.entity.Employee;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Conjunction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class AndConditionUsingConjunction {
public static void main(String[] args) {

	Session session = HibUtil.getSession();

	Criteria criteria = session.createCriteria(Employee.class);
	Criterion c1 = Restrictions.gt("empId", 1);
	Criterion c2 = Restrictions.lt("empId", 5);
	Criterion c3 = Restrictions.lt("empId", 5);
//	Disjunction is used for grouping conditions with OR operator
	Conjunction and = Restrictions.conjunction();

	and.add(c1);
	and.add(c2);
	and.add(c3);
	criteria.add(and);
	List<Employee> employees = criteria.list();

	for (Employee emp : employees) {
		System.out.println(emp.getEmpName());
		System.out.println(emp.getMailId());
		System.out.println(emp.getEmpId());
		System.out.println("************************************");
	}
}
}
