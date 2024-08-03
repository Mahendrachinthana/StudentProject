package mhendraPractice;

public class Arrayslorgenumber {

	public static void main(String[] args) {
		int temp;
		int []n= {54,76,45,97,38};
		for (int i=0;i<n.length;i++) {
			for (int j=i+1;j<n.length;j++) {
				if (n[i]>n[j]) {
					temp=n[i];
					n[i]=n[j];
					n[j]=temp;
					
					
				}
			}
			//System.out.println("this is increeging order number : "+n[i]);
		}
		int i = 0;
		// TODO Auto-generated method stub
		System.out.println("this is increeging order number : "+n[i]);

	}

}
