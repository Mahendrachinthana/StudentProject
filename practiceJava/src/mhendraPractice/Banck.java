package mhendraPractice;

import java.util.Scanner;

public class Banck {

	public static void main(String[] args) {
		Banck obj=new Banck ();
		int n=obj.getbank1();
		double m=obj.getbank();
		//obj.getbank();
		//j1.getbank();
		if (n>700&&n<10000.0) {
			System.out.println("congrats you have eligebule for lone all the best");
			System.out.println(" "+obj.getbank());
			
			
			
		}else {
			System.out.println("sorry bad luck you not eligebule for lone");			
		}
			
			
		
	}
	String getadresh() {
		return getadresh() ;
		
	}
	 double getbank() {
		return 10000.0;
		
	}
	int getbank1() {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("plz enter an number");
	int n=sc.nextInt();
	int name=sc.nextInt();
	return n;
	
	
		
		
		
	}
	
	

}
