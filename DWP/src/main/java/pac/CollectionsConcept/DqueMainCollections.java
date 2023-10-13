package pac.CollectionsConcept;

import java.util.ArrayDeque;
import java.util.Deque;

public class DqueMainCollections {

	public static void main(String[] args) {
		
		Deque dqueOne = new ArrayDeque();
		
		dqueOne.add('M');
		dqueOne.add("vishnuvvardhan789@gmail.com");
		dqueOne.addLast(23);
		dqueOne.addFirst("Vishnu");
		dqueOne.add("Bana");
		
		System.out.println("Deque: "+dqueOne);
	}

}
