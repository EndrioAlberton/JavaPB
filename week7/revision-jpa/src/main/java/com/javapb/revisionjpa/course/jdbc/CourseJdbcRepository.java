package com.javapb.revisionjpa.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.javapb.revisionjpa.course.Course;

@Repository
public class CourseJdbcRepository {

	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
	private static String INSERT_QUERRY= """
				INSERT INTO course (id, name, author) VALUES
			    (?, ?, ?)
			""";
	
	private static String DELETE_QUERRY= """
			DELETE FROM course where id = ?
		""";
	public void insert(Course course) {
		springJdbcTemplate.update(INSERT_QUERRY, course.getId(), course.getName(), course.getEmail());
	}
	
	public void deleteById(long id) {
		springJdbcTemplate.update(DELETE_QUERRY,id);
	}
}
