package syncdemo;

public class Test {
	public static void main(String[] args) {
		
		String tname = Thread.currentThread().getName();
		
		System.out.println(tname + "main thread begain");
		
		DisplayMessage dm = new DisplayMessage();
		
		Thread t1 =new Thread(new Worker(dm , "Steve"));
		t1.setName("t1");
		
		
	}
}
