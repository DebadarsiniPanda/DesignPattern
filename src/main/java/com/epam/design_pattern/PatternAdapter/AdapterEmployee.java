package com.epam.design_pattern.PatternAdapter;

public class AdapterEmployee implements Employee {

	ExtraEmployee oe = new ExtraEmployee();
	public void employeeJob(String s) {
		
		oe.doEmployee(s);
	}

}
