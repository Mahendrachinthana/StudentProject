package mhendraPractice;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer");
		//int n=sc.nextInt();
		for(int i=0;i<=6;i++) {
			for(int j=0;j<=6-1;j+=2) {
				System.out.print(" ");
			if(j==i)
			System.out.print("*");
			}
			System.out.println();
			//Sc.close();
		}
	}

}
