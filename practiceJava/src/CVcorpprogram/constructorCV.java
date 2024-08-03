package CVcorpprogram;

public class constructorCV {
	
	 public  int number;

	constructorCV(int number) {
		 this.number=number;
		
	}
	public int getmethod(int a) {
		return a;
		
	}
	public static void main (String []args) {
		constructorCV  obj =new constructorCV(1000);
		
		Main obj1 =new Main();
		obj1.m2();
		Main.m3();
		Main.m4();
		
		
	}
}
public interface interface3{
	public void m2() ;
		
	public static  void m3() {
		System.out.println("this is static method");
		
		
		
	}
	static void m4() {
		System.out.println("this is second static method");
	}
}


		class Main implements interface3{

			@Override
			public void m2() {
				System.out.println("this is un implement");
			}
			public static  void m3() {
				System.out.println("this is static method");
				
				
				
			}
			static void m4() {
				System.out.println("this is second static method");
			}
			
		}
