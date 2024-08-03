package EncapsulationRePractice;

public class AccountMain {
	public static void main(String []args) {
		BankAccount obj=new BankAccount(500);
		obj.deposit(600);
		System.out.println("this is accout diposit !! " + obj.getcAcbalance());
	boolean man=	obj.withdra(500);
	System.out.println("this is  withdrawel !! " +obj.withdra(100));
	if(man) {
		System.out.println("this is sucsses withdrawel");
	}else {
		System.out.println("this not withdrawel becose insuffisiant balance !!");
	}man=	obj.withdra(500);
	System.out.println("this is  withdrawel !! " +obj.withdra(100));
	if(man) {
		System.out.println("this is sucsses withdrawel");
	}else {
		System.out.println("this not withdrawel becose insuffisiant balance !!");
	}
	
		
	}

}
