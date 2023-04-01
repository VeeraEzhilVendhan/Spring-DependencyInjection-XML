package com.spring.di.setter_injection;

import com.spring.di.base.Coach;
import com.spring.di.constructor_injection.QuoteService;

public class CricketCoach implements Coach {
	
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

	
	
	

}
