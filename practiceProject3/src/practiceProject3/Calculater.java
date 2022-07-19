package practiceProject3;
import java.util.* ;

public class Calculater {
	public static void main(String[] args) {
	
		System.out.println("press temp= 1(addition) , 2(substraction) , 3(Multiplication) , 4(Dividion)");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number first");
		 double x = sc.nextDouble();
		 
		 System.out.println("Enter the no second");
		 double y = sc.nextDouble();
		 
		 System.out.println("press temp= : for desired operation");
		 int temp = sc.nextInt();
		 
		 if(temp==1) {
			 
			 double z1 = x+y;
			 System.out.println("Addition of x+y = " + z1);
		 }
		 
		 else if(temp==2) {
			 
			 double z2 = x-y;
			 System.out.println("Substraction of x-y = " + z2);
			
			 
		 }
		 
		 else if(temp==3) {
			 
			 double z3 = x*y;
			 System.out.println("Multiplication of x*y = " + z3);
		 }
		 
		 else if(temp==4) {
			 
			 double z4 = x/y;
			 System.out.println("Division of x/y = " + z4);
		 }
		 
		 else {
			 
			 System.out.println("Wrong operational Command");
		 }
		 
		
	}

}
