package com.epam.design_pattern.PatternComposite;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.epam.design_pattern.Client;

public class Leaf implements Component{

	private static Logger Logger = LogManager.getLogger(Client.class);
	int price;
	String name;
	public void showPrice() {
		Logger.info(name + ":" + price);
		
	}
	public Leaf(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

}