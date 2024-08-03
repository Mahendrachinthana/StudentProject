package mhendraPractice;

public class demo3arrays {

	public static void main(String[] args) {
		int [] m= {4,5,6,7,8};
		int max=m[0];
			for (int i=0;i<m.length;i++) {
				if (max>m[i]) {
					max=m[i];
				}
				
			}
					System.out.println("this is array max number "+max);
	}

}