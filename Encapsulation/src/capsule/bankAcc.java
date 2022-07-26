package capsule;

public class bankAcc {
	
	
	private String accName;
	
	private int accNo;
	
	private int balanceTotal;
	
	bankAcc(int balance){
		
		this.balanceTotal = balance;
		
		System.out.println("Total Balance in account: " + balanceTotal);
	}
	
	public void deposit(int ammount) {
		
		balanceTotal += ammount;
		
		System.out.println("balance after deposit: " + balanceTotal);
	}
	
	public void widdrawl(int ammount) {
		
		balanceTotal -= ammount;
		
		System.out.println("Balance after widdrawl: " + balanceTotal);
	}
	
	public void setAccountName(String name) {
		
		this.accName = name;
		
	}
	
	public void setAccountNumber(int num) {
		if(num<0) {
			System.out.println("invalid acc no");
		}
		
		else
		{
		
			this.accNo = num;
		}
		
	}
	
	void printDetails() {
		
		System.out.println("Account holder name: " + accName + "Account Number: " + accNo + "Total Balance in account: " + balanceTotal);
	}
	
	
	
	

}
