package mhendraPractice;

public class CaseStudyArray {

	public static void main(String[] args) {
		int sum=0;
		double  [][]n= {{1.5,2.5,3.5,4.5,4.5,5.5},{2.3,4.5,6.5},{5.6,5.4,6.3,7.8}};
		for (int  i=0;i<n.length;i++) {
			for (int j=0;j<n[i].length;j++) {
				sum+=n[i][j];
				
			}
			//System.out.println(sum);
			
		}
		
		System.out.println(sum);	
				
		
	}

}
