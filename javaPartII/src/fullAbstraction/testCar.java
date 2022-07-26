package fullAbstraction;

public class testCar {
	public static void main(String[] args) {
		
		car c1 = new Honda();//or we can just change Honda() to Toyota and rest all will be same
		c1.go();
		c1.stop();
		
		car c2 = new Toyota();
		c2.go();
		c2.stop();
		
				
	}

}
