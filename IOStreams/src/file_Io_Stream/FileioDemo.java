package file_Io_Stream;

import java.io.*;

public class FileioDemo {
	
	public static void main(String[] args) {
		
		File myfile = new File("/Users/ritivtiwari/Downloads/Testfile.txt");
		
		//for reading file;
		//FileInputStream fil = null;
		FileOutputStream fil = null;
		//int count=0;
		
		try {
			
			//fil = new FileInputStream(myfile);
			fil = new FileOutputStream(myfile);
			System.out.println("File opened successfuly");
			String data = "hellow Ritiv";
			
			//int i;
			//while((i = fil.read()) != -1 ) {
				//count++;
				//System.out.print((char) i);
			//}
			
			fil.write(data.getBytes());
		} 
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
			finally {
				
				try {
					fil.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("fileclosed");
				//System.out.println("Total bits read: " + count);
			}
		
		
	}

}
