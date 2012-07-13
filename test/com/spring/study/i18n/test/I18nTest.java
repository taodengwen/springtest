package com.spring.study.i18n.test;

import java.util.Date;
import java.util.Locale;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class I18nTest {

	@Test
	public void test() {//internationalization
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Object[] objs = {"zhangsan",new Date()};
		String msg = context.getMessage("userInfo", objs, Locale.ENGLISH);
		System.out.println(msg);
		
	}

}
