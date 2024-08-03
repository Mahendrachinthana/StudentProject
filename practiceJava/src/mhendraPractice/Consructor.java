package mhendraPractice;

public class Consructor {
	int a=5;
	int b;
	 
	Consructor(){
		System.out.println("a");
		
	}
	Consructor(int a){
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		Consructor m=new Consructor();
		Consructor m1=new Consructor(10);
		Consructor m2=new Consructor(10,16);
	}
	Consructor(int a,int b){
		System.out.println(a);
		System.out.println(b);
		
	}

}
