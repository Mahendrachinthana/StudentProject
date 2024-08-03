package mhendraPractice;

public class AssendingArray {

	public static void main(String[] args) {
		int temp;
		int []n= {8,7,9,10,11,12,13};
		for (int i=0;i<n.length;i++) {
			for (int j=i+1;j<n.length;j++) {
				if (n[i]<n[j]) {
					temp=n[i];
					n[i]=n[j];
					n[j]=temp;
					
					
				}
				//System.out.println("this assending : "+n[i]);
			}
		}
			
			//System.out.println("this is assending : "+n[i]);
			for (int a=0;a<n.length/2;a++) 
				System.out.println(" "+n[a]);
				for (int b=n.length-1;b>=n.length/2;b--) 
					System.out.println("this is second Assending :" +n[b]);
					
					
				
			
			//System.out.println("this is second Assending :" +n[a]);
		
		
		
	}
			
}
