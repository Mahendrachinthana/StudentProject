package inheritence;

public class SingleInheritence {
	public static void main(String[] args)
	{
		B obj=new B();
		obj.methodOfA();
		obj.show();
		obj.methodOfB();
		
	}
}
class A
{
	void methodOfA()
	{
		System.out.println("This is method of A");
	}
	void show()
	{
		System.out.println("This is parent");
	}
}

class B extends A{
	void methodOfB()
	{
		System.out.println("This is method of B");
	}
	void show()
	{
		System.out.println("This is child");
	}
}
