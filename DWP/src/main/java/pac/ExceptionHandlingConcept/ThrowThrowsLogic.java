package pac.ExceptionHandlingConcept;

public class ThrowThrowsLogic {

	public static void main(String[] args){
		ThrowThrowsMethodClass throwThrowsMethodClass = new ThrowThrowsMethodClass();
//		Exception Thrown using new Keyword
		try{
			throwThrowsMethodClass.throwThrows();
		}catch(Exception excep) {
			System.out.println("Exception Thrown using 'new'!"+excep);
		}
		
		try {
		throwThrowsMethodClass.throwThrowse();
		}catch(ArithmeticException e) {
			System.out.println("Exception Thrown using 'e'!"+e);
		}
		
		throwThrowsMethodClass.methodWithoutHandling();
		
	}

}
