package com.epam.design_pattern.PatternAdapter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.epam.design_pattern.Client;


public class ExtraEmployee {
	
	private static Logger Logger = LogManager.getLogger(Client.class);
	public void doEmployee(String str) {
		Logger.info(str);
	}

}
