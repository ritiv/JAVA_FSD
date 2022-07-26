package Serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Deserialization {
	
	public static void main(String[] args) {
		
		try(FileInputStream fl1 = new FileInputStream("/Users/ritivtiwari/Downloads/Testfile.txt");
				ObjectInputStream obj1 = new ObjectInputStream(fl1);){
			
			Employe emp =  (Employe) obj1.readObject();
			
			System.out.println("Serialized employe Object");
			
			System.out.println(emp);
			
		} 
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
