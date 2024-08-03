package CVcorpprogram;

public class CVconstructor {
	public int numbers1;

	CVconstructor(int numbers1){
		this.numbers1=numbers1;
		System.out.println("this is costructor "+numbers1);
	}
		 public int m2(int a) {
			 return a;
			
		}
		 public static void main(String []args) {
			 CVconstructor obj =new CVconstructor(1000);
			 Main2 ob1=new Main2 ();
			 ob1.method11();
			 
			 Main2.method();
			 Main2.method2();
			 
			 
		 }
		
	}
	interface implements4{
		public  void method11();
		public static void method() {
			//System.out.println("this is method in interface");
			
		}
		public static void method2() {
			//System.out.println("this is inteface method 2");
			
		}
			
			
		
	}
	class Main2 implements implements4{

		@Override
		public void method11() {
			System.out.println("this is unimplements methos");
		}
		public static void method() {
			System.out.println("this is method in interface");
			
		}
		public static void method2() {
			System.out.println("this is inteface method 2");
			
		}
	}
	


