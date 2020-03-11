package com.epam.design_pattern.PatternState;

public class StatePattern {

	public void manageState() {

        AlertStateContext stateContext = new AlertStateContext(); 
        stateContext.alert(); 
        stateContext.alert(); 
        stateContext.setState(new Silent()); 
        stateContext.alert(); 
        stateContext.alert(); 
        stateContext.alert(); 
	}
}