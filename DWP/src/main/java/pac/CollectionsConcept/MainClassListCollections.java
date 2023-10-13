package pac.CollectionsConcept;

import java.util.ArrayList;
import java.util.List;

public class MainClassListCollections {
	public static int studentNumber = 1;
	public static void main(String[] args) {
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
		
//		List Creation
		List<InputClassForCollections> studentDataList = new ArrayList<InputClassForCollections>();
		studentDataList.add(inputClassForCollectionsStudent1);
		studentDataList.add(inputClassForCollectionsStudent2);
//		Checking the contents of the List
//		System.out.println(studentDataList);
		for(InputClassForCollections listContents : studentDataList) {
			System.out.println("\n"+"Details of Student:"+studentNumber+"\n");
			System.out.println("Name of the Student: "+listContents.nameOfStudent+"\nAge of Student: "+listContents.ageOfStudent+"\nGender of Student: "+listContents.genderOfStudent+"\nEmailId of Student: "+listContents.emailIdOfStudent);
			studentNumber++;
		}
		
//		Normal List Creation
		List sampleList = new ArrayList();
		sampleList.add("Vishnu");
		sampleList.add(23);
		sampleList.add('M');
		sampleList.add("vishnuvvardhan789@gmail.com");
				
//		List Get Usage
		System.out.println("Value at a particular Index: "+sampleList.get(1));
	}

}
