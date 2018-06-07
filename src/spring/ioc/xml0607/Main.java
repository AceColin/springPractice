package spring.ioc.xml0607;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/ioc/xml0607/beans.xml");
		StudentController studentController = context.getBean(StudentController.class);
		studentController.list();

	}

}
