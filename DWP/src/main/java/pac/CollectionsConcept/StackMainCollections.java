package pac.CollectionsConcept;

import java.util.Stack;

public class StackMainCollections {

	public static void main(String[] args) {
		
//		Stack Creation
		Stack staOne = new Stack();
//		Adding Elements
		staOne.push("Vishnu");
		staOne.push(23);
		staOne.push('M');
		staOne.push("vishnuvvardhan789@gmail.com");
		
		System.out.println("Stack: "+staOne);
		
//		Removing Elements
		staOne.pop();
		System.out.println("Stack After POP: "+staOne);
		
		
	}

}
