package pac.PolymorphismConcept;

public class ClassOne {
	
	int numE=60,numR=3;
	
	int divTwoNumbers() {
		return numE/numR;
	}
	
	int divTwoNumbers(int numE, int numR) {
		return numE/numR;
	}
	
	int modTwoNumbers() {
		return numE%numR;
	}
	
	

}
