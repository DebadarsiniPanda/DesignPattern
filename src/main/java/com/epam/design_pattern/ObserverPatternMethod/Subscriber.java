package com.epam.design_pattern.ObserverPatternMethod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.epam.design_pattern.Client;



public class Subscriber {

	private static Logger Logger = LogManager.getLogger(Client.class);
	
	private String name;
	private Channel channel =new Channel();
	public Subscriber(String name) {
		super();
		this.name = name;
	}
	public void update() {
		  Logger.warn("Hey " + name + " Video Uploaded : " + channel.title) ; 
	}
	public void subscribeChannel(Channel ch) {
		channel = ch; 
	}
	
	
}