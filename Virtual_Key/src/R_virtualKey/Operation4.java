package R_virtualKey;
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Operation4 extends Operation3 {
	
public void SearchOfFile(String path , String fileName){
		
		if (path == null || path.isEmpty() || path.isBlank())
			throw new NullPointerException("Path cannot be Empty or null");
		
		
		if (fileName == null || fileName.isEmpty() || fileName.isBlank())
			throw new NullPointerException("File Name cannot be Empty or null");
		
		File dir = new File(path);
		
		if(!dir.exists())
			throw new IllegalArgumentException("Path does not exist");
		
		if(dir.isFile())
			throw new IllegalArgumentException("The given path is a file. A directory is expected.");
		
		
		String [] fileList = dir.list();
		boolean flag = false;
		
		Pattern pat = Pattern.compile(fileName);
		
		if(fileList != null && fileList.length > 0) {
			for(String file:fileList) {
				Matcher mat = pat.matcher(file);
				if(mat.matches()) {
					System.out.println("File Found at location: " + dir.getAbsolutePath());
					flag = true;
					break;
				}
			}
		}
		
		if(flag == false)
			System.out.println("File Not Found.. Please try again.");
		
			
	}

}
