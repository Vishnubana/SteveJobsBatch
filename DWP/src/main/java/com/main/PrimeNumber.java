package com.main;

import java.util.Scanner;

public class PrimeNumber {
	
	Scanner input = new Scanner(System.in);
	
	void primeLogic() {
		System.out.println("Enter the Input for prime verification:");
		int num = input.nextInt();
		if(num<1) {
			System.out.println("Not Prime");
		}
		int div = 0;
		for(int i=2;i<=num/2;++i) {
			if (num%i == 0) {
				div ++;
				break;
			}
		}
		if(div == 0) {
			System.out.println(num +" is a Prime Number");
		}
		else {
			System.out.println(num+" is Not a Prime Number");
		}
		System.out.println("Enter 1 to continue or Enter 0 to exit:: ");
		int num2 = input.nextInt();
		if(num2==1) {
			primeLogic();
		}
		else if(num2==0) {
			System.out.println("You Have Successfully Exited!");
		}
		else {
			System.out.println("Please Enter a Valid Input::");
			primeLogic();
		}
		
		
	}
	

}
