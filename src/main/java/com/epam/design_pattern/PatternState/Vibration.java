package com.epam.design_pattern.PatternState;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.epam.design_pattern.Client;


public class Vibration implements MobileAlertState {

	private static Logger Logger = LogManager.getLogger(Client.class);
	public void alert(AlertStateContext ctx) {
	
		Logger.info("Vibration........");
		
	}


    
   
}