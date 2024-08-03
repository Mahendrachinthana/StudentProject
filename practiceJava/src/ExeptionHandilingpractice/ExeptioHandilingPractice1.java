package ExeptionHandilingpractice;

import java.util.Scanner;

public class ExeptioHandilingPractice1 {

	public static void main(String[] args) {
			Scanner sc=new Scanner (System.in);
			System.out.println("plz enter an number");
			try {
				int mahi =sc.nextInt();
					System.out.println("plse enter an number : ");
				int mahi1 =sc.nextInt();
					System.out.println("plese enter an domane number : ");
					
				
				int mahi2=mahi+mahi1;
				System.out.println("this is result : "+mahi2);	
			}catch(ArithmeticException e) {
				System.out.println("this is Arthematic Exeption");	
	}catch(Exception r) {
		System.out.println("this is exeption "+ r.getMessage());
	
		
	}finally {
		System.out.println("this is finally !!");
	}

}}
