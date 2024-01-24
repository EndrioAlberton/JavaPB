package com.javapb.revisionjpa.course;

public class Course {

	private long id;
	private String name;
	private String email;
	
	public Course() {
	}
	
	public Course(long id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
}
