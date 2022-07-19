package practice_Project4;

public class inherit_mathod {
	public static void main(String[] args) {
		
		Method2 ope = new Method2();
		ope.method1(8, 7, 9);
		
		double rectangle = ope.method2(5, 9);
		System.out.println("area of reactangle " +rectangle);
		
	}

}
