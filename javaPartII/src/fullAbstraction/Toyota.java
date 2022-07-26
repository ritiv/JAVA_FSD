package fullAbstraction;

public class Toyota implements car {

	@Override
	public void go() {
		System.out.println("lets move toyota");
		
	}

	@Override
	public void stop() {
		System.out.println("lets stop toyota");
	}

}
