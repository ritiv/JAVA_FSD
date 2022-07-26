package GarbaceC;

public class GC_Memorypush {
	
	public static void main(String[] args) {
		// cresting the object without any refrence;
		//new Employe(1);
		
		// for memory overloading;
		for(int i=1; i<=5000000;i++) {
			
			new Employe(i);
			
		}
		
		//creation of object with refrence;
		
		//Object Obj1 = new Employe(1);
		//Object Obj2 = new Employe(2);
		
		// for forcefully calling finalize for cleanup;
		//System.gc();
		
		
	}

}
