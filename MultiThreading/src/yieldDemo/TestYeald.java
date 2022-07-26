package yieldDemo;

public class TestYeald {
	public static void main(String[] args) {
		
		SimpleLoop Sl1 = new SimpleLoop();
		
		Thread t1 = new Thread(Sl1);
		
		t1.setName("t1");
		
		t1.start();
		
		SimpleLoop Sl2 = new SimpleLoop();
		
		Thread t2 = new Thread(Sl1);
		
		t1.setName("t2");
		
		t1.start();
		
		String tname = Thread.currentThread().getName();
		
		for(int i=1;i<=10;i++) {
			
			System.out.println(tname + ":" +i);
		}
		
		
		
	}

}
