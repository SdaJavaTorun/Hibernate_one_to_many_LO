package com.sdajava.hibernaterelations;

import java.util.Calendar;

import com.sdajava.hibernaterelations.entity.Employee;
import com.sdajava.hibernaterelations.entity.Passport;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class OneToOneSave {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Transaction tx = session.beginTransaction();
		Employee e = new Employee();
		e.setEmpName("Sita");
		e.setMailId("sita@javahome.in");
		// Create a passport Object
		Passport p = new Passport();
		p.setPassportNo("G501888S");
		Calendar expDate = Calendar.getInstance();
		expDate.set(Calendar.YEAR, 2014);
		expDate.set(Calendar.MONTH, Calendar.JUNE);
		expDate.set(Calendar.DATE, 01);
		p.setExpryDt(expDate.getTime());
//		Set this passport to the employee
		e.setPassport(p);
		session.save(e);
		session.save(p);
		tx.commit();
		session.close();
	}
}
