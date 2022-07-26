package runnableDemo;

public class Runnabletest {
	public static void main(String[] args) throws InterruptedException {
		
		String tname = Thread.currentThread().getName();
		
		System.out.println(tname + ": main method begin" );
		
		CheckProcessor cp = new CheckProcessor();
		
		Thread t = new Thread(cp);
		
		t.setName("cp");
		
		t.start();
		
		t.join();
		
		System.out.println(tname + "Main thread ended");
	}

}
