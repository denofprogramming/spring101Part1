package com.denofprogramming.service;

public class MessagePrinter {
   
	private String name;
	private String separator;
    private MessageOfTheDayService service;

    
    public MessagePrinter(final String name, String separator, final MessageOfTheDayService service){
    	this.name = name;
    	this.separator = separator;
    	this.service = service;
    }
    
    public void printMessage() {
    	final StringBuilder sb = new StringBuilder(name);
    	sb.append(this.separator);
    	sb.append(service.getMessage());
    	
        System.out.println(sb);
    }
}
