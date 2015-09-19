package com.invoicematching.logger;

public class Logging {
	
	public void beforeAdvice(){
		System.out.println("----------------------Starting method execution-------------------");
	}
	public void afterAdvice(){
		System.out.println("----------------------Finishing method execution-------------------");

	}

}
