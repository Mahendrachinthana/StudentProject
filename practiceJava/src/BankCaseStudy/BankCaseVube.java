package BankCaseStudy;

import java.util.Scanner;

public class BankCaseVube {
	long AccountNUmber = 32244313565l;
	String name = "MAHENDRA CHINTHANABOINA";
	int balance = 50000;
	int pin = 222;
	int withdrawel;
	BankCaseVube(){
		
	}

	public void withdrawel(int a) {
		if (a> balance) {
		System.out.println("this is withdrawel");
		}else {
		balance -= a;
		System.out.println("After Avilabule balane " + balance);

	}

	public void deposit(int b) {
		System.out.println("this is banalne deposit !!");
		balance += b;
		System.out.println("After Deposit : " + balance);

	}

	public void reference() {
		System.out.println("this is Bank user account number : " + AccountNUmber);
		System.out.println("this is user name : " + name);
		System.out.println("this is user balance : " + balance);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true)
		System.out.println("plz enter an Account number");
		long number = sc.nextLong();
		System.out.println("enter an pasword number");
		int pasword = sc.nextInt();
		boolean m (true);
		//BankCaseVube obj = new BankCaseVube();
			

		if (number == obj.AccountNUmber && pasword == obj.pin) {

			obj.reference();
			obj.withdrawel(200);
			obj.deposit(300);
			obj.reference();

		}else {
			System.out.println("invalid user name are pasword");
		}

	}
}