package com.denofprogramming.service;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DynamicMessageOfTheDayImpl {

	
	private final String[] messages = new String[]{ "Sunday morning message!",
			"Monday morning message!",
			"Tuesday morning message!",
			"Wednesday morning message!",
			"Thursday morning message!",
			"Friday morning message!",
			"Saturday morning message!"			
	};
	

	
	public String getMessage(){
		
		//What day is it today??
		final int day = GregorianCalendar.getInstance().get(Calendar.DAY_OF_WEEK);
		
		// days start at on in Java
		final String message = messages[day -1];
		return message;
	}
	
}
