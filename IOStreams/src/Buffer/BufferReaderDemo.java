package Buffer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferReaderDemo {
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("/Users/ritivtiwari/Downloads/Testfile.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		String lines;
		int count = 0;
		
		while((lines = br.readLine()) != null) {
			
			StringTokenizer st = new StringTokenizer(lines);
				/*while(st.hasMoreTokens()) {
					count++;
					st.nextToken();					
				}*/
			count += st.countTokens();
			
			
		}

		fr.close();
		br.close();
		
		System.out.println("Count of the words present on the file: " + count);
	}
	
	

}
