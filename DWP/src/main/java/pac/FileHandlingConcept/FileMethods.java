package pac.FileHandlingConcept;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileMethods {

	public static void main(String[] args)throws IOException {
		String fileNamePath = "C:\\Users\\91789\\OneDrive\\Desktop\\CB_HTML\\Java_20_09_2023\\FileMethodTestFile.txt";
		String fileNamePathWrite = "C:\\Users\\91789\\OneDrive\\Desktop\\CB_HTML\\Java_20_09_2023\\FileMethodTestFileWrite.txt";
		File fileExisted = new File(fileNamePath);
		File fileExistedWrite = new File(fileNamePathWrite);
		//fileExistedWrite.createNewFile();
		//fileExisted.createNewFile();
//		System.out.println("Can Execute: "+fileExisted.canExecute());
//		System.out.println("Can Read: "+fileExisted.canRead());
//		System.out.println("Can Write: "+fileExisted.canWrite());
//		System.out.println("Get Absolute Path: "+fileExisted.getAbsolutePath());
//		System.out.println("Canonical Path: "+fileExisted.getCanonicalPath());
//		System.out.println("Get Path: "+fileExisted.getPath());
//		System.out.println("Get Free Space: "+fileExisted.getFreeSpace());
//		System.out.println("Get Name: "+fileExisted.getName());
//		System.out.println("Get Parent: "+fileExisted.getParent());
//		System.out.println("Get Total Space: "+fileExisted.getTotalSpace());
//		System.out.println("Get Usable Space: "+fileExisted.getUsableSpace());
//		System.out.println("Last Moduified: "+fileExisted.lastModified());
//		System.out.println("Length: "+fileExisted.length());
//		System.out.println("To String: "+fileExisted.toString());
//		System.out.println("Get Parent File: "+fileExisted.getParentFile());
//		System.out.println("Get Class: "+fileExisted.getClass());
//		System.out.println("Is Absolute: "+fileExisted.isAbsolute());
//		System.out.println("Is Directory: "+fileExisted.isDirectory());
//		System.out.println("Is File: "+fileExisted.isFile());
		
		
		FileReader fr = new FileReader(fileExisted);
		BufferedReader br = new BufferedReader(fr);
		System.out.println("Reading: "+br.readLine());
		
		FileWriter fw = new FileWriter(fileExistedWrite);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("This is a 'Write' testing!");
		bw.flush();
		
	}

}
