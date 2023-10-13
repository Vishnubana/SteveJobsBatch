package pac.NineProgramsJAVA;

public class PalindromeChecker {
	public static void main(String[] args) {
		palindromeCheckMethod("1234567890987654321");
	}

		 static void palindromeCheckMethod(String givenInput) {
			  String reverseInput="";
			  int givenInputLength = givenInput.length();
			  
			  for(int i=(givenInputLength-1);i>=0;--i) {
				  reverseInput +=givenInput.charAt(i);
			  }
			  if (givenInput.toLowerCase().equals(reverseInput.toLowerCase())) {
			      System.out.println(givenInput + " is a Palindrome!");
			    }
			    else {
			      System.out.println(givenInput + " is not a Palindrome!");
			    }
		  }
		}


