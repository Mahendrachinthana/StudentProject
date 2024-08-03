package ThredsPractice;

class TreadFirst1 {
	int num = 0;
	boolean status  = false;

	public synchronized void put(int i) throws InterruptedException {
		while (status ) {
			wait();
		}
		this.num = i;
		System.out.println("this is put" + num);
		status  = true;
		notify();

	}

	public synchronized void get() throws InterruptedException {
		while (!status) {
			wait();

		}
		System.out.println("this is get" + num);
		status = false;
		notify();
	}

}

class produser1 implements Runnable{
	TreadFirst1 q1;
	public produser1(TreadFirst1 t1) {
		this.q1 = t1;
		Thread t = new Thread(this, "produser");
		t.start();

	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			try {
				q1.put(i++);
				Thread.sleep(400);

			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		}

	}

}
class consume implements Runnable{
	TreadFirst1 q1;

	public consume(TreadFirst1 t1) {
		this.q1 =t1;
		Thread t=new Thread(this,"consume");
			t.start();
		
	}

	@Override
	public void run() {
		while(true) {
			try {
				q1.get();
				Thread.sleep(400);
				
			}catch(InterruptedException e){
				e.printStackTrace();
				
			}
		}
			
	}
	
}

public class ThreadsSyncronaigesionConsumerAndProdujer {

	public static void main(String[] args) {
		TreadFirst1 t1=new TreadFirst1 ();
		produser1 p1 =new produser1(t1);
		consume  c1=new consume(t1);
		

	}

}
