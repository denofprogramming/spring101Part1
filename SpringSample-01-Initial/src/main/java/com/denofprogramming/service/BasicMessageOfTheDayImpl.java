package com.denofprogramming.service;

public class BasicMessageOfTheDayImpl implements MessageOfTheDayService {

	
	private String message = "hello world";
	
	public String getMessage() {		
		return message;
	}

	public void setMessage(String message){
		this.message = message;
	}
	
	
}
