import java.util.*;
public class Array2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of rows");
		
		int row = sc.nextInt();
		
		System.out.println("Enter no of columns");
		
		int colm = sc.nextInt();
		
		String arr[][] = new String[row][colm];
		
		System.out.println("Enter the 2D String");
		
		for(int i = 0; i<row; i++) {
			
			for(int j = 0; j<colm; j++) {
				
				arr[i][j] = sc.next();
				
				
			}
		}
		
		System.out.println("Enter the String to be found");
		
		String x = sc.next();
		
		int temp = 0;
		
		for(int i = 0; i<row; i++) {
			
			for(int j = 0; j<colm; j++) {
				
				if(arr[i][j] == x) {
					
					System.out.println("valid string ");
					
				}
				System.out.println(arr[i][j] + " ");
				
				
				
			}
			
			System.out.println();
			
			temp++;
		}
		
		if(temp==(row*colm)) {
			
			System.out.println("Entered String is Invalid");
			
		}
		
	}

}
