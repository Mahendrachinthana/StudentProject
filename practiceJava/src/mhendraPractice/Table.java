package mhendraPractice;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int i=1;
		for(;i<=10;i++) {
			int rem=n*i;
			System.out.println(n+"*"+i+"="+rem);
		}
	}

}


