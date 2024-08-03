package inheritence;

public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C2 obj=new C2();
		obj.print();
		B2 o=new B2();
		o.show();
		o.print();
	}

}
 class A2
 {
	 public void print()
	 {
		 System.out.println("This is print in A2");
	 }
 }
 
 class B2 extends A2
 {
	 void show()
	 {
		 System.out.println("this is show method in B2");
	 }
 }
 
 class C2 extends A2
 {
	 
 }