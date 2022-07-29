package R_virtualKey;
import java.io.*;
import java.util.*;

public class Operation1 {
	
public void listOfFiles(String path) {
		
		if (path == null || path.isEmpty() || path.isBlank())
			throw new NullPointerException("Path cannot be Empty or null");
			
		
		File dir = new File(path);
		
		if(!dir.exists())
			throw new IllegalArgumentException("Path does not exist");
		
		if(dir.isFile())
			throw new IllegalArgumentException("The given path is a file. A directory is expected.");
		
		String [] files = dir.list();
		
		System.out.println("\n***********************************");
		if(files != null && files.length > 0) {
			
			Set<String>filesList = new TreeSet<String>(Arrays.asList(files)); 
			System.out.println("The Files in "+ dir.getAbsolutePath() + " are: \n");
			
			for(String file1:filesList) {
				
				System.out.println(file1);
				
			}
			
			System.out.println("\nTotal Number of files: "+ filesList.size());	
		}
		
		else 
		{
			
			System.out.println("Directory is Empty");
		}
		
	}

}
