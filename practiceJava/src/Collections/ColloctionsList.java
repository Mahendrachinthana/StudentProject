package Collections;

import java.util.ArrayList;
import java.util.List;

public class ColloctionsList {

	public static void main(String[] args) {
		List<Object> obj = new ArrayList<>();

		obj.add("man");
		obj.add("mahendra");
		obj.add("lokesh");
		obj.add(0, "loky");
		System.out.println("this is name of order" + obj);
		List<Object> obj1 = new ArrayList<>();

		obj1.add("manohar");
		obj1.add("mahendra");
		obj1.add("lokesh");
		obj1.add( "loky");
		Clear(obj1);
		System.out.println("this second"+obj1);
	}
		public static void Clear(List<Object>obj1) {
		
		

	//private static void clear(List<Object> obj1) {
		// TODO Auto-generated method stub
		
	}

}
