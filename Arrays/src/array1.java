import java.util.*;;

// Leaner searching
public class array1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of array");
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("enter the values to string");
		
		for(int i = 0; i<n; i++) {
			
	
			 arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the number to be found");
		
		int x = sc.nextInt();
		
		int temp = 0;
		
		for(int i=0; i< arr.length; i++) {
			
			if(arr[i] == x) {
				
				System.out.println("number found: " + i);
				
				break;
			}
			
			temp++;
		}
		
		if (temp==n) {
			
			System.out.println("Invalid number");
		}
				
		
		
	}
	
	

}
