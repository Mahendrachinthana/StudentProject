package mhendraPractice;

public class TestDemo1 {
	TestDemo1(){
		System.out.println("hello contructor");
	}
	int id;
	String name;
	//static String CollegeName;
	public static void main(String[] args) {
		System.out.println("hello main method constructor");
		//TestDemo1 obj =new TestDemo1();
		TestDemo1 obj2=new TestDemo1();
		obj2.id=755;
		obj2.name="mahendra";
		System.out.println(obj2.id+"\n"+obj2.name);
		//System.out.println(obj2.name);
		
		
		
		// TODO Auto-generated method stub

	}

}
