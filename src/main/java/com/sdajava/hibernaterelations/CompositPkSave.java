package com.sdajava.hibernaterelations;

import com.sdajava.hibernaterelations.entity.Product;
import com.sdajava.hibernaterelations.entity.ProductPk;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class CompositPkSave {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Transaction tx = session.beginTransaction();
		ProductPk pk = new ProductPk();
		pk.setCustomerId(1);
		pk.setProductId(2);

		Product p = new Product();
		p.setPk(pk);
		p.setCost(20000.0);
		p.setProductName("Samsung Mobile");
		session.save(p);

//		Commit the transaction
		tx.commit();
//		Close Session
		session.close();
	}
}
