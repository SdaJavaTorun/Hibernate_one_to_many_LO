package com.sdajava.hibernaterelations.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Student implements Serializable{
	private Integer stdId;
	private String name;
	private Set<Course> courses = new HashSet<Course>();
	public Integer getStdId() {
		return stdId;
	}
	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Course> getCourses() {
		return courses;
	}
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

}
