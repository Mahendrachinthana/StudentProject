package inheritance;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Bank obj=new Bank();
			Scanner sc=new Scanner(System.in);
			System.out.println("enter number");
			int n=sc.nextInt();
			int n1=obj.getBank();
			if (n1<700) {
				//System.out.println(" "+n.getBank);
				System.out.println("congrats you elegible for lone ");
				//System.out.println(" "+n1.getBank);
				
			}else {
				System.out.println("bad luk you not eligeble for lone");
			}
			
			
			
		
		
				
	
		
			
		
			
	}
	int getBank() {
		return 750;
		
	}
	 double getBankscore() {
		return 1000.0;
		
	}

}
