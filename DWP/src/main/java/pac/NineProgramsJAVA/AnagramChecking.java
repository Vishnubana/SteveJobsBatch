package pac.NineProgramsJAVA;

import java.util.Arrays;

public class AnagramChecking {
	String str1 = "Hello";
	String str2 = "hello";
	public static void main(String[] args) {
		AnagramChecking anagramChecking = new AnagramChecking();
		anagramChecking.anagramCheckMethod();	
		
	}
	
	void anagramCheckMethod() {
		
//		Conversion of both Strings to Lower Case
		str1 = str1.toLowerCase();	
		str2 = str2.toLowerCase();
		
		if(str1.length() == str2.length()) {
		
//		Covert to character Array
		char[] charArr1 = str1.toCharArray();
		char[] charArr2 = str2.toCharArray();
//		Sorting both Character Arrays
		Arrays.sort(charArr1);
		Arrays.sort(charArr2);
		
		boolean Result = Arrays.equals(charArr1,charArr2);
		if(Result) {
			System.out.println("The given strings "+this.str1+" and "+this.str2+" are an Anagram!");
		}
		else {
			System.out.println("The given strings "+this.str1+" and "+this.str2+" are not an Anagram!");
		}
		}
		else {
			System.out.println("The given strings "+this.str1+" and "+this.str2+" are not an Anagram!");
		}
		
	}

}
