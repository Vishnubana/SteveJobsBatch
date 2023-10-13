package com.main;

import java.util.Scanner;

public class FactorialOfNumber {
	Scanner input = new Scanner(System.in);
	void factorialLogic() {
		System.out.println("Enter the Nunmber for Factorial");
		int num = input.nextInt();
		long factorial = 1;
		for(int i=1;i<=num;++i) {
			factorial = factorial*i;
		}
		System.out.println("The factorial of "+ num + " is "+ factorial);
		System.out.println("Enter 1 to continue or Enter 0 to exit:: ");
		int num2 = input.nextInt();
		if(num2==1) {
			factorialLogic();
		}
		else if(num2==0) {
			System.out.println("You Have Successfully Exited!");
		}
		else {
			System.out.println("Please Enter a Valid Input::");
			factorialLogic();
		}
	}
	

}
