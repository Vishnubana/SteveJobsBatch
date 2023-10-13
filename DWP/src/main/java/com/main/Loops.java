package com.main;
import java.util.Scanner;

class Loops {
	
	public static void main(String[] args) {
		
		
		
		 int num = 29;
		    boolean flag=false;
		    for (int i = 2; i <= num / 2; ++i) {
		     
		      if (num % i == 0) {
		        flag = true;
		        break;
		      }
		    }

		    if (!flag)
		      System.out.println(num + " is a prime number.");
		    else
		      System.out.println(num + " is not a prime number.");
		
		    
		    
		int j=1;
		while(j<=10)
		{
		System.out.print(j+" ");
		j++;
		}		
		System.out.println(" ");
			
		int[] a= {5,55,555};{
			for(int var:a) {
				System.out.println(var);
				}
			}
		fibonacciSeries();
		
	}
	
	static void fibonacciSeries(){
	Scanner input = new Scanner(System.in);
	int count=input.nextInt();
	int num1=0, num2=1, num3;
	System.out.print(num1+" "+num2+" ");
	for(int i=0;i<=count;i++) {
	num3=num1+num2;
	System.out.print(num3+" ");
	num1=num2;
	num2=num3;	
	}
	}
	
}
