package pac.CollectionsConcept;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollectionMain {

	public static void main(String[] args) {
//		Tree set creation
		Set setStudentDataTree = new TreeSet();
//		Adding input data into the Tree set
		setStudentDataTree.add("Vishnu");
		setStudentDataTree.add("Vardhan");
		setStudentDataTree.add("Reddy");
		setStudentDataTree.add("Bana");
		
//		Adding duplicate input data into Tree Set
		Set setStudentDataTreeDuplicate = new TreeSet();
		setStudentDataTreeDuplicate.add("VishnuBana");
		setStudentDataTreeDuplicate.add("VishnuBana");
		setStudentDataTreeDuplicate.add("Vardhan");
		setStudentDataTreeDuplicate.add("Reddy");
		
//		Adding input data into the Hash set
		Set setStudentDataHash = new HashSet();
		setStudentDataHash.add("Vishnu");
		setStudentDataHash.add("Bana");
		setStudentDataHash.add('M');
		setStudentDataHash.add(23);
		
//		Adding duplicate input data into the Hash set
		Set setStudentDataHashDuplicate = new HashSet();
		setStudentDataHashDuplicate.add("Vishnu");
		setStudentDataHashDuplicate.add('M');
		setStudentDataHashDuplicate.add(23);
		setStudentDataHashDuplicate.add("Vishnu");
		
		System.out.println("Tree Set"+setStudentDataTree);
		System.out.println("Tree Set with Duplicates"+setStudentDataTreeDuplicate);
		System.out.println("Hash Set"+setStudentDataHash);
		System.out.println("Hash Set with Duplicates"+setStudentDataHashDuplicate);
		
		

	}

}
