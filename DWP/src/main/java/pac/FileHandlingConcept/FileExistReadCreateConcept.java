package pac.FileHandlingConcept;

import java.io.File;
import java.io.IOException;

public class FileExistReadCreateConcept {
	void FileExistReadCreateMethod()throws IOException {
	String fileName = "C:\\Users\\91789\\OneDrive\\Desktop\\CB_HTML\\Java_19_09_2023\\FileIOTest";
	File fileVariable = new File(fileName);
	System.out.println("Already existing file Exists :"+fileVariable.exists());
	System.out.println("Already existing file Reading :"+fileVariable.canRead());
	
	String secondFileName = "C:\\Users\\91789\\OneDrive\\Desktop\\CB_HTML\\Java_19_09_2023\\FileIOTestCreateFile";
	
	File fileVariableCreate = new File(secondFileName);
	System.out.println("Non-existing file Exists :"+fileVariableCreate.exists());
	System.out.println("Non-existing file Reading :"+fileVariableCreate.canRead());
	fileVariableCreate.createNewFile();
	System.out.println("Created file Exists :"+fileVariableCreate.exists());
	System.out.println("Created file Reading :"+fileVariableCreate.canRead());
	}

}
