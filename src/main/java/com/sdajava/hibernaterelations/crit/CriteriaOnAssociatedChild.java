package com.sdajava.hibernaterelations.crit;

import com.sdajava.hibernaterelations.HibUtil;
import com.sdajava.hibernaterelations.entity.Employee;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class CriteriaOnAssociatedChild {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Criteria crit = session.createCriteria(Employee.class);
//		Creating criteria on associated child(Passport) entity
		crit = crit.createCriteria("passport");
		crit.add(Restrictions.eq("id", 1));
		List<Employee> employees = crit.list();

		for (Employee employee : employees) {
			System.out.println(employee.getEmpId());
			System.out.println(employee.getEmpName());
		}
	}
}
