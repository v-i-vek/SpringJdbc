package com.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.entity.Student;

public class StudentDaoImp implements StudentDao {

	private JdbcTemplate jdbcTemp;
	public JdbcTemplate getJdbcTemp() {
		return jdbcTemp;
	}
	public void setJdbcTemp(JdbcTemplate jdbcTemp) {
		this.jdbcTemp = jdbcTemp;
	}
	@Override
	public int insert(Student student) {

		String query = " insert into studentInfo(id,name,city) values(?,?,?) ";
		int result = jdbcTemp.update(query,student.getId(),student.getName(),student.getCity());
		return result;
	}
	@Override
	public int update(Student student) {
		// update method;
		
		String query = "update studentinfo set city =?,name=? where id = ?";
		int result =  jdbcTemp.update(query,student.getCity(),student.getName(),student.getId());
		
		return result;
	}
	@Override
	public int delete(Student student) {
		//delete query;
		String query = "delete from studentInfo where id = ?";
		int result = jdbcTemp.update(query,student.getId());
		return result;
	}

}
