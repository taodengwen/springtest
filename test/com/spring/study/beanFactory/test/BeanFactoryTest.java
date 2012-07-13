package com.spring.study.beanFactory.test;

import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.spring.study.bean.StudentInfo;


/**
 * 常用有三种方式可以得到BeanFactory ，从而获得bean实例，并进行调用
 * @author Administrator
 *
 */
public class BeanFactoryTest {

	@Test
	public void test() {//文件系统获得
		try {
			Resource res = new FileSystemResource("conf/beans.xml");
	    	XmlBeanFactory beanFactory = new XmlBeanFactory(res);
	    	StudentInfo info = (StudentInfo)beanFactory.getBean("student");
			System.out.println(info);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void classPathTest(){//通过类路径获取beanFactory
		ClassPathResource resource = new ClassPathResource("beans.xml");
		XmlBeanFactory beanFactory = new XmlBeanFactory(resource);
		StudentInfo info = (StudentInfo)beanFactory.getBean("student");
		System.out.println(info);
	}
	
	
	@Test
	public void applicationTest(){ //通过applicationContext获取beanFactory
		//no·1
		FileSystemXmlApplicationContext applicationContext = new FileSystemXmlApplicationContext("conf/beans.xml");
		StudentInfo info = (StudentInfo)applicationContext.getBean("student");
		System.out.println(info);
		//no·2
		ClassPathXmlApplicationContext applicationContext2  = new ClassPathXmlApplicationContext("beans.xml");
		StudentInfo info2 = (StudentInfo) applicationContext2.getBean("student");
		System.out.println(info2);
	}
	
	

}
