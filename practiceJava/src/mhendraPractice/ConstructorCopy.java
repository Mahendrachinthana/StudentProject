package mhendraPractice;

public class ConstructorCopy<C2> {
	int id;
	String name;
	static int cid=1002;
	static String cname="vdc";
	ConstructorCopy(){
		System.out.println("Lokesh no arg");
	}
	ConstructorCopy(int id,String name){
		this.id=id;
		this.name=name;
	}
//	ConstructorCopy(ConstructorCopy p){
//		p.id=id;
//		p.name=name;
//		
//	}
//	
	
	

	 ConstructorCopy(ConstructorCopy c4) {
		id=c4.id;
		name=c4.name;
	}
	public static void main(String[] args) {
//		ConstructorCopy c=new ConstructorCopy();
//		System.out.println(c.id);
//		System.out.println(c.name);
//		System.out.println(cid);
//		System.out.println(cname);
//		ConstructorCopy c1=new ConstructorCopy(10,"Srikanth");
//		System.out.println(c1.id);
//		System.out.println(c1.name);
//		cid=9001;
//		cname="Raos";
//		System.out.println(cid );
//		System.out.println(cname);
		ConstructorCopy c2=new ConstructorCopy(11,"Ch Divya");
		System.out.println(c2.id);
		System.out.println(c2.name);
		//System.out.println(cid);
		//System.out.println(cname);
		ConstructorCopy c3=new ConstructorCopy(c2);
		System.out.println(c3.id);
		System.out.println(c3.name);
		
		
	}

}
