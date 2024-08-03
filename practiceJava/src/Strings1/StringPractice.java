package Strings1;

import java.util.Scanner;

public class StringPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("plz enter an name ");
		String name1 = sc.nextLine();
		String[] praven = name1.split(" ");
		for (int i = 0; i < praven.length; i++) {
			int count = 0;
			for (int j = 0; j < praven.length; j++) {
				if (praven[i].equals(praven[j])) {
					count++;

				}

			}

			if (count > 1)
				System.out.println("yas maching name hear !! " + praven[i]);
		}
	}

}
