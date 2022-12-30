package com.in28minutes.springJDBC.course.Assignments.course;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springJDBC.course.Assignments.course.Course;
import com.in28minutes.springJDBC.course.Assignments.course.jdbc.CourseJdbcRepository;

@Component
@Transactional
public class CourseCommandLineRunner implements CommandLineRunner {

	//@Autowired
	//private CourseJdbcRepository repository;
	
	@Autowired
	private CourseJdbcRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1,"Learn AWS Jpa!","in28minutes"));
		repository.insert(new Course(2,"Learn Azure Jpa!","in28minutes"));
		repository.insert(new Course(3,"Learn DEV Jpa!","in28minutes"));
		repository.insert(new Course(4,"Learn JAVA Jpa!","in28minutes"));
		
		repository.deleteById(1);
		
		System.out.println(repository.findById(2));
		System.out.println(repository.findById(3));
	}
}
