package com.denofprogramming.service;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DynamicMessageOfTheDayImpl implements MessageOfTheDayService {
	
	private String[] messages;
	
	
	public String getMessage(){
		
		//What day is it today??
		final int day = GregorianCalendar.getInstance().get(Calendar.DAY_OF_WEEK);
		
		// days start at on in Java
		final String message = messages[day -1];
		return message;
	}
	
	public void setMessages(String[] messages){
		this.messages = (String[])messages.clone();
	}
}
