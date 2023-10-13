package pac.ExceptionHandlingConcept;

public class ExceptionHandlingLogic {

	public static void main(String[] args) {
		
		try {
			System.out.println(1/0);
		}
		catch(Exception eh) {
			System.out.println("Catch Block");
		}
		finally {
			System.out.println("Finally Block");
		}
	}
	
}
