package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class ColloctionsArrayList {

	public static void main(String[] args) {
		 
		 Collection<String>objboys=new ArrayList<>();

		 objboys.add("mahendra");
		 objboys.add("lokesh");
		 objboys.add("Malyadri");
		 objboys.add("Madhan");
		 objboys.add("kondaih");
		 objboys.add("Malakondaiah");
		// System.out.println("this is boys names only :: "+objboys);
		 Collection<String>girls=new ArrayList<>();
		Scanner sc =new Scanner (System.in);
		 
		System.out.println("plz enter name  !!");
		String name=sc.next();
		//System.out.println("this is "); 
		
		 if(objboys.contains(name) ) {
			 System.out.println("valid data");

			 
		 }else {
			 
			 System.out.println("in valid data");
		 }}}
//		 girls.add("Raqmya");
//		 girls.add("Madhuri");
//		 girls.add("navya");
//		 girls.add("supriya");
//		 System.out.println("this is only for girls names ::"+girls);
//		 Collection<Integer>girlsage=new ArrayList<>();
//		 girlsage.add(24);
//		 girlsage.add(22);
//		 girlsage.add(21);
//		 girlsage.add(23);
////		 girlsage.add(26);
////		 girlsage.add(24);
//		 System.out.println("this is only for girls age :: "+girls);
//		 
		 
//		 
//		 
//
//		 
//		 

		 
		 
		 
		 
		 

	

