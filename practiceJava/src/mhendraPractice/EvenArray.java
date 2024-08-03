package mhendraPractice;

public class EvenArray {

	public static void main(String[] args) {
		int []n= {2,9,10,6,8,12};
		int  esum =0;
		int osum=0;
		int evencount =0;
		int oddcount=0;
		for (int i=0;i<n.length;i++) {
			
			if (n[i]%2==0) {
				
				evencount++;
				esum+=n[i];
				
			}else {
				
					oddcount++;
				osum+=n[i];
				
			}
		}
			System.out.println("this is even number :"+evencount);
			System.out.println("this is odd count : "+oddcount);
			System.out.println("this is  even number count : "+esum);
			System.out.println("this odd sum number : "+osum);
		}
	//System.out.println(""+evencount);
	}

	//System.out.println("this is even number :"+n[i]);

