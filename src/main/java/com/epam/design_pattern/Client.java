package com.epam.design_pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.epam.design_pattern.ObserverPatternMethod.YouTube;
import com.epam.design_pattern.PackageSingleton.SingleTon;
import com.epam.design_pattern.PatternAdapter.AdapterEmployee;
import com.epam.design_pattern.PatternAdapter.Employee;
import com.epam.design_pattern.PatternAdapter.Job;
import com.epam.design_pattern.PatternComposite.Apps;
import com.epam.design_pattern.PatternFactoryMethod.BrandCheck;
import com.epam.design_pattern.PatternFactoryMethod.SmartPhone;
import com.epam.design_pattern.PatternState.StatePattern;

public class Client {

	private static Logger Logger = LogManager.getLogger(Client.class);
	public static void main(String[] args) {
		
		//singleton pattern
		Logger.warn("This is example of Singleton Pattern Method");
		SingleTon st1 = SingleTon.getInstance();
		SingleTon st2 = SingleTon.getInstance(); 
		Logger.info("Output of first singleton Object :");
		Logger.warn(st1);
		Logger.info("Output of second singleton Object :");
		Logger.warn(st2);
		if(st1==st2) {
			Logger.info("Both the objects are equal ");
		}
		
		//Factory Pattern Method
		Logger.warn("This is example of Factory Pattern Method");
		BrandCheck bc = new BrandCheck();
		SmartPhone sp = bc.getInstance("1");
		String data1 = sp.brand();
		Logger.info(data1);
		SmartPhone sp1 = bc.getInstance("2");
		String data2 = sp1.brand();
		Logger.info(data2);
		
		//Adapter Pattern Method
		Logger.warn("Example of Adapter Pattern");
		Job j = new Job();
		Employee e = new AdapterEmployee();
		j.setEmployee(e);
		j.whatJob("I am an employee of EPAM");
		
		//Composite Pattern Method
		Logger.warn("Example of Composite Pattern");
		Apps ap = new Apps();
		ap.showData();
		
		//Observer Pattern Method
		Logger.warn("Example of Observer Pattern");
		YouTube yt = new YouTube();
		yt.youTube();
		
		//State Pattern Method
		Logger.warn("Example of State Pattern");
		StatePattern spt = new StatePattern();
		spt.manageState();
	}
 
}