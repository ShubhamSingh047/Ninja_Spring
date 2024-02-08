package com.learnspring.Spring;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);


		//step 1 get the context from xml
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");

		//initialising the beans
		PostList postList= (PostList) context.getBean("simplePostList");
	}
}
