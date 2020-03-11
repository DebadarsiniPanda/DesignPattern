package com.epam.design_pattern.PatternComposite;


import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.epam.design_pattern.Client;

public class Composite implements Component {

	String name;
	List<Component> components = new ArrayList<Component>();
	private static Logger Logger = LogManager.getLogger(Client.class);
	public Composite(String name) {
		super();
		this.name = name;
	}
	
	public void addComponent(Component con) {
		components.add(con);
	}
	public void showPrice() {
		// TODO Auto-generated method stub
			Logger.info(name);
			for(Component c : components) {
				c.showPrice();
			}
		
	}

}