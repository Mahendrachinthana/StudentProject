package ExeptionHandilingpractice;

import java.util.Scanner;

public class EncapsulationSample {

	public static void main(String[] args) {
		System.out.println("hello welcome to main main main method");
		System.out.println("hello hii ");
		System.out.println("good morning ");
		Scanner sc = new Scanner(System.in);
		System.out.println("plz enter an number : ");
		int a = sc.nextInt();
		System.out.println("plx enter an a value : ");
		int b =sc.nextInt();
		System.out.println("plese enter  an b value : ");
		try {
		System.out.println(b/a);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			
		}

	}

}
