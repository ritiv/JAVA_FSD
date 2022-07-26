package staticcontext;


public class Stattic_Context {
	
	static int var1 = 29;
	
	static void method1() {
		System.out.println(Stattic_Context.var1);
	}
	
	static {
		System.out.println("not getting it");
	}
	

	public static void main(String[] args) {
		
		Stattic_Context.method1();
		

	}

}
