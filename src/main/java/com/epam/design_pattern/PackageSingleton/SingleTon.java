package com.epam.design_pattern.PackageSingleton;
public class SingleTon {

	static SingleTon obj = new SingleTon();
	private SingleTon() {}
	public static SingleTon getInstance() {
		return obj;
	}
}