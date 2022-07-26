package localInner;

public class Outer {
	
	void f1() {
		
		System.out.println("Inside Outer.f1() method");
		
		class LocalInner {
			
			void f2() {
				
				System.out.println("Inside inner.f2() method");
			}
		}
			LocalInner linn = new LocalInner();
			linn.f2();
			
		
	}

}
