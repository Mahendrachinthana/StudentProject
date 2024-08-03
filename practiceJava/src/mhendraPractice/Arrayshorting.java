package mhendraPractice;

public class Arrayshorting {

	public static void main(String[] args) {
		int count;
		int []n= {2,4,8,5};
		for (int i=0;i<n.length;i++) {
			for (int j=i+1;j<n.length;j++) {
				count =n[i];
				n[i]=n[j];
				n[j]=count;
								
			}
			System.out.println(" "+n[i]);
		}
			System.out.println(""+n.length);
	}

}
