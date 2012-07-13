package com.spring.study.dao.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.web.context.WebApplicationContext;

import com.spring.study.bean.UserInfo;




public class SpringDaoTest extends JdbcDaoSupport{
	
	
	public void userAdd(UserInfo info){
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		applicationContext.getBean("dataSource");

		Object objs[] = {info.getId(),info.getUserName(),info.getPassword()};
		String sql = "INSET INTO users(id,userName,password)VALUES(?,?,?);";
		int count = getJdbcTemplate().update(sql, objs);
		if(count > 0)
			System.out.println("增加成功!");
		else
			System.out.println("增加失败!");
		
	}
	
}
