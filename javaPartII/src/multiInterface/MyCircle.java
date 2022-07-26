package multiInterface;

public class MyCircle implements Circle , CircleTwo {

	@Override
	public void calculateArea(int radious) {
		
		System.out.println(CircleTwo.pi);
		
		
		
	}

	@Override
	public void calculateArea() {
		
		
		
	}
	
	
	
	

}
