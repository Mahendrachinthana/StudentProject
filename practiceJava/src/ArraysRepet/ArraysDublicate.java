package ArraysRepet;

public class ArraysDublicate {

	public static void main(String[] args) {
			int  n [] = {6,8,9,6,5,9,2};
			for (int i=0;i<n.length; i++) {
				int count=0;

				for(int j=i;j<n.length;j++) {
					if(n[i]==n[j]) {
						count++;
					}
				}
						if(count==1) {
							System.out.println(n[i]); 
							
							
						}
						
						
					}
				}
					
			}
		
			
	


