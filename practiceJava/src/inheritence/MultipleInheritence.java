package inheritence;

public class MultipleInheritence {
	public static void main(String[] args)
	{
		M4 obj=new M4();
		obj.print();
		obj.hello();
				
	
	}
}
interface i
{
	public void print();
}

interface i2 {
	public void  hello();
}

class M4 implements i,i2{
	public void print()
	{
		System.out.println("This is print in interface 1");
	}
	public void hello()
	{
		System.out.println("This is the hello in interface 2");
	}
}
