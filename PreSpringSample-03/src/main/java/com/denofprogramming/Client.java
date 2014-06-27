package com.denofprogramming;

import com.denofprogramming.service.DynamicMessageOfTheDayImpl;
import com.denofprogramming.service.MessagePrinterService;
import com.denofprogramming.service.ObjectFactory;



public class Client {

	public static void main(final String[] args) {

		//configuration part	we can then swap impl with DynamicMessageOfTheDayImpl.class			
		final MessagePrinterService aMessagePrinter = ObjectFactory.getInstance(MessagePrinterService.class, DynamicMessageOfTheDayImpl.class);
		
				
		//doing something part...
		aMessagePrinter.printMessage();
		

	}
}
