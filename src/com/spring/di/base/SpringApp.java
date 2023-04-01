package com.spring.di.base;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.di.constructor_injection.QuoteService;

public class SpringApp 
{
	public static void main(String[] args) 
	{		
		//load spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		//retrieve bean from spring container
		Coach coach1=context.getBean("baseballcoach",Coach.class);
		Coach coach2=context.getBean("footballcoach",Coach.class);
		
		//call methods on the bean
        System.out.println(coach1.getDailyWorkout());
        System.out.println(coach1.getQuote());
        System.out.println(coach2.getDailyWorkout());
        System.out.println(coach2.getQuote());
		
        //close context
		context.close();
	}

}
