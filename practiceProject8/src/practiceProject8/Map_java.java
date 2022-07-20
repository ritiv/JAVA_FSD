package practiceProject8;
import java.util.*;

public class Map_java {
	
	public static void main(String[] args) {
		
		HashMap<Integer , String> map1 = new HashMap<Integer , String>();
		
		map1.put(123 , "ritiv");
		map1.put(124 , "rohan");
		map1.put(125 , "ritesh");
		
		System.out.println(map1);
		
		Hashtable<Integer,String> map2 = new Hashtable<Integer,String>();  
	      
	      map2.put(01,"RITS");  
	      map2.put(02,"ROSHAL");  
	      map2.put(03,"RISHIT");  
	      map2.put(04,"RENA");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry x : map2.entrySet()){    
	       System.out.println(x.getKey()+" "+x.getValue());    
	      }
	      
	      TreeMap<Integer,String> map3 = new TreeMap<Integer,String>();    
	      
	      map3.put(05,"Artik");    
	      map3.put(06,"Car");    
	      map3.put(07,"Cat");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry y : map3.entrySet()){    
	       System.out.println(y.getKey()+" "+y.getValue());    
	      }    


		
	}

}
