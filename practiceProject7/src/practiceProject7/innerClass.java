package practiceProject7;

public class innerClass {
	
	private String x;
	
	public static String y;
	
	class inner {
		
		public void m1() {
			
			String x = "welcome to inner class";
			
			System.out.println(x);
		}
		
	}
	
	static class inner2{
		
		public void m2() {
			
			String y = "welcome to inner class 2";
			System.out.println(y);
		}
		
		
	}
	
	innerClass(){
		System.out.println("Implimentation of the inner class");
	}

}
