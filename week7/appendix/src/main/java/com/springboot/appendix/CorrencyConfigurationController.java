package com.springboot.appendix;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CorrencyConfigurationController {

	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				new Course(1,"Português", "Professor Noslen"),
				new Course(2,"Matemática", " Professor Ledo Vaccaro")
				);
	}	
}
