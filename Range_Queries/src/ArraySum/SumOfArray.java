package ArraySum;

import java.util.*;

public class SumOfArray {  
    public static void main(String[] args) {      
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter starting range and ending range where 0 <= L <= R <= n-1\n"
          		+ "");
          int L = sc.nextInt();
          int R = sc.nextInt();
        //Initialize array   
        int [] arr = new int [] {1, 2, 3, 4, 5};   
        int sum = 0;
        int n = arr.length;
      
        
        
        
        //Loop through the array to calculate sum of elements  
        for (int i = L; i < R; i++) {   
           sum = sum + arr[i];  
        }    
        System.out.println("Sum of all the elements of an array: " + sum);  
    }  
}  
