package interface1;

public class MacBook implements appleLaptop {
	
	public void start() { // if abstract class implements interface it has to be public for visiblity;
		
		System.out.println("Inside MacBok start");
	}
	
	public void shut() {
		
		System.out.println("Inside macBook shut");
	}

}
