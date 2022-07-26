package AnonemusClass;

public class MyConnection implements Iconnection {

	@Override
	public void connect(String ConnectionDetails) {
		System.out.println("successfuly estiblished connection to the surver - " + ConnectionDetails);
		
	}

}
