package mahi;

import java.util.Scanner;

public class SumOfTwoDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter an number");
		int b = sc.nextInt();
		int a1 = 0;
		int a2 = 0;
		int sum = 0;
		int count = 0;
		while (b != 0) {

			int n;
			n = b % 10;

			b = b / 10;

			if (count == 2) {
				a1 = n;

			} else if (count == 1) {
				a2 = n;
				break;
				

			}
			b=b/10;
			count ++;
			

		}
		int m=a1-a2;
		System.out.println(m);

	}

}
