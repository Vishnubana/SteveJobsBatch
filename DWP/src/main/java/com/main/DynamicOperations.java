package com.main;

public class DynamicOperations {
	public static void main(String[] args) {
	
	ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
	int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
	
	arithmeticOperations.addNum( a,  b);
	arithmeticOperations.subNum( a,  b);
	arithmeticOperations.mulNum( a,  b);
	arithmeticOperations.divNum( a,  b);
	arithmeticOperations.modsNum( a,  b);
	
	}
	

}
