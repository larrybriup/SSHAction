package com.briup.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.bean.User;
import com.briup.service.UserService;

public class Test {

	@org.junit.Test
	public void ssh_test() throws ParseException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
						"com/briup/service/impl/application_test.xml");
		UserService service = (UserService) ctx.getBean("userService");
		
		User user = new User();
		user.setUserName("choda2");
		user.setGender(true);
		user.setAge(17);
		user.setBirthDate(new SimpleDateFormat("yyyy-MM-dd").parse("1990-01-14"));
		
		service.register(user);
	}
}
