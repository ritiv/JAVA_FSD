package printWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) {
		
		try(FileWriter fw = new FileWriter("/Users/ritivtiwari/Downloads/Testfile.txt", true);
				PrintWriter pw = new PrintWriter(fw);) {
			
			pw.print("This is the odd file");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
