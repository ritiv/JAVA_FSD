package Subsequence;

public class Increasing_Subsequence {

	public static void main(String[] args) {
		
		 int sub = 0;
		   
		 int rt = 1;
		 
		 int arr1[] = {20, 32, 10, 43, 11, 70, 21, 80 }; //10 22 33 50 60
		 
		 int num = arr1.length;
		 
		 int check=0;
		 
		 for(int i=0;i<num;i++)
		    {
		  
			 check=arr1[i];
		     
			 for(int j=i;j<num-1;j++)
		     	{
		            
		            if(check<arr1[j+1])
		            {
		                check=arr1[j+1];
		               // System.out.println("j="+arr[j+1]);
		                rt++;
		            }
		        }
		        if(sub<=rt)
		        {
		            sub=rt;
		        }
		        rt=1;
		    }
		   
		 System.out.println(sub);
			

	}

}
