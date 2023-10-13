package pac.CalculatorConcept;

import java.util.Scanner;

public class CalculatorLogic {
	Scanner sc = new Scanner(System.in);
	void calculatorLogicMethod() {
		System.out.println("Enter the first number : ");
		int firstNum = sc.nextInt();
		System.out.println("Enter the Arithmetic Operation ('+' or '-' or '*' or '/' or '%') : ");
		String ope = sc.next();
		System.out.println("Enter the last number : ");
		int lastNum = sc.nextInt();		
		if(ope.equals("+")) {
			System.out.println("The Addition is : "+(firstNum+lastNum));
		}
		else if(ope.equals("-")){
			System.out.println("The Subtraction is : "+(firstNum-lastNum));		
		}
		else if(ope.equals("*")){
			System.out.println("The Multiplication is : "+(firstNum*lastNum));		
		}
		else if(ope.equals("/")){
			System.out.println("The division is : "+(firstNum/lastNum));		
		}
		else if(ope.equals("%")){
			System.out.println("The Modulous is : "+(firstNum%lastNum));		
		}
		else {
			System.out.println("Please Enter a Valid Input!");
			calculatorLogicMethod();
		}
		System.out.println("Enter 1 if you wish to continue or enter o to exit");
		int choice = sc.nextInt();
		if(choice == 1)
			calculatorLogicMethod();
		else if(choice == 0)
			System.out.println("Successfully Exited");
		else {
			System.out.println("Please Enter a Valid Input!");
			calculatorLogicMethod();
		}
		
			
		
		
		
	}
	

}
