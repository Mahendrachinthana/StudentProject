package mhendraPractice;

public class Arraysdemo5 {

	public static void main(String[] args) {
		int sum=0;
		int [] [] m= {{4,6,78},{4,6,7},{5,7,9}};
		System.out.println(m.length);

		for (int i=0;i<m.length;i++) {
			for (int j=0;j<m.length;j++) {
				sum+=m[i][j];

			}
			
			//System.out.println(" "+sum);
		}
		
			System.out.println(sum);
	}

}
