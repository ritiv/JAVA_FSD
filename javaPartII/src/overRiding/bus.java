package overRiding;

public class bus extends vehicle{
	
	bus(){
		
		System.out.println("buss is the child class " + this);
	}
	
	String fule() {
		
		return "Desel";
	}

}
