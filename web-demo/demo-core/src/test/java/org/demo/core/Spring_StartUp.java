package org.demo.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.model.User;
import com.demo.service.UserService;

public class Spring_StartUp {
	private static UserService userService;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
	                ,"classpath:conf/spring-mybaties.xml"});
	        userService = (UserService) context.getBean("userService");
	    
	        User user = new User();
	        user.setNickname("tud");
	        user.setState(12);
	        System.out.println(userService.insertUser(user));
	}

}
