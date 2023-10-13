package com.main;

public class ThisSuperFinalClass extends ParentClassSuper{
	
	int a=40;
	final int b = 35;
	
	
	public static void main(String[] args) {
		ThisSuperFinalClass thisSuperFinalClass = new ThisSuperFinalClass();
		thisSuperFinalClass.test(5);
	
	}
	void test(int a) {
		a=20;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
		
	
	}
//	Cannot use "this" in static context!
//	Cannot use "super" in static context!
//	The parentClassSuper cannot subclass the final clads FinalClassTest


}
