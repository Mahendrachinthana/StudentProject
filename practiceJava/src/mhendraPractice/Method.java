package mhendraPractice;

public class Method {
	static void mahi1() {
		System.out.println(" static hello");
		
		
	}
	void m1() {
		System.out.println(" instance m1 hello");

		
	}
	void m2() {
		System.out.println(" instance m2 hello");
		mahi1();
		m1();

		
	}

	public static void main(String[] args) {
		mahi1();
		Method c=new Method();
		c.m2();

	}

}
