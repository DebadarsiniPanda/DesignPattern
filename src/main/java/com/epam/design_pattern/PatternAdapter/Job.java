package com.epam.design_pattern.PatternAdapter;

public class Job  {

	private Employee emp;
	
	public Employee getEmployee() {
		return emp;
	}

	public void setEmployee(Employee employee) {
		this.emp = employee;
	}

	public void whatJob(String str) {
		
		emp.employeeJob(str);
	}
}