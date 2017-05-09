package com.sdajava.hibernaterelations;

import com.sdajava.hibernaterelations.inheritance.entity.CardPayment;
import com.sdajava.hibernaterelations.inheritance.entity.NetBanking;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class SaveInheritance {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Transaction tx = session.beginTransaction();
		NetBanking banking = new NetBanking();
		banking.setAccNumber("540540540540");
		banking.setPaymentId(18);
		banking.setAmount(20000.0);
		banking.setBankName("HDFC");
		session.save(banking);

		CardPayment cardPayment = new CardPayment();
		cardPayment.setAmount(50000.0);
		cardPayment.setCardType("VISA");
		cardPayment.setPaymentId(19);

		session.save(cardPayment);
//		Commit the transaction
		tx.commit();
//		Close Session
		session.close();



	}
}
