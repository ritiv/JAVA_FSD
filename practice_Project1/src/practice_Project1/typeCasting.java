package practice_Project1;

public class typeCasting {
	
	
	public static void main(String[] args) {
		
		char x = 'R';
		
		System.out.println("Implicit TypeCasting");
		int a = x;
		
		float b = x;
		
		long c = x;
		
		double e = x;
		
		System.out.println(a + " " + b + " " + c + " " +e);
		
		System.out.println("Explicit Type casting");
		
		float y = 78.7f;
		
		int z = (int) y;
		
		System.out.println(z);
		
		
	}

}
