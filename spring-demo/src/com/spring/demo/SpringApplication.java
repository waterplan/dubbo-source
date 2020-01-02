package com.spring.demo;

import com.spring.demo.config.SpringConfig;
import com.spring.demo.dao.IUserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		IUserDao userDao = context.getBean(IUserDao.class);
		userDao.queryForObject("大牛");
	}
}
