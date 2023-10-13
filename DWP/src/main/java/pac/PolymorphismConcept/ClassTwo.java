package pac.PolymorphismConcept;

public class ClassTwo extends ClassOne {

	public static void main(String[] args) {
		ClassOne classOne = new ClassOne();
		ClassTwo classTwo = new ClassTwo();
		
		System.out.println(classOne.divTwoNumbers());
		
		System.out.println(classOne.divTwoNumbers(50, 10));
		
		System.out.println(classTwo.modTwoNumbers());

	}
	 int modTwoNumbers() {
		return (numE%numR)+5;
	}
//	We can change the return type for method overloading
//	We cannot change the return type for method overiding
	 long modTwoNumbers(int a) {
			return (numE%numR)+5;
		}

}
