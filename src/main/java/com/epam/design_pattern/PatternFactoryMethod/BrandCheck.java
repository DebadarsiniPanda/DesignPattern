package com.epam.design_pattern.PatternFactoryMethod;
public class BrandCheck {

	public SmartPhone getInstance(String s) {
		if(s.equals("1")) {
			return (SmartPhone) new Samsung();
		}
		else if(s.equals("2")) {
			return (SmartPhone) new Mi();
		}
		else {
			return (SmartPhone) new Oppo();
		}
	}
}