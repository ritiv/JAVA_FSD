package Resources;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class TrywithResources {
	public static void main(String[] args) {
		try (FileReader fr = new FileReader("/Users/ritivtiwari/Downloads/Testfile.txt");
			 BufferedReader br = new BufferedReader(fr);) {
			
			String line;
			int count = 0;
			while ( (line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line);
				count += st.countTokens();
			}
			System.out.println("count of words in the file = " + count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		
	}
	
}