package Strings1;

import java.util.Scanner;

public class StringsNameCheching {

	public static void main(String[] args) {
				Scanner sc=new Scanner (System.in);
				System.out.println("ple enter an name");
				String name=sc.nextLine();
				String[] str=name.split("");
				for (int i=0;i<str.length;i++) {
					int count=0;
					for (int j=0;j<str.length;j++) {
						if( str[i].equals(str[j])) {
							count ++;
							
						}
						
					}
					if(count>1) 
						System.out.println("yas "+str[i]);
					}
				}
	}

