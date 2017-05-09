package com.sdajava.hibernaterelations;

import com.sdajava.hibernaterelations.entity.Address;
import com.sdajava.hibernaterelations.entity.Employee;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Save {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Transaction tx = session.beginTransaction();

//		Create new Employee and populate the data
		Employee e1 = new Employee();
		e1.setEmpName("Chandra");
		e1.setMailId("chandra@javahome.in");
//		Create Address objects
		Address a1 = new Address();
		a1.setCountry("India");
		a1.setDoorNo("#20");

//		Create Second Address object
		Address a2 = new Address();
		a2.setCountry("Russia");
		a2.setDoorNo("#10");

//		Add address1 and address2 to the Employee
		e1.getAddress().add(a1);
		e1.getAddress().add(a2);

//		Save Employee
		session.save(e1);
//		Save address1 and address2
		session.save(a1);
		session.save(a2);

//		Commit the transaction
		tx.commit();
//		Close Session
		session.close();



	}
}
