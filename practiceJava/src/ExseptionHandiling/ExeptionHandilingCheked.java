package ExseptionHandiling;

import java.io.FileReader;

public class ExeptionHandilingCheked  {
	public static void main(String []args) throws Exception{
		try {
				FileReader fr = new FileReader("C:\\Intel//manexeption.txt");
			int n= fr.read();
			while(n !=-1) {
				System.out.print((char)n);
				Thread.sleep(100);
				n=fr.read();
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
				
			
			
			
		
		System.out.println("hello good morning");
		
	}
}
	

	
	
	


