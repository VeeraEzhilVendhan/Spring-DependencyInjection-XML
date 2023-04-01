package com.spring.di.setter_injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.di.base.Coach;

public class SpringApp {
	
	public static void main(String[] args) {
		
		//load spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
				
		//retrieve bean from spring container
		Coach coach1=context.getBean("cricketcoach",Coach.class);
				
	    //call methods on the bean
		System.out.println(coach1.getDailyWorkout());
		System.out.println(coach1.getQuote());
				
		//close context
		context.close();
		
		
	}

}
