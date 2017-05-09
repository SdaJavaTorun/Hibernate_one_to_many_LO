package com.sdajava.hibernaterelations.hql;

import com.sdajava.hibernaterelations.HibUtil;

import org.hibernate.Query;
import org.hibernate.Session;

public class UpdateExample {
public static void main(String[] args) {
	Session session = HibUtil.getSession();
	Query sql = session.createQuery("update Employee set empName='Hari' where empId=2");
	/*sql.setString(0, "Hari");
	sql.setInteger(1, 2);*/
	int count = sql.executeUpdate();
	System.out.println("No of records updated/deleted "+count);

}
}
