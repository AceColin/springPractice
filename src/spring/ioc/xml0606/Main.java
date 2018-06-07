package spring.ioc.xml0606;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/ioc/xml0606/beans.xml");
		
		UserController uc = context.getBean(UserController.class);
		uc.register("张三", "zs123456");
		
		UserService us = context.getBean(UserService.class);
		us.register("张三", "zs123456");
	}
}
