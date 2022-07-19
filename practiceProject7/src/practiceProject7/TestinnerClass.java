package practiceProject7;

public class TestinnerClass {
	
	private class inner3{
		int a = 9;
		int b = 89;
		int z= (a*b);
		
		public void m3() {
			System.out.println(z);
		}
	}
	
	public static void main(String[] args) {
		
		innerClass inn1 = new innerClass();
		
		innerClass.inner inn2 = inn1.new inner();
		inn2.m1();
		
		innerClass.inner2 inn3 = new innerClass.inner2();
		inn3.m2();
		
		TestinnerClass inn4 = new TestinnerClass(); 
		
		TestinnerClass.inner3 inn5 = inn4.new inner3();
		
		inn5.m3();
		
	}

}
