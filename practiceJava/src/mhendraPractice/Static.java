package mhendraPractice;

public class Static {
	//instance data
	
	int id;
	String name;
	
	//static data
	static int code=757;
	static String clgName="vdc";
	//static block
	static {
		System.out.println("Mahendra");
		
	}
	//instance block
	
	{
	System.out.println("Lokesh");	
		
	}

	public static void main(String[] args) {
		Static o=new Static();
		System.out.println(o.id);
		System.out.println(o.name);
		System.out.println(code);
		System.out.println(clgName);
		
		Static o1=new Static();
		o1.id=1;
		o1.name="mahi";
		System.out.println(o1.id);
		System.out.println(o1.name);
		System.out.println(code);
		System.out.println(clgName);
		
		Static o2=new Static();
		code=307;
		clgName="pragathi";
		System.out.println(o1.id);
		System.out.println(o1.name);
		System.out.println(code);
		System.out.println(clgName);
		
		


	}
}


//Static block instance block