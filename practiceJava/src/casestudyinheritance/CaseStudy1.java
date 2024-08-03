package casestudyinheritance;

public class CaseStudy1 {

	public static void main(String[] args) {
		F10 obj=new F10();
		obj.M1();
		obj.M2();
		obj.M5();
		obj.M6();
		D10 obj1=new D10();
		obj1.M3();
		obj1.M4();+

	}

}
class A10{
	public void M1() {
		System.out.println("this is methos 1");
		
	}
}
class B10 extends A10{
	public void  M2() {
		System.out.println("this is methos 2");
	}
} 
class C10 extends B10{
	public void M3() {
		System.out.println("this is method 3");
	}
}
class D10 extends C10{
	public void M4() {
		System.out.println("this is metho 4");
			
		}
	}
class E10 extends B10{
	public void M5 () {
		System.out.println("this is  methos 5");
		
	}
}
class F10 extends E10{
	public void M6() {
		System.out.println("this is method 6");
	}
}


