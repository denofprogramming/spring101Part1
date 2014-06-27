package com.denofprogramming;

import com.denofprogramming.service.MessagePrinterService;



public class Client {

	public static void main(final String[] args) {

		
		final MessagePrinterService aMessagePrinter = new MessagePrinterService();		
		aMessagePrinter.printMessage();
		

	}
}
