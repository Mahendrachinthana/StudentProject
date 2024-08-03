package mhendraPractice;

public class demo6arrays {

	public static void main(String[] args) {
		int []n= {30,40,50,60,70};
		{int temp;
			for (int i=0;i<n.length;i++) {
				for (int j=i+1;j<n.length;j++) {
					if (n[i]<n[j]) {
						temp=n[i];
						n[i]=n[j];
						n[j]=temp;
						
					}
				}
				System.out.println("this is valid number"+n[i]);	
				}
					
			}
		
	}}
	