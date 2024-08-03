package inheritance;

import java.util.Scanner;

public class Lone {
	public static void main (String []args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("plz enter an number");
		//System.out.println("plz enter lone ammount");
		int lone1=sc.nextInt();
		System.out.println("enter lone ammount");
		double lone2=sc.nextDouble();
		String ln=sc.nextLine();
		//System.out.println("plz enter vallue");
		 Lone obj=new  Lone();
		 obj.getlone2();
		 obj.getlone3();
		 if (lone1>750&&lone1<10000.0) {
			 System.out.println("congrats you got the lone ");
			 System.out.println("eligible lone ammount is "+obj.getlone3());
			 System.out.println("costomer adresh "+obj.getlone4()+"mahendra"+"/n"+"sankavaram");
			 
		
		 }else {
			 System.out.println("bad luk you not eligible for loned ");
		 }
		
		
		
	}
	int getlone2() {
		int m=1000;
		return m;
		
	}
	double getlone3() {
		double n=1000.0 ;
		return n;
		
		
	}
	String getlone4() {
		String name="mahendera ,n/ sankavaram,gundemadakala post vinjamur mandal , nellore district,"
				+ "pin code : 524226,";
		return name;
		
				
	}
	
	

}
