package ThredsPractice;

class m1 extends Thread {
//	Thread obj2;
//
//	 m1(Thread obj2){
//		 this.obj2=obj2; 
//	 }

	

	public void run() {
		for (int i = 0;i<=100; i++) {
			System.out.println(" thread 1  !!" + i);
			 //{
				//System.out.println("this is end 1");
			

			try {
				
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
	}6

//}

class m2 extends Thread {
	Thread obj3 ;
	m2(Thread obj2){
		this.obj3=obj2;
	
	}
	public void run() {

		for (int i = 100; i < 200; i++) {
			System.out.println(" thread 2 !!" + i);
			if(i==101)
			try {
				obj3.join();
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

class m3 extends Thread {
	public void run() {
		for (int i = 200; i <300; i++) {
			System.out.println("thread 3" + i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}

public class Thread3 extends Thread {

	public static void main(String[] args) {
		//m1 obj1 = new m1(obj2);
		//m2 obj2 = new m2(obj2);
		//m1 obj1 = new m1();
		//m2 obj2 = new m2(obj3);
		m1 obj1 = new m1();

		m3 obj3 = new m3();
		m2 obj2 = new m2(obj3);
		//m2 obj2 = new m2();
		obj1.start();
		obj2.start();
		obj3.start();

	}
}
