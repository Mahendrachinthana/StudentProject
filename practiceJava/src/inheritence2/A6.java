package inheritence2;

public class A6 {
	public static void main(String []args) {
		E6 obj=new E6();
		C6 obj1=new C6();
		
		//obj1.m();
		obj1.m7();
		obj.m3();
		obj1.m4();
		obj.m5();
		}	
		
	}


class A11{
	
}
class B6 extends A11{
	public void m7() {
		System.out.println("this methos class B6");
		
	}
}
class D6 extends A11{
	public void m3() {
		System.out.println("this method class c6");
		
	}
}
class C6 extends B6{
	public void m4() {
		System.out.println("this methos class D6");
		
	}
}
class E6 extends D6{
	public void m5() {
		System.out.println("this methos class E6");
		
	}
}