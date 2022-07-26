package joinDemo;
import java.util.*;

public class joindemo extends Thread {
	
	private static int n , sum;

	public static void main(String[] args) {
		
		System.out.println("Sum of N numbers");
		System.out.println("Enter the number");
		
		Scanner sc = new Scanner(System.in);
		joindemo.n = sc.nextInt();
		
		joindemo th1 = new joindemo();
		
		th1.start();
		
		try {
			th1.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Sum of first " + joindemo.n + " numbers = " + joindemo.sum);
		

	}
	
	public void run() {
		for(int i=1;i<=joindemo.n;i++) {
			
			joindemo.sum += i;
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		
		
	}

}
