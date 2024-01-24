package com.javapb.revisionjpa.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Repository;

import com.javapb.revisionjpa.course.Course;

@Repository
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseJdbcRepository repository;
	
	@Override
	public void run(String... args) throws Exception{
		repository.insert(new Course(1,"java Programming", "Nelio Alves"));
		repository.insert(new Course(2,"Web Development Basics", "Allie Decker"));
		
		repository.deleteById(1);
	}
}
