package mhendraPractice;

import java.util.Scanner;
public class Arraysum {

	public static void main(String[] args) {
		int sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row size ");
		int r=sc.nextInt();
		System.out.println("Enter Columnsige ");
		int c=sc.nextInt();
		
		int [][]n=new int[r][c];
		for (int i=0;i<r;i++) {
			for (int j=0;j<c;j++) {
			n[i][j]=sc.nextInt();
			}
		}
		
			for (int a=0;a<r;a++) {
				for (int b=0;b<c;b++) {
					sum+=n[a][b];
					
					
				}
			}
			System.out.println(sum);
	}

}
