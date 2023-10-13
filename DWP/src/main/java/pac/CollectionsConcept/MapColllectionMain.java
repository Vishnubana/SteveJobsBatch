package pac.CollectionsConcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MapColllectionMain {

	public static void main(String[] args) {
//		Normal Map Creation
		Map normalMap = new HashMap();

//		Normal Map Inputs
		normalMap.put("Name", "Vishnu");
		normalMap.put("Age", 23);
		normalMap.put("Gender", 'M');
		System.out.println("Normal Map : "+normalMap);
		
//		Generic Specific Map
		Map<String,String> genericSpecificMap = new HashMap<String,String>();
//		Generic Map Inputs
		genericSpecificMap.put("FirstName", "Vishnu");
		genericSpecificMap.put("LastName", "Bana");
		genericSpecificMap.put("Gender", "Male");
//		The method put(String, String) in the type Map<String,String> is not applicable for the arguments (String, char)
//		genericSpecificMap.put("Gender", 'M');
		System.out.println("Generic Specific Map : "+genericSpecificMap);
//		Map Of Map Creation
		Map<Integer,Map> mapOfMap = new HashMap<Integer,Map>();
//		Map of Map Input
		mapOfMap.put(01, normalMap);
		mapOfMap.put(02, genericSpecificMap);
		System.out.println("Map Of Map : "+mapOfMap);
		
//		Object for Student 1
		InputClassForCollections inputClassForCollectionsStudent1 = new InputClassForCollections();
		inputClassForCollectionsStudent1.setNameOfStudent("Vishnu");
		inputClassForCollectionsStudent1.setAgeOfStudent(23);
		inputClassForCollectionsStudent1.setGenderOfStudent('M');
		inputClassForCollectionsStudent1.setEmailIdOfStudent("vishnuvvardhan789@gmail.com");
//		Object for Student 2
		InputClassForCollections inputClassForCollectionsStudent2 = new InputClassForCollections();
		inputClassForCollectionsStudent2.setNameOfStudent("VishnuBana");
		inputClassForCollectionsStudent2.setAgeOfStudent(24);
		inputClassForCollectionsStudent2.setGenderOfStudent('M');
		inputClassForCollectionsStudent2.setEmailIdOfStudent("vishnubana2001@gmail.com");
		
		Map<Integer,InputClassForCollections> objectsMap = new HashMap<Integer,InputClassForCollections>();
		objectsMap.put(1, inputClassForCollectionsStudent1);
		objectsMap.put(2, inputClassForCollectionsStudent2);
		for (Map.Entry<Integer, InputClassForCollections> entryVariable : objectsMap.entrySet()) {
		    Integer keyObj = entryVariable.getKey();
		    InputClassForCollections valueObj = entryVariable.getValue();
		    
		    System.out.println("Details Of Student "+keyObj+"\nName: "+valueObj.getNameOfStudent()+"\nAge: "+valueObj.getAgeOfStudent()+"\nGender: "+valueObj.getGenderOfStudent()+"\nEmail: "+valueObj.getEmailIdOfStudent());
		}
		
		List listTestZero = new ArrayList();
		listTestZero.add("Bana");
		listTestZero.add(24);
		listTestZero.add('M');
		listTestZero.add("vishnu2001@gmail.com");
		
		List listTestOne = new ArrayList();
		listTestOne.add("Vishnu");
		listTestOne.add(23);
		listTestOne.add('M');
		listTestOne.add("vishnuvvardhan789@gmail.com");
		System.out.println(listTestOne);
//		Contains Method
		System.out.println("Contains Method: "+listTestOne.contains("Vishnu"));
//		ContailsAll Method
		System.out.println("ContainsAll Method: "+listTestOne.containsAll(listTestZero));
//		Size Method
		System.out.println("Size: "+listTestOne.size());
//		IsEmpty Method
		System.out.println("IsEmpty: "+listTestOne.isEmpty());
//		Equals Method
		System.out.println("Equals Method: "+listTestOne.equals(listTestOne));
		System.out.println("Equals Method: "+listTestOne.equals(listTestZero));
//		Clear Method
		listTestOne.clear();
		System.out.println("Clear Method: "+listTestOne);
//		Remove Method
		listTestZero.remove(1);
		System.out.println("Remove Method: "+listTestZero);
//		Remove All
		listTestZero.removeAll(listTestZero);
		System.out.println("Remove All Method"+listTestZero);
		

		
		
	}

}
