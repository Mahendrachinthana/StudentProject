package ThredsPractice;

public class MyThredSleep extends Thread {

	public static void main(String[] args) throws InterruptedException {
		MyThredSleep obj=new MyThredSleep();
		obj.start();
		
		
		for (int i = 0; i < 100; i++) {
			System.out.println("hello main method"+i);
			

		}
	}	
	

	public void hello() throws InterruptedException {
		for (int i = 0; i <= 100; i++) {
			System.out.println("this is hello method"+i);
				Thread.sleep(500);
				
					
				}
		}
	}

