package AnonemusClass;

public class TestConnection {
	public static void main(String[] args) {
		
		Iconnection con = new Iconnection() {

			@Override
			public void connect(String ConnectionDetails) {
				
				System.out.println("successfuly estiblished connection to the surver - " + ConnectionDetails);
				
			}
			
			
		};
		
		con.connect("Production Server");
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Anonymous worker in a separate thread");
				
			}
			
			
		});
		t1.start();
	}

}
