package com.spring.di.base;

import com.spring.di.constructor_injection.BestQuoteService;
import com.spring.di.constructor_injection.QuoteService;

public class BaseballCoach implements Coach{
	
	//define field for constructor injection 
	private QuoteService qs;
	
	public BaseballCoach(QuoteService qs)
	{
		this.qs=qs;
	}
	
	
	String instruction="Practice batting for 30mins a day";
	
	@Override
	public String getDailyWorkout()
	{
		return instruction;
	}

	@Override
	public String getQuote() {
		return qs.getQuote();
	}
	

}
