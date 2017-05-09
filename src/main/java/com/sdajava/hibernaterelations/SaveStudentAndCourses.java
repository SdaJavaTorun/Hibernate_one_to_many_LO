package com.sdajava.hibernaterelations;

import java.util.Set;

import com.sdajava.hibernaterelations.entity.Student;
import com.sdajava.hibernaterelations.entity.Course;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class SaveStudentAndCourses {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Transaction tx = session.beginTransaction();

		Student s1 = new Student();
		s1.setName("Rahul");
		Set<Course> courses = s1.getCourses();
//		Create new courses and add them to the student
		Course c1 = new Course();
		c1.setCost(10000.0);
		c1.setCourseName("Android");

		Course c2 = new Course();
		c2.setCost(16000.0);
		c2.setCourseName("Hadoop");

//		Add both the courses to student
		courses.add(c1);
		courses.add(c2);
//		Save s1, c1,c2

		session.save(s1);
		session.save(c1);
		session.save(c2);
		tx.commit();
		session.close();
	}
}
