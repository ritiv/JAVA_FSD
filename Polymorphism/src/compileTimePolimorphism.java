
public class compileTimePolimorphism {
	
	public static void main(String[] args) {
		
		compileTimePolimorphism obj = new compileTimePolimorphism();
		obj.add(7, 9);
		obj.add(9, 6);
		obj.add(9, 7, 5);
		
		
		
	}
	
	void add(int x , int y) {
		
		int result = x * y;
		System.out.println("Result = " + result);
	}
	
	void add(float x , float y) {
		
		float result = x * y;
		System.out.println("Result = " + result);
		
	}
	
	void add(int x , int y , int z) {
		
		int result = x * y * z;
		System.out.println("Result = " + result);
	}

}
