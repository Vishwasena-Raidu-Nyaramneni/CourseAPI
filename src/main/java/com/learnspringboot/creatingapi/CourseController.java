package com.learnspringboot.creatingapi;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController 
{
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses()
	{	
		return Arrays.asList(
				new Course(1, "Learn AWS", "aut1"),
				new Course(2, "Learn Devops", "aut2"),
				new Course(3, "Learn Azure", "aut3")
				);
	}
}
