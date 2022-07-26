package Serialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializeable {
	
	public static void main(String[] args) {
		
		try(FileOutputStream fl = new FileOutputStream("/Users/ritivtiwari/Downloads/Testfile.txt");
				ObjectOutputStream obj = new ObjectOutputStream(fl);){
			
			Employe emp = new Employe(1,"Ritiv",345,4500);
			
			obj.writeObject(emp);
			
			System.out.println("Serialized employe Object");
			
		} 
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}
	}

}
