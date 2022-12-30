package com.in28minutes.springJDBC.course.Assignments.course.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import com.in28minutes.springJDBC.course.Assignments.course.Course;

@Repository
public class CourseJpaRepository {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void insert(Course course) {
		manager.merge(course);
	}
	
	public Course findById(long id) {
		return manager.find(Course.class,id);
	}
	
	public void deleteById(long id) {
		Course course = manager.find(Course.class,id);
	    manager.remove(course);
	}
	
}
