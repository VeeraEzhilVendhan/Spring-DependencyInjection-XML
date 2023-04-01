package com.spring.di.injecting_literalvalues;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.di.base.Coach;

public class SpringApp {
	
	public static void main(String[] args) {
		
		//load spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
				
		//retrieve bean from spring container
		CricketCoach1 coach1=context.getBean("cricketcoach1",CricketCoach1.class);
				
	    //call methods on the bean
		System.out.println(coach1.getDailyWorkout());
		System.out.println(coach1.getQuote());
		System.out.println(coach1.getEmail_address());
		System.out.println(coach1.getName());
				
		//close context
		context.close();
		
		
	}

}
