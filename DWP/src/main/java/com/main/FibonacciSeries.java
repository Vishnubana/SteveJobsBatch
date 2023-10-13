package com.main;

import java.util.Scanner;

public class FibonacciSeries {
	Scanner input = new Scanner(System.in);
	void fibonacciLogic(){
		System.out.println("Enter the Number of Fibonocci Numbers");
		int count=input.nextInt();
		int num1=0, num2=1, num3;
		System.out.print(num1+" "+num2+" ");
		for(int i=0;i<=count-3;i++) {
		num3=num1+num2;
		System.out.print(num3+" ");
		num1=num2;
		num2=num3;	
		}
		System.out.println();
		System.out.println("Enter 1 to continue or Enter 0 to exit:: ");
		int choice = input.nextInt();
		if(choice==1) {
			fibonacciLogic();
		}
		else if(choice==0) {
			System.out.println("You Have Successfully Exited!");
		}
		else {
			System.out.println("Please Enter a Valid Input::");
			fibonacciLogic();
		}
		}
		

}
