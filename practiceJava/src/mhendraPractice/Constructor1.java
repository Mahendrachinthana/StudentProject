package mhendraPractice;

public class Constructor1 {
//	int a;
//	String s;
//	Constructor1(){
//		System.out.println("Hello no arg constructor ");
//	}
//	Constructor1(int a){
//		this.a=a;
//	}
//	Constructor1(int a,String s){
//		this.a=a;
//		this.s=s;
//		
//	}
//	public static void main(String args[]) {
//		Constructor1 a=new Constructor1();
//		Constructor1 a1=new Constructor1(100);
//		System.out.println(a1.a);
//		Constructor1 a2=new Constructor1(1000,"Mahi");
//		System.out.println(a2.a);
//		System.out.println(a2.s);
//
//	}
//}
	 
		int n;//10012
		String name;
		Constructor1(){
			System.out.println("this is constructor no arg");
			
		}
		Constructor1(int n ){//n=10012
			this("Lakshmi",10);
			this.n=n;
			//System.out.println("this is second constructor one arg"+n);
			
		}
		Constructor1(String name,int n){//name=Lakshmi n=10
			this();//this is constructor no arg

			System.out.println(n);//n=10
			
			System.out.println(name);//name=lakshmi
			
			//System.out.println(name);
		}
		

		public static void main(String[] args) {
			//Constructor1 m=new Constructor1();
			Constructor1 m1=new Constructor1(10012);
			System.out.println(m1.n);
			//Constructor1 m2=new Constructor1("Lakshmi",10);
			
			
		}
		
}
	


