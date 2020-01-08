package com.spring.demo;

import com.spring.demo.config.SpringConfig;
import com.spring.demo.dao.IUserDao;
import com.spring.demo.service.UserManager;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {

	public static void main(String[] args) {
//		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//		IUserDao userDao = context.getBean(IUserDao.class);
//		userDao.queryForObject("大牛");
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		 UserManager userManager = (UserManager) ctx.getBean("userManager");
		 System.out.println(userManager);
	}
}
