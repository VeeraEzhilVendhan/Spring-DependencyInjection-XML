package com.spring.di.practice2;

import java.util.Random;

import com.spring.di.constructor_injection.QuoteService;

public class RandomQuoteService implements QuoteService{

	String quote[]= {"Be grateful","Be mindful","Today is another opportunity","Be good do good"};
	
	
	@Override
	public String getQuote() {
		
		Random r=new Random();
		int random=r.nextInt(quote.length);
		return quote[random];
	}

}
