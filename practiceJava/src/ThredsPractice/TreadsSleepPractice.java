package ThredsPractice;

class t1 extends Thread {
	Thread t3;
	t1(Thread t){
		this.t3=t;
		
	}


	public void run() {
		System.out.println("t1 thread started");

		for (int i = 0; i < 50; i++) {

			System.out.println("t1 thread" + i);
			if (i==1) {
				try {
					t3.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
			
			 
				System.out.println("this is thread 2");
	}
			

		}




class t2 extends Thread {

	public void run() {
		
		System.out.println("t1 thread Started");
		for (int i = 50; i <=100 ; i++) {
			System.out.println("t2 Thread" + i);
				try {
					
					
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}

class t3 extends Thread {
	public void run() {
		System.out.println("t3 started");
		for (int i = 100; i <150; i++) {
			System.out.println("t3 thread " + i);
//			if (i==20) {
//				
//			}
//			try {
//				t2 t2 = new t2();
//				t2.join();
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}

	}
}

public class TreadsSleepPractice extends Thread {

	public static void main(String[] args) {

		//t1 t1 = new t1(t1);
		//t2 t2 = new t2();
		t3 t3 =new t3();
		t2 t2 = new t2();
		t1 t1 = new t1(t3);
		
		t1.start();
		t2.start();
		t3.start();
		

	}

}
