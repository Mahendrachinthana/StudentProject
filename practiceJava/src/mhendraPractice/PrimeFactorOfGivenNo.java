package mhendraPractice;

import java.util.Scanner;

public class PrimeFactorOfGivenNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int c=0;
			int rem=n%i;
			if(rem==0)
				//System.out.println(i);
			for(int j=1;j<i;j++) {
				int r=i%j;
				if(r==0)
					c++;
			}
				if(c==1)
					System.out.println(i);
			
			
		}
	}

}
