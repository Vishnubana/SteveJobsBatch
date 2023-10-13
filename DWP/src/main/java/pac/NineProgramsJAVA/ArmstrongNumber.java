package pac.NineProgramsJAVA;

	public class ArmstrongNumber {
		public static void main(String[] args) {
			armstrongNumberChecker(153);
		}

	  static  void armstrongNumberChecker(int givenNumber) {
	    	int tempNumber,remainder,result = 0;
	    	tempNumber = givenNumber;
	    	
	    	while(tempNumber!=0) {
	    		remainder = tempNumber%10;
	    		result += remainder*remainder*remainder;
	    		tempNumber/=10;	
	    	}
	    	if(result == givenNumber) {
	    		System.out.println("The given number"+" "+givenNumber+" "+"is a Armstrong number!");
	    	}
	    	else {
	    		System.out.println("The given number"+" "+givenNumber+" "+"is not a Armstrong number!");
	    	}
	    }
	}

