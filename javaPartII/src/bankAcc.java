
public class bankAcc {
	int bankAccNo;
	private int accBalance;
	static String bankName = "SBI";
	static double INR = 5.4;
	
	public void widdrawl(int ammount) {
		System.out.println("Balance after widdraw: " + (this.accBalance -= ammount));
	}
	
	public void deposit(int ammount) {
		System.out.println("Balance after deposit: " + (this.accBalance += ammount));
	}
	
	public void accDetails() {
		System.out.println("Welcome to bank: " + this.bankAccNo);
		System.out.println("Bank balance: " + this.accBalance);
		System.out.println("Bank name: " + bankAcc.bankName);
		System.out.println("The intrest rate: " + bankAcc.INR);
		
	}

}
