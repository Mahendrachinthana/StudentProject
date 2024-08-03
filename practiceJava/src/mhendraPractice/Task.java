package mhendraPractice;

public class Task {
	
	static int n;
	static int m;
		
	Task(int n,int m ){
		this.n=n;
		this.m=m;
		
	}
	public static void m1() {
		System.out.println("Addition in static");
		
		System.out.println(n+m);
		
	}
	public void m2() {
		
		System.out.println("subpraction in Non-static");

		System.out.println(n-m);
		
	}

	public static void main(String []args) {
		Task a= new Task(10,10);
		m1();
		a.m2();
		
	
		
		
		
	}
}
