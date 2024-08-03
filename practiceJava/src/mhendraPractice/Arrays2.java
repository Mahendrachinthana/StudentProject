package mhendraPractice;

public class Arrays2 {

	public static void main(String[] args) {
		int [] num= {4,7,92,45,64};
		// TODO Auto-generated method stub
		int temp;
		for (int i=0;i<num.length;i++) {
			
			for (int j=i;j<num.length;j++) {
				if (num[i]<num[j]) {
					temp=num[i];
					num[i]=num[j];
					num[i]=temp;
				}
					
				}
				System.out.println("this numbers "+num[i]);
				
			}
		}

	}


