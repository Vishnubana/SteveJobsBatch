package com.main;

public class SubClassAbstract extends AbstractMethod{
	
	
	int addTwoNums(int c,int d) {
		
		return (c + d);
		
	}
	public static void main(String[] args) {
		
		SubClassAbstract subClassAbstract = new SubClassAbstract();
		
		System.out.println( subClassAbstract.addTwoNums(5,9));
		
	}
	
	

}
