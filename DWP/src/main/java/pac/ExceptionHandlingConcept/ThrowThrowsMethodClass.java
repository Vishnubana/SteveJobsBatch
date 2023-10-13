package pac.ExceptionHandlingConcept;

public class ThrowThrowsMethodClass {
	
	
//	Method to throw exception using new keyword
	void throwThrows()throws Exception {
		try {
		System.out.println(1/0);
		}catch(ArithmeticException e) {
			throw new ArithmeticException();
		}
	}
//	Method to throw Exception without using new keyword
	void throwThrowse() {
		try {
			System.out.println(1/0);
		}catch(ArithmeticException e) {
			throw e;
		}
	}
	void methodWithoutHandling()/*throws ArithmeticException */{
		System.out.println(1/0);
	}

}
