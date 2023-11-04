package pac.cbAssignmentJavaOne;

import java.util.ArrayList;
import java.util.Scanner;

public class TaxpayerTest {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Taxpayer> taxpayerDetails = new ArrayList();
	static ArrayList<ArrayList<Taxpayer>> taxpayerTaxDetails = new ArrayList();
	static int numberOfTaxPayers = 0;
	static Boolean dataEntered = false;

	public static void main(String[] args) {
		//		Display Menu
		System.out.println("Menu: \n"
				+ "1. Read, validate and store data for taxpayers.\n"
				+ "2. Calculate and store tax and group number for all taxpayers.\n"
				+ "3. Display all taxpayers.\n"
				+ "4. Display the name and age of all taxpayers from tax group 1.\n"
				+ "5. Search a taxpayer by age.\n"
				+ "6. Sort and display taxpayers.\n"
				+ "7. Exit from the application.\n"
				+ "Enter yourt input between (1-7)!");
		if(dataEntered) {
			System.out.println("Please enter '2' to calculate the tax for the entered user!\n"
					+ "Otherwise the entered data will be lost!");
		}
		dataEntered = false;
		//		Take User Choice
		int choice = sc.nextInt();

		switch(choice) {
		case 1:{
			readValidateStoreData();
			main(args);
			break;
		}
		case 2:{
			storeTaxAndTaxgroup();
			main(args);
			break;
		}
		case 3:{
			displayAllTaxPayers();
			main(args);
			break;
		}
		case 4:{
			displayFromGroup1();
			main(args);
			break;
		}
		case 5:{
			searchByAge();
			main(args);
			break;
		}
		case 6:{
			sortAndDisplay();
			main(args);
			break;
		}
		case 7:{
			System.out.println("You have successfully exited the Program!");
			System.exit(0);
			break;
		}
		default:{
			System.out.println("Please enter a valid input!");
			main(args);
			break;
		}
		}
		sc.close();

	}
//	Case 6: To sort Tax payers data in descending order of tax payers names
	static void sortAndDisplay() {
		String[] namesArray = new String[numberOfTaxPayers];
		for(int i = 0;i < numberOfTaxPayers;i++) {
			namesArray[i] = taxpayerTaxDetails.get(i).get(0).taxPayerName;
		}
		for(int i = 0;i < namesArray.length;i++) {
			for(int j = i+1;j < namesArray.length;j++) {
				if(namesArray[i].compareTo(namesArray[j]) < 0) {
					String temp = namesArray[i];
					namesArray[i] = namesArray[j];
					namesArray[j] = temp;
				}
			}
		}
		if(numberOfTaxPayers > 1) {
			System.out.println("Sorted tax payers in descending alphabetical order names are: ");
		}
		for(int i = 0;i < numberOfTaxPayers;i++) {
			for(int j = 0;j < numberOfTaxPayers;j++) {
				if(namesArray[i].equalsIgnoreCase(taxpayerTaxDetails.get(j).get(0).taxPayerName)) {
					System.out.println("Name: " + taxpayerTaxDetails.get(j).get(0).taxPayerName
							+ " Age: " + taxpayerTaxDetails.get(j).get(0).taxPayerAge
							+ " Income: " + taxpayerTaxDetails.get(j).get(0).taxPayerTaxableIncome
							+ " Tax: " + taxpayerTaxDetails.get(j).get(0).taxPayerTax
							+ " Group: " + taxpayerTaxDetails.get(j).get(0).taxPayerGroup);
				}
			}
		}

	}
//	Case5: Take age from user and display tax payer details who are of the same age
	static void searchByAge() {
		int searchTrueCount = 0;
		System.out.println("Enter the age you wish to search for: ");
		int searchAge = sc.nextInt();
		for(int i = 0;i < numberOfTaxPayers;i++) {
			int age = taxpayerTaxDetails.get(i).get(0).taxPayerAge;
			if(searchAge == age) {
				if(searchTrueCount < 1) {
				System.out.println("The tax payers from the age " + searchAge + " are: ");
				}
				searchTrueCount++;
				System.out.println("Name: " + taxpayerTaxDetails.get(i).get(0).taxPayerName
						+ " Age: " + taxpayerTaxDetails.get(i).get(0).taxPayerAge
						+ " Income: " + taxpayerTaxDetails.get(i).get(0).taxPayerTaxableIncome
						+ " Tax: " + taxpayerTaxDetails.get(i).get(0).taxPayerTax
						+ " Group: " + taxpayerTaxDetails.get(i).get(0).taxPayerGroup);
			}
		}
		if(searchTrueCount < 1) {
			System.out.println("There are no tax payers in the provided age group!");
		}

	}
//	Case4: Display the name and age of tax payers who belong to Group1
	static void displayFromGroup1() {
		System.out.println("Tax payers from Group1: ");
		for(int i = 0;i < numberOfTaxPayers;i++) {
			String groupName = taxpayerTaxDetails.get(i).get(0).taxPayerGroup;
			if(groupName.equals("Group1")) {
				System.out.println("Name: " + taxpayerTaxDetails.get(i).get(0).taxPayerName
						+ " Age: " + taxpayerTaxDetails.get(i).get(0).taxPayerAge);
			}
		}
	}
//	Case3: Display the tax payers details after calculation their tax and their groups
	static void displayAllTaxPayers() {
		if(numberOfTaxPayers != 0) {
			System.out.println("The tax details of the tax payers are: ");
		}
		for(int i = 0;i < numberOfTaxPayers;i++) {
			System.out.println("Name: "+taxpayerTaxDetails.get(i).get(0).taxPayerName
					+ " Age: " + taxpayerTaxDetails.get(i).get(0).taxPayerAge
					+ " Income: " + taxpayerTaxDetails.get(i).get(0).taxPayerTaxableIncome
					+ " Tax: " + taxpayerTaxDetails.get(i).get(0).taxPayerTax
					+ " Group: " + taxpayerTaxDetails.get(i).get(0).taxPayerGroup);
		}

	}
//	Case2: Calculate the tax and their groups of tax payers and store in a arraylist
	static void storeTaxAndTaxgroup() {
		if((taxpayerDetails.get(numberOfTaxPayers).taxPayerTaxableIncome >= 0) && (taxpayerDetails.get(numberOfTaxPayers).taxPayerTaxableIncome <= 18200)) {
			taxpayerDetails.get(numberOfTaxPayers).setTaxPayerGroup("Group1");
			ArrayList<Taxpayer> tempArrList = new ArrayList();
			tempArrList.add(taxpayerDetails.get(numberOfTaxPayers));
			taxpayerTaxDetails.add(tempArrList);
			numberOfTaxPayers++;
		}
		else if((taxpayerDetails.get(numberOfTaxPayers).taxPayerTaxableIncome > 18201) && (taxpayerDetails.get(numberOfTaxPayers).taxPayerTaxableIncome < 37000)) {
			double extraAmount = (taxpayerDetails.get(numberOfTaxPayers).taxPayerTaxableIncome) - 18200;
			double extraTaxAmount = extraAmount * (0.19);
			taxpayerDetails.get(numberOfTaxPayers).setTaxPayerTax(extraTaxAmount);
			taxpayerDetails.get(numberOfTaxPayers).setTaxPayerGroup("Group2");
			ArrayList<Taxpayer> tempArrList = new ArrayList();
			tempArrList.add(taxpayerDetails.get(numberOfTaxPayers));
			taxpayerTaxDetails.add(tempArrList);
			numberOfTaxPayers++;
		}
		else if((taxpayerDetails.get(numberOfTaxPayers).taxPayerTaxableIncome > 37001) && (taxpayerDetails.get(numberOfTaxPayers).taxPayerTaxableIncome < 87000)) {
			double extraAmount = (taxpayerDetails.get(numberOfTaxPayers).taxPayerTaxableIncome) - 37000;
			double extraTaxAmount = extraAmount * (0.325);
			taxpayerDetails.get(numberOfTaxPayers).setTaxPayerTax(extraTaxAmount);
			taxpayerDetails.get(numberOfTaxPayers).setTaxPayerGroup("Group3");
			ArrayList<Taxpayer> tempArrList = new ArrayList();
			tempArrList.add(taxpayerDetails.get(numberOfTaxPayers));
			taxpayerTaxDetails.add(tempArrList);
			numberOfTaxPayers++;
		}
		else if((taxpayerDetails.get(numberOfTaxPayers).taxPayerTaxableIncome > 87001) && (taxpayerDetails.get(numberOfTaxPayers).taxPayerTaxableIncome < 180000)) {
			double extraAmount = (taxpayerDetails.get(numberOfTaxPayers).taxPayerTaxableIncome) - 87000;
			double extraTaxAmount = extraAmount * (0.37);
			taxpayerDetails.get(numberOfTaxPayers).setTaxPayerTax(extraTaxAmount);
			taxpayerDetails.get(numberOfTaxPayers).setTaxPayerGroup("Group4");
			ArrayList<Taxpayer> tempArrList = new ArrayList();
			tempArrList.add(taxpayerDetails.get(numberOfTaxPayers));
			taxpayerTaxDetails.add(tempArrList);
			numberOfTaxPayers++;
		}
		else if(taxpayerDetails.get(numberOfTaxPayers).taxPayerTaxableIncome > 180001) {
			double extraAmount = (taxpayerDetails.get(numberOfTaxPayers).taxPayerTaxableIncome) - 180000;
			double extraTaxAmount = extraAmount * (0.45);
			taxpayerDetails.get(numberOfTaxPayers).setTaxPayerTax(extraTaxAmount);
			taxpayerDetails.get(numberOfTaxPayers).setTaxPayerGroup("Group5");
			ArrayList<Taxpayer> tempArrList = new ArrayList();
			tempArrList.add(taxpayerDetails.get(numberOfTaxPayers));
			taxpayerTaxDetails.add(tempArrList);
			numberOfTaxPayers++;
		}

	}
//	Case1: Take the name,age and taxable income of tax payers and store them in a arraylist
	static void readValidateStoreData() {
		Taxpayer taxpayerRead = new Taxpayer();
		System.out.println("Enter the Tax Payer Name: ");
		taxpayerRead.setTaxPayerName(sc.next());
		ageEntry(taxpayerRead);
		taxAmountEntry(taxpayerRead);
		taxpayerDetails.add(taxpayerRead);
		dataEntered = true;
		System.out.println("Tax payer Details: " + taxpayerDetails);
	}
	static void ageEntry(Taxpayer taxpayerRead) {
		System.out.println("Enter the Tax Payer Age: ");
		int inputAge = sc.nextInt();
		if((inputAge >= 18) && (inputAge <= 64)) {
			taxpayerRead.setTaxPayerAge(inputAge);
		}
		else {
			System.out.println("Taxpayers apart from the ages 18 and 64 are not allowed!\n"
					+ "Please enter the age in between 18 and 64!");
			ageEntry(taxpayerRead);
		}
	}
	static void taxAmountEntry(Taxpayer taxpayerRead){
		System.out.println("Enter the Tax Payer Income: ");
		double inputIncome = sc.nextDouble();
		if((inputIncome >= 1) && (inputIncome <= 999000)) {
			taxpayerRead.setTaxPayerTaxableIncome(inputIncome);
		}
		else {
			System.out.println("Income apart from $1 to $999000 are not allowed!\n"
					+ "Please enter the Income amount in between $1 and $999000!");
			taxAmountEntry(taxpayerRead);
		}
	}

}
