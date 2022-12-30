package com.in28minutes.springJDBC.course.Assignments.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.in28minutes.springJDBC.course.Assignments.course.Course;

@Repository
public class CourseJdbcRepository {
	
	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
	private static String Insert_QUERY=
			"""
				insert into course(id,name,author)
			    values(?,?,?);	
			""";
	
	private static String Delete_QUERY=
			"""
				delete from course where id = ?
			""";
	
	private static String Select_QUERY=
			"""
				select * from course where id = ?
			""";
	
	public void insert (Course course)
	{
		springJdbcTemplate.update(Insert_QUERY,course.getId(),course.getName(),course.getAuthor()); 
	}
	
	public void deleteById(long id)
	{
		springJdbcTemplate.update(Delete_QUERY,id); 
	}
	
	public Course findById(long id)
	{	
		//ResultSet ->Bean => Row Mapper =>
		//id
		return springJdbcTemplate.queryForObject(Select_QUERY,
				new BeanPropertyRowMapper<>(Course.class),id); 
	
	}
}
