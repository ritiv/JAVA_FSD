package GarbaceC;

public class GarbageDemo {
	
	private void mian() {
		
		Object obj1 = new GarbageDemo();
		Object obj2 = new GarbageDemo();
		
		obj1 = null;
		obj2 = null;
		

	}
	
	GarbageDemo(){
		
		System.out.println(this + "ceated.....");
	}
	
	protected void finalize() throws Throwable {
		
		System.out.println(this + "finalized.....");
	}

}
