package ThredsPractice;

public class mythred extends Thread {
	public static void main(String []args) {
		System.out.println("hello main method !!");
		mythred obj=new mythred();
		obj.start();
		for(int i =0;i<100;i++) {
			System.out.println("this is hello method!!"+i);
		}
	}
		
			public void run() {
				System.out.println("run method statrd");
			for(int i=0; i<200;i++) {
			System.out.println("this is second method calling"+i); 
			
				
			}
				
				
			}
			
			
		
	}

