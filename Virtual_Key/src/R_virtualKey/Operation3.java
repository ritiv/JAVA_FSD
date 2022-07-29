package R_virtualKey;
import java.io.*;
import java.util.*;

public class Operation3 extends Operation2 {
	
public void DeletionFile(String path , String fileName) throws IOException {
		
		if (path == null || path.isEmpty() || path.isBlank())
			throw new NullPointerException("Path cannot be Empty or null");
		
		
		if (fileName == null || fileName.isEmpty() || fileName.isBlank())
			throw new NullPointerException("File Name cannot be Empty or null");
		
		File newFile = new File(path + File.separator + fileName);
		
		boolean deleteFile = newFile.delete();
		
		if (deleteFile) {
			
			System.out.println("\nFile deleted Successfully");
			
		}else {
			
			System.out.println("\nFile Not Found.. Please try again." );
			
		}
			
	}

}
