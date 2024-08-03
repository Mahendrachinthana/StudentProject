package mhendraPractice;

public class constructor2 {

	constructor2 (int a ,String b){
		System.out.println(a);
		System.out.println("hello");
	}
	constructor2(String name ){
		System.out.println("this is the hero name");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructor2 obj =new constructor2("name");
		constructor2 obj1 =new constructor2("b");
		

	}

}
