package com.sdajava.hibernaterelations;

import com.sdajava.hibernaterelations.entity.Employee;
import com.sdajava.hibernaterelations.entity.Passport;

import java.util.Calendar;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class UpdateOneToOne {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Transaction tx = session.beginTransaction();

		Employee emp = (Employee) session.get(Employee.class, 2);

		Passport pspt = emp.getPassport();
		Calendar expDt = Calendar.getInstance();
		expDt.set(Calendar.YEAR, 2025);
		expDt.set(Calendar.MONTH, Calendar.NOVEMBER);
		pspt.setExpryDt(expDt.getTime());
		session.saveOrUpdate(pspt);
		tx.commit();
		session.close();
	}
}
