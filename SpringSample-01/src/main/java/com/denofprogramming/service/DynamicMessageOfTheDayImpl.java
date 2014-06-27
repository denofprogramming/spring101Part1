package com.denofprogramming.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.denofprogramming.model.MessageValue;

public class DynamicMessageOfTheDayImpl implements MessageOfTheDayService {

	// Messages held in an Array
	private String[] messagesArray = {};
	private MessageValue[] messagesValueArray = {};

	// Messages held in a List
	private List<String> messagesList = new ArrayList<String>();
	private List<MessageValue> messagesValueList = new ArrayList<MessageValue>();

	// Messages held in a Map
	private Map<Integer, String> messagesMap = new HashMap<Integer, String>();
	private Map<Integer, MessageValue> messagesValueMap = new HashMap<Integer, MessageValue>();

	public DynamicMessageOfTheDayImpl() {
	}

	public DynamicMessageOfTheDayImpl(String[] messages) {
		this.messagesArray = (String[]) messages.clone();
	}

	public DynamicMessageOfTheDayImpl(MessageValue[] messagesValues) {
		this.messagesValueArray = (MessageValue[]) messagesValues.clone();
	}

	public String getMessage() {

		// What day is it today??
		final int day = GregorianCalendar.getInstance().get(
				Calendar.DAY_OF_WEEK);

		// days start at on in Java
		String message = "";

		// Array examples
		if (messagesArray.length > 0) {
			message = "From Array:" + messagesArray[day - 1];
		}
		if (messagesValueArray.length > 0) {
			message = "From Array:" + messagesValueArray[day - 1].getMessage();
		}

		// List examples
		if (!messagesList.isEmpty()) {
			message = "From List:" + messagesList.get(day - 1);
		}

		if (!messagesValueList.isEmpty()) {
			message = "From List:"
					+ messagesValueList.get(day - 1).getMessage();
		}

		// Map examples
		if (!messagesMap.isEmpty()) {
			message = "From Map:" + messagesMap.get(day);
		}

		if (!messagesValueMap.isEmpty()) {
			message = "From Map:" + messagesValueMap.get(day).getMessage();
		}

		return message;
	}

	public void setMessagesArray(final String[] messagesArray) {
		// make a defensive copy of the array contents
		this.messagesArray = (String[]) messagesArray.clone();
	}

	public void setMessagesValueArray(final MessageValue[] messagesValueArray) {
		// make a defensive copy of the array contents
		this.messagesValueArray = (MessageValue[]) messagesValueArray.clone();
	}

	public void setMessagesList(final List<String> messagesList) {
		// make a defensive copy of the list contents
		this.messagesList.addAll(messagesList);
	}

	public void setMessagesValueList(final List<MessageValue> messagesValueList) {
		// make a defensive copy of the list contents
		this.messagesValueList.addAll(messagesValueList);
	}

	public void setMessagesMap(final Map<Integer, String> messagesMap) {
		// make a defensive copy of the map contents
		this.messagesMap.putAll(messagesMap);
	}

	public void setMessagesValueMap(
			final Map<Integer, MessageValue> messagesValueMap) {
		// make a defensive copy of the map contents
		this.messagesValueMap.putAll(messagesValueMap);
	}

}
