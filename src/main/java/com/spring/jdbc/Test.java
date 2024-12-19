package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hello world");
		
		ApplicationContext cont = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		
		JdbcTemplate temp = cont.getBean("temp",JdbcTemplate.class);
		String query = "insert into studentInfo(id,name,city) values (?,?,?)";
		
		int val = temp.update(query,2,"Rajnish","kutch");
		System.out.println(val);
	}

}
