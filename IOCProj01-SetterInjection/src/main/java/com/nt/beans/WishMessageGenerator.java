package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	// has a property
	
	private Date date;

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:: 0-param constructor");
	}

	// setter method for setter injection

	// b method
	public String generateMessage(String user) {
		// get current hour of the day
		int hour = date.getHours();
		// generate the wish message
		if (hour < 12)
			return "Good Morning::" + user;
		else if (hour < 16)
			return "Good Afternoon::" + user;
		else if (hour < 20)
			return "Good Evening::" + user;
		else
			return "Good Night::" + user;

	}// method

}// class
