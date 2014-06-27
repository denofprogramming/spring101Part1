package com.denofprogramming;

import com.denofprogramming.service.BasicMessageOfTheDayImpl;
import com.denofprogramming.service.MessageOfTheDayService;
import com.denofprogramming.service.MessagePrinterService;



public class Client {

	public static void main(final String[] args) {

				
		final MessageOfTheDayService aMessageService = new BasicMessageOfTheDayImpl();
		//final MessageOfTheDayService aMessageService = new DynamicMessageOfTheDayImpl();
		
		
		final MessagePrinterService aMessagePrinter = new MessagePrinterService();
		aMessagePrinter.setMessageService(aMessageService);
		aMessagePrinter.printMessage();
		

	}
}
