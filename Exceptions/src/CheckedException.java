import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;


public class CheckedException {

	public static void main(String[] args) {
		try {
		FileInputStream fil = new FileInputStream("c.\\temp\\test.text");
		}
		catch(FileNotFoundException e) {
			System.out.println("file not found");
		}
		
		finally {
			
			System.out.println("always exicute ");
		}
	}

}
