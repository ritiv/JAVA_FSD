package single;

public class SingleThreaded {
	
	public static void main(String[] args) {
		
		SingleThreaded th = new SingleThreaded();
		th.printNumber();
		
		for(int j=1;j<=200;j++) {
			
			System.out.println("j: " +j +"\t");
		}
		
		
	}
	
	


void printNumber() {
	for(int i=1;i<=200;i++) {
		
		System.out.println("i: " +i +"\t");
	}
}
}