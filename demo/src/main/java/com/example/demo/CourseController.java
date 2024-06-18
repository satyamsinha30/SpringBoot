package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	@RequestMapping("/courses")
	public List<Course> retrieveAll(){
		return Arrays.asList(
				new Course(1,"AWS","Author1"),
				new Course(2,"AW2","Author3"));
	}
}
