package R_virtualKey;
import java.io.*;
import java.util.*;

public class Operation2 extends Operation1 {
	
public void InitiateNewFile(String path , String fileName) throws IOException {
		
		if (path == null || path.isEmpty() || path.isBlank())
			throw new NullPointerException("Path cannot be Empty or null");
	
		
		if (fileName == null || fileName.isEmpty() || fileName.isBlank())
			throw new NullPointerException("File Name cannot be Empty or null");
		
		File newFile = new File(path + File.separator + fileName);
		
		boolean createFile = newFile.createNewFile();
		
		if (createFile) {
			
			System.out.println("\nFile Successfully Created: " + newFile.getAbsolutePath());
			
		}else if(!createFile) {
			
			System.out.println("\nFile Already Exist.. Please try again." );
			
		}
			
	}

}
