package ReaderWriter;
import java.io.*;

public class readerwriterDemo {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("/Users/ritivtiwari/Downloads/Testfile.txt");
		FileWriter fw = new FileWriter("/Users/ritivtiwari/Downloads/TestWrite.txt");
		
		int ch;
		while ((ch = fr.read()) != -1) {
			
			fw.write(ch);
			
		}
		
		fr.close();
		fw.close();
	}
	
	

}
