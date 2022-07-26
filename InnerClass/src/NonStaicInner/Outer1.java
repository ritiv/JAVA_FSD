package NonStaicInner;

public class Outer1 {
	private static int x = 50;
	private int y;
	
	Outer1(int y){
		this.y = y;
		System.out.println(y);
	}
	
	class Inner1 {
		private int y1;
		Inner1(int y1){
			this.y1 = y1;
		System.out.println(y1);
		}
		
		void f1() {
			System.out.println("Outer class x: " + Outer1.x);
			System.out.println("Outer class y: " + Outer1.this.y);
			System.out.println("Inner class y: " + this.y1);
				
		}
			
	}
	
	void f2() {
		
		System.out.println("Non ststic method: Outer class");
	}
	
	public static void main(String[] args) {
		
		Outer1 ott = new Outer1(76);
		ott.f2();
		
		Outer1.Inner1 inn = ott.new Inner1(86);
		inn.f1();
	}

}
