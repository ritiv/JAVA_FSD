package GarbaceC;

public class Employe {
	
	int employeId;
	
	public Employe(int id) {
		
		String tname = Thread.currentThread().getName();
		this.employeId = id;
		
		System.out.println(tname + ": Employee Created - " + this.employeId);
		
	}
	
	@Override
	protected void finalize() throws Throwable {
		String tname = Thread.currentThread().getName();
		System.out.println(tname + ": Employee Finalized - " + this.employeId);
		
	}

}
