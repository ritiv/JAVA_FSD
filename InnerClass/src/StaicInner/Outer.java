package StaicInner;
public class Outer {
	
	static class Inner{
		
		static void f2() {
			
			System.out.println("nonststic Inner: outer.f2()");
		}
		
		public void f3() {
			
			System.out.println("ststic Inner: outer.f3()");
		}
	}
	
	static void f1() {
		
		System.out.println("ststic Metod: outer.f1()");
	}
	
	public static void main(String[] args) {
		
		Outer.f1();
		
		Outer.Inner inner = new Outer.Inner() ;
		inner.f3();
	}

}
