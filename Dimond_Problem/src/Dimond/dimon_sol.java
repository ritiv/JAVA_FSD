package Dimond;

public class dimon_sol implements One,Two{
	
	 public void show() 
	    {  
	        One.super.show(); 
	        Two.super.show(); 
	    } 
	    public static void main(String args[]) 
	    { 
	    	dimon_sol ob = new dimon_sol(); 
	        ob.show(); 
	    } 


}
