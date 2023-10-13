package pac.VendingMachineConcept;

import java.util.Arrays;
import java.util.Scanner;

public class VendingMachineLogic {
	Scanner sc = new Scanner(System.in);
	int chocolatePrice = 10,chocolateCount = 10,biscketPrice = 15,biscketCount = 0,waterBottlePrice = 20,waterBottleCount = 2,changeAmount,inputProduct,inputAmount;
	boolean acceptableNote;
	int[] notesAccepted = {1,5,10,20,50,100};
	void vendingMachineMethod() {
		System.out.println("Enter the Rupees: ");
		inputAmount = sc.nextInt();
		for(int notesAcceptVariable:notesAccepted) {
			if(inputAmount == notesAcceptVariable) {
				acceptableNote= true;
			}
		}
		if(acceptableNote) {
			productSelectionMethod();
		}
//		if(Arrays.asList(notesAccepted).contains(inputAmount)) {
//		productSelectionMethod();	
//		}
		else {
			System.out.println("The entered amount cannot be accepted as a input.\nEnter the amount in the denominations of 1,5,10,20,50,100!\nIf you wish to continue enter '1' or to exit enter '0': ");
			int denominationsChoice = sc.nextInt();
			if(denominationsChoice == 1) {
			vendingMachineMethod();
			}
			else if(denominationsChoice == 0) {
				System.out.println("You have successfully exited!");
			}
		}
	}
	
	void productSelectionMethod() {
		System.out.println("Select the product you want: \n1.Chocolate-Rs.10\n2.Biscket-Rs.10\n3.Water Bottle-Rs.20");
		inputProduct = sc.nextInt();
		
		if(inputProduct >0 && inputProduct <= 3) {
//			Product1
			if(inputProduct == 1) {
				if(chocolateCount >1) {
				if(inputAmount >= chocolatePrice) {
					changeAmount = (inputAmount - chocolatePrice);
					if(changeAmount == 0) {
						System.out.println("Please collect the dispatched chocolate!\n");
					}
					else
					System.out.println("The Chocolate has been dispatched!\nPlease collect the change amount of Rs." + changeAmount);
					inputAmount -= chocolatePrice;
				}
				else if(inputAmount < chocolatePrice){
					System.out.println("The entered amount is insufficient! Please enter the sufficient amount!\nThe entered amount has been returned!");
					vendingMachineMethod();
				}
			}
				else {
					System.out.println("The required product 'Chocolate' is not available!\nTo choose another product enter '1' or to exit enter '0': ");
					int naChoice = sc.nextInt();
					if(naChoice == 1) {
					productSelectionMethod();
					}
					else if(naChoice == 0) {
						System.out.println("You have successfully exited!");
					}
				}
			}
//			Product2
			else if(inputProduct == 2) {
				if(biscketCount >1) {
				if(inputAmount >= biscketPrice) {
					changeAmount = (inputAmount - biscketPrice);
					if(changeAmount == 0) {
						System.out.println("Please collect the dispatched biscket!\n");
					}
					else
					System.out.println("The Biscket has been dispatched!\nPlease collect the change amount of Rs." + changeAmount);
					inputAmount -= biscketPrice;
				}
				else if(inputAmount < biscketPrice){
					System.out.println("The entered amount is insufficient! Please enter the sufficient amount!\nThe entered amount has been returned!");
					vendingMachineMethod();
				}
			}
				else {
					System.out.println("The required product 'Biscket' is not available!\nTo choose another product enter '1' or to exit enter '0': ");
					int naChoice = sc.nextInt();
					if(naChoice == 1) {
					productSelectionMethod();
					}
					else if(naChoice == 0) {
						System.out.println("You have successfully exited!");
					}
				}
			}
//			Product3
			else if(inputProduct == 3) {
				if(waterBottleCount >1) {
				if(inputAmount >= waterBottlePrice) {
					changeAmount = (inputAmount - waterBottlePrice);
					if(changeAmount == 0) {
						System.out.println("Please collect the dispatched water bottle!\n");
					}
					else
					System.out.println("The Water Bottle has been dispatched!\nPlease collect the change amount of Rs." + changeAmount);
					inputAmount -= waterBottlePrice;
				}
				else if(inputAmount < waterBottlePrice){
					System.out.println("The entered amount is insufficient! Please enter the sufficient amount!\nThe entered amount has been returned!");
					vendingMachineMethod();
				}
			}
				else {
					System.out.println("The required product 'Water Bottle' is not available!\nTo choose another product enter '1' or to exit enter '0': ");
					int naChoice = sc.nextInt();
					if(naChoice == 1) {
					productSelectionMethod();
					}
					else if(naChoice == 0) {
						System.out.println("You have successfully exited!");
					}
				}
			}
			
		}
		else {
			System.out.println("Please enter A valid product code like 1,2,3!");
			productSelectionMethod();
		}
		ceChoiceMethod();
		}
	
	void ceChoiceMethod() {
		System.out.println("If you wish to continue please enter '1' or to exit enter '0': ");
		int ceChoice = sc.nextInt();
		if(ceChoice == 1) {
			productSelectionMethod();
		}
		else if(ceChoice == 0){
			System.out.println("You have successfully exited!");
		}
		else {
			System.out.println("Please enter a valid choice either '0' or '1': ");
			ceChoiceMethod();
		}
	}

}
