package inheritence;

public class MultiLevel {
	public static void main(String[] args)
	{
		C1 obj=new C1();
		obj.printA();
		obj.printB();
		obj.printC();
	}
}
class A1
{
	void printA()
	{
		System.out.println("This is a method");
	}
}

class B1 extends A1
{
	void printB()
	{
		System.out.println("This is b method");
	}
}

class C1 extends B1
{
	void printC()
	{
		System.out.println("This is c method");
	}
}
