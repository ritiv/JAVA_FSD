import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		while(sc.hasNextInt()){
			
			int num = sc.nextInt();
			sum += num;
			System.out.println("Enter the outher number ");
			
			System.out.println("Type anything else rether then integer to get sum");
		}
		
		System.out.println("Sum of the numbers= " + sum);

	}

}
