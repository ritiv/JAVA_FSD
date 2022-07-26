package runnableDemo;

public class CheckProcessor implements Runnable  {
	
	public void run() {
		
		String tname = Thread.currentThread().getName();		
		System.out.println(tname + "Check runable thread");
	}

}
