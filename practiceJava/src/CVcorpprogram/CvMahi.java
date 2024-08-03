package CVcorpprogram;

 public abstract class CvMahi {
	public  int mahi2;

	CvMahi(int mahi2){
		
		this.mahi2=mahi2;
		
	}
	
	abstract void method3(int mahi3) ;
	public static int method4(int mahi4) {
		System.out.println("this is method 4");
		return mahi4;
		
	}
		
}
 interface interface2 {
	 public static int method5(int mahi5) {
		 System.out.println("this is method 5");
		 
		return mahi5;
		 
	 }
	 abstract int method6(int mahi6);
	 
	 
 }
