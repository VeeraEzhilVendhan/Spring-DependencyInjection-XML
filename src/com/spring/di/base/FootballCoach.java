package com.spring.di.base;

import com.spring.di.constructor_injection.QuoteService;

public class FootballCoach implements Coach {
	
	//define field for constructor injection
	private QuoteService qs;
	
	public FootballCoach(QuoteService qs)
	{
		this.qs=qs;
	}

	String instruction="practice goal daily 1hr";
	
	@Override
	public String getDailyWorkout() {
		
		return instruction;
	}

	@Override
	public String getQuote() {
		return qs.getQuote();
	}

}
