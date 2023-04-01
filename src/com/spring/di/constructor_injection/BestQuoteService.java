package com.spring.di.constructor_injection;

public class BestQuoteService implements QuoteService{
	
	@Override
	public String getQuote()
	{
		return "Higher the climb, better view";
	}

}
