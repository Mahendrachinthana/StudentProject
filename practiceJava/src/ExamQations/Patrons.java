package ExamQations;

public class Patrons {
	public static void main (String []args) {
		int rows=5;
	printPascalTriangle(rows);
	}

	public static void printPascalTriangle(int rows) {
			int [][] triangle =new int [rows][rows];
			for (int i=0;i<rows; i++) {
				for (int j=0;j<=i;j++) {
					if(j ==0||j==i) {
						triangle[i][j]=1;
						
					}else {
						triangle[i][j]=triangle[i-1][j-1] + triangle[i-i][j];
					}
					System.out.println(triangle[i][j]+ " ");
				}
				System.out.println();
			}
	}

}
