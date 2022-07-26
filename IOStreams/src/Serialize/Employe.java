package Serialize;

import java.io.Serializable;

public class Employe implements Serializable {
	
	int id;
	String name;
	transient int adharno;
	int salery;
	public Employe( int id, String name, int adharno, int salery) {
		
		this.id = id;
		this.adharno =adharno;
		this.name = name;
		this.salery = salery;
		
		
	} 
	
	@Override
	public String toString() {
		
		return "Id= " +id+ "name= " +name+ "salery= " +salery+ "adharno= " +adharno;
	}

}
