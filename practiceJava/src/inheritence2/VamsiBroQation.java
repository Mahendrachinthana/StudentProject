package inheritence2;

public class VamsiBroQation {
	public static void main(String[] args) {
		E11 obj=new E11();
		obj.print();
		obj.print1();
		obj.print2();
		obj.print3();
		
		
	}

}
interface Man{
	public   void print();
		//System.out.println("this is imple mented");
	
		
	}
interface B11{
	public   void print1();
		
	
	
}
class  C11 implements Man,B11{

	@Override
	public void print1() {
		System.out.println("this is method1 unimple mente");
		
	}

	@Override
	public void print() {
		System.out.println("this is method 2 unimplement");
	}



}
class D11 extends C11 {
	public void print2() {
		System.out.println("this is print method2");
	}
}
class E11 extends D11{
	public void print3() {
		System.out.println("this is print method3");
	}
}
class F11 extends E11{
	public void print4() {
		System.out.println("this is  print method 4");
	}
}
	

