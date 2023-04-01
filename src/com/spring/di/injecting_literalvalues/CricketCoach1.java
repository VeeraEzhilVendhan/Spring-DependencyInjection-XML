package com.spring.di.injecting_literalvalues;

import com.spring.di.base.Coach;
import com.spring.di.constructor_injection.QuoteService;

public class CricketCoach1 implements Coach {
	
	//add field for value injection
	private String name;
	private String email_address;
	
	//define field for setter injection
	private QuoteService qs;

	@Override
	public String getDailyWorkout() {
		return "practice bowling for 2 hrs";
	}

	@Override
	public String getQuote() {
		return qs.getQuote();
	}

	public void setQs(QuoteService qs) {
		System.out.println("CricketCoach: Setter method called");
		this.qs = qs;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}

	public String getName() {
		return name;
	}

	public String getEmail_address() {
		return email_address;
	}

	
	
	

}
