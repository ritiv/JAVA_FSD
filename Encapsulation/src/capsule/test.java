package capsule;

public class test {
	public static void main(String[] args) {
		
		// getter and setter method;
		
		bankAcc acc = new bankAcc(10000);
		
		acc.deposit(8400);
		
		acc.widdrawl(9800);
		
		acc.setAccountName("Ritiv");
		
		acc.setAccountNumber(786549);
		
		acc.printDetails();
		
		
		
		Product pd = new Product(01 , "Sampu" , 750);
		
		System.out.println("Product id: " + pd.getId() + "\nProduct name: " + pd.getName() + "\nProduct Cost: " + pd.getCost());
		
		
		
	}

}
