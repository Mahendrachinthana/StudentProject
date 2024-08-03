package mhendraPractice;

public class sortArray {

	public static void main(String[] args) {
			int []n= {1,2,3,4,5,6,7,8,9};
			for (int i=0;i<n.length;i++) {
				for (int j=i+1;j<n.length;j++) {
					if (n[i]>n[j]) {
						int temp;
						temp=n[i];
						n[i]=n[j];
						n[j]=temp;
						
					}
				}
				//System.out.println(n[i]);
		     
				
			}
			System.out.println(n[n.length-]);
			
	}

}
