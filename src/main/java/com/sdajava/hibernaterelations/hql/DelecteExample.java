package com.sdajava.hibernaterelations.hql;

import com.sdajava.hibernaterelations.HibUtil;

import org.hibernate.Query;
import org.hibernate.Session;

public class DelecteExample {
public static void main(String[] args) {
	Session session = HibUtil.getSession();
	Query sql = session.createQuery("delete from Employee where empId=?");
	sql.setInteger(0, 2);

	int count = sql.executeUpdate();
	System.out.println("No of records updated/deleted "+count);

}
}
