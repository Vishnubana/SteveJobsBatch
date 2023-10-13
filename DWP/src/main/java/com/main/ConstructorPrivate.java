package com.main;

public class ConstructorPrivate {
	
	public static ConstructorPrivate instance;
	private ConstructorPrivate() {}
	
	public static ConstructorPrivate getInstance() {
		
		if(instance == null) {
			instance = new ConstructorPrivate();
		}
		return instance;
			
		
	}

}
