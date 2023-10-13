package pac.NineProgramsJAVA;

import java.util.Scanner;

public class FindTheWord {
	public static void main(String[] args) {
		
		wordSearching();
		
	}
			
	static Scanner sc = new Scanner(System.in);
	static void wordSearching() {
		System.out.println("Please Enter The String Input");
		String givenSentence=sc.nextLine();
		int wordIndex = givenSentence.indexOf("Vishnu");
		if(wordIndex<0) {
			System.out.println("The given word is not found!");
		}
		else {
		System.out.println("Found the word 'Vishnu' at"+" "+wordIndex);
		}
	}
	
	}
	

