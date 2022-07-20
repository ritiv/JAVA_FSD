package practiceProject9;
import java.util.*;

class Email_velidation {

    public static void main(String[] args) {
       
    	Scanner src = new Scanner(System.in);
        
    	System.out.println("Enter the number of emails for registration");
       
    	int x = src.nextInt();
       
    	String arr[] = new String[x];
       
    	src.nextLine();
        
    	for(int i=0;i<x;i++)
        {
        	 
    		arr[i]=src.next();
    		
        }
  
    	System.out.println("enter the email id you want to search");
        
    	String Search = src.next();
        
    	int cnt =0;
                
    		for(int i=0; i<x; i++) 
                {
                	
                    if(Search.equals(arr[i])) 
                    {
                        System.out.println("email ID " + Search + " status: Valid");
                        
                        break;
                        
                    }
                    
                    cnt++;
                    
                }
                
    				if(cnt == x)
                {
                    System.out.println("email ID " + Search + " status: Invaid");
                    
                }
                

    }

}