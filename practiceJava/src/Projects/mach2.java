package Projects;

import java.util.Scanner;

public class mach2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for (int i = 1; i>0; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					if (i > n && i < n)
						count++;

					if (count == 2) {
						if (i > n) {
							System.out.println(i);
							break;
						}

						
					}
				}
			}
		}
	}

}
