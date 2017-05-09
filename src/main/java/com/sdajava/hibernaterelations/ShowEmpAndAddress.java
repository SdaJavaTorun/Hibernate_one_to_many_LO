package com.sdajava.hibernaterelations;

import org.hibernate.Session;

public class ShowEmpAndAddress {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
        // Get employee with a primary key
        // display employee details
		// on employee call getAddress which returns Set<Address>
        // use a loop and display the address
		session.close();
	}
}
