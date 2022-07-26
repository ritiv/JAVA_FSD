package interface1;

public class RunTimeTest {
	
	public static void main(String[] args) {
		
		// upcasting(object casting); its implicit;
		appleLaptop al = new MacBookAir();
		al.start();
		al.shut();
		// to create the obj of interface we need concreate class;
		appleLaptop al1 = new MacBookPro();
		al1.start();
		al1.shut();
		
		// downcasting its explicit;
		
		MacBook air = new MacBookAir(); 
		
		MacBookAir obj = (MacBookAir) air;
		
		MacBook pro = new MacBookPro();
		
		MacBookPro obj1 = (MacBookPro) pro; 
		
		obj1.proMethod();
	}

}
