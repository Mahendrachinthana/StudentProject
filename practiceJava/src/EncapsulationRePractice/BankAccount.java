package EncapsulationRePractice;

public class BankAccount {
	
	private double cAcbalance;

	public BankAccount(double cAcbalance) {
		this.cAcbalance = cAcbalance;
	}
	public double getcAcbalance() {
		return cAcbalance;
	}
	public void deposit(double money) {
		if(money >0) {
			cAcbalance+=money;
			
		}
		
	}
	public boolean withdra(double money) {
		if (money >0 & money<= cAcbalance ) {
			
			 cAcbalance -=money;
			 return true;
			 
			 
		}else {
			return false;
		}
			
	
		
		
	}
}
