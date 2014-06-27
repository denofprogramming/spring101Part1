package com.denofprogramming.service;

public class ObjectFactory {

	
	public static  MessagePrinterService getInstance(final Class<? extends MessagePrinterService> messagePrinterClazz, final Class<? extends MessageOfTheDayService> messageOfTheDayClazz){
	
		final MessagePrinterService aMessagePrinterService = getInstance(messagePrinterClazz);
		final MessageOfTheDayService aMessageOfTheDayService = getInstance(messageOfTheDayClazz);
		aMessagePrinterService.setMessageService(aMessageOfTheDayService);
		return aMessagePrinterService;		
		
	}
	
	
	private static <T>T getInstance(final Class<T> type)
	  {
		T newInstance = null;
		if(type != null){
			try{
				newInstance = type.newInstance();
			}catch(Exception ex){
				ex.printStackTrace();
			}			
		}
		return newInstance;		
	  }
}
