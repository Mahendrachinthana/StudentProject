package mhendraPractice;

public class patrons {
			public static void main( String []args) {
				for (int a=1;a<=5;a++) {
					for (int b=1;b<=a;b++) {
						System.out.print("a");
					}
					System.out.println();
				}
				for (int i=1;i<=5;i++) {
					for (int j=i;j<=5;j++) {
						System.out.print(" ");
					}
					for (int k=1;k<=i;k++) {
						System.out.print("a");
					}
					System.out.println();
				}
			}
}
