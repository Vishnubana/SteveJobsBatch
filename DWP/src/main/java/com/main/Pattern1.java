package com.main;

import java.util.Scanner;

public class Pattern1 {
	Scanner in = new Scanner(System.in);
	
	void squarePattern() {
	System.out.println("Enter the Square Pattern Length");
	int num = in.nextInt();
	for(int row=0;row<=num;row++) {
		for(int col=0;col<=num;col++) {
			System.out.print("* ");
		}
		System.out.println();
	}

}
	
	void leftTriangle() {
		System.out.println("Enter the Order::");
		int order=in.nextInt();
		if(order==1) {
			leftTriangle1();
		}
		else if(order==2){
			leftTriangle2();
		}
	}
	
	void leftTriangle1() {
		System.out.println("Enter the Left Triangle Pattern Length");
		int num = in.nextInt();
		for(int row=1;row<=num;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	void leftTriangle2() {
		System.out.println("Enter the Left Triangle Up Side Down Pattern Length");
		int num = in.nextInt();
		for(int row=num;row>=1;row--) {
			for(int col=1;col<=row;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
}
