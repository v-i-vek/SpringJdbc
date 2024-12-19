package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.entity.Student;
import com.jdbc.dao.StudentDao;
import com.jdbc.dao.StudentDaoImp;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hello world");
		
		ApplicationContext cont = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		
//		JdbcTemplate temp = cont.getBean("temp",JdbcTemplate.class);
//		String query = "insert into studentInfo(id,name,city) values (?,?,?)";
//		
//		int val = temp.update(query,2,"Rajnish","kutch");
//		System.out.println(val);
		
		StudentDao sd = cont.getBean("studentDao",StudentDaoImp.class);
		
		Student s = new Student();
//		s.setCity("kolkata");
//		s.setName("babu mosay");
//		s.setId(33);
		
		s.setCity("Rajkot");
		s.setName("sudhir");
		s.setId(33);
//		
//		int insert = sd.insert(s);
//		System.out.println(insert);
		
//		int update = sd.update(s);
//		System.out.println(update);
		
//		int delete = sd.delete(s);
//		System.out.println(delete);
	}

}
