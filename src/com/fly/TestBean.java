package com.fly;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fly.user.service.UserService;
import com.fly.user.service.imp.UserServiceImp;

public class TestBean {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserServiceImp userService = context.getBean("userServiceImp", UserServiceImp.class);
		userService.userSave();
	}
}
