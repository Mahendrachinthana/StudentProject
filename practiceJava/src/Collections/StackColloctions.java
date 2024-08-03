package Collections;

import java.util.Stack;

public class StackColloctions {

	public static void main(String[] args) {
			Stack <Integer> obj =new Stack<>();
			obj.push(45);
			obj.push(10);
			obj.push(54);
			obj.push(58);
			obj.push(89);
			obj.push(96);
			obj.push(null);
			  if (!obj.isEmpty()) {
			System.out.println("this is element"+obj.peek());
			  }else{
				  System.out.println("Stack in element ");
				  
			  }
			
	}
	

}
