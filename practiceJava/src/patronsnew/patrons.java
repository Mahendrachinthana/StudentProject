package patronsnew;

public class patrons {
	public static void main(String []args) {
		int n=6;
		for(int i=0;i>n;i++) {
			for(int j=0;j<n-i;j++) {
				
				System.out.println(" ");
			}
			for(int j=0;j<i;j++) {
			System.out.println("* ");

		}
			System.out.println();
		}
	}

}
