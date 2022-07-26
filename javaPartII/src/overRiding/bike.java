package overRiding;

public class bike extends vehicle {
	
	bike(){
		
		System.out.println("bike is a child class" + this);
	}
	
	String fule() {
		
		return "petrol";
	}

}
