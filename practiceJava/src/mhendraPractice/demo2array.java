package mhendraPractice;

public class demo2array {

	public static void main(String[] args) {
		int temp;
		// TODO Auto-generated method stub
			int []m= {5,4,6,4,3,6,9,};
			for (int i=0;i<m.length;i++) {
				for (int j=i;j<m.length;j++) {
					if (m[i]<m[j]) {
						temp=m[i];
					
						m[i]=temp;
						
						
						
					}
				}
				System.out.print("this is numbers of arrays"+m[i]);
			}
				
			}

}
