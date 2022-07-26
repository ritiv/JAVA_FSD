package fullAbstraction;

public class Honda implements car{
	
	final int numweals = 4;//know we can't change the variable;
	
	public void go() {
		
		System.out.println("lets go");
	}
	
	public void stop() {
		
		System.out.println(" please stop");
	}

}
