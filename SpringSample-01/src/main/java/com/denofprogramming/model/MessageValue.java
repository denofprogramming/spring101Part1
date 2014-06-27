package com.denofprogramming.model;

public class MessageValue {

	private String message = "No message";
	
	
	public MessageValue(final String message){
		this.message = message;
	}
	
	
	public String getMessage(){
		return message;
	}


	@Override
	public String toString() {
		return "MessageValue [message=" + message + "]";
	}

	
}
