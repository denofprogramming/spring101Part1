package com.denofprogramming.service;

public class MessagePrinter {
   	
    private MessageOfTheDayService service;

    public void printMessage() {
        System.out.println(service.getMessage());
    }


	public void setService(MessageOfTheDayService service) {
		this.service = service;
	}
	


}
