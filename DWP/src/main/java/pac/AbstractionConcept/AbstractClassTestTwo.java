package pac.AbstractionConcept;

public class AbstractClassTestTwo extends AbstractClassTest implements InterfaceOne {

	public static void main(String[] args) {
		
//		ClassOne classOne = new ClassOne(); We cannot create a object for abstract class! 
		AbstractClassTestTwo abstractClassTestTwo = new AbstractClassTestTwo();
		System.out.println(abstractClassTestTwo.addTwoNumbers(5,9));
		
		System.out.println(subTwoNumbers(9,5));
		
		System.out.println(abstractClassTestTwo.mulTwoNumbers(9,5));

	}
	int addTwoNumbers(int numa,int numb) {
		return numa + numb;
	}
	public int mulTwoNumbers(int numQ, int numW) {
		return numQ*numW;
		
	}

}
