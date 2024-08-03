package ExseptionHandiling;

import java.util.Scanner;

public class ExseptionAdding {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter an number  : ");
		int mahi=sc.nextInt();
		System.out.print("this is second  number : ");
		int mahi2=sc.nextInt();
		try {
			System.out.print("try block : ");
			
		}catch( ArithmeticException i) {
			System.out.println("this is catck block");
			
		}
		System.out.println(mahi%mahi2);
		System.out.println("final result ");
		
		

	}

}
