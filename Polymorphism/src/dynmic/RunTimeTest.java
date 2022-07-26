package dynmic;

public class RunTimeTest {
	
	public static void main(String[] args) {
		
		
		MacBookPro pro = new MacBookPro();
		
		//operateMac(pro);
		
		MacBookAir Air = new MacBookAir();
		
		//operateMac(Air);
		
		//easy way to do upper part;
		
		MacBook obj = new MacBookPro();
		obj.start();
		obj.shut();
				
		(new RunTimeTest()).operateMac(Air);
		
				
	}
	
	 void operateMac(MacBook mac) {
		
		mac.start();
		mac.shut();
	}

}
