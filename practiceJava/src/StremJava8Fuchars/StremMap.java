package StremJava8Fuchars;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StremMap {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<>();
		
		al.add("mahendra");
		al.add("lokesh");
		al.add("karimulla");
		al.add("penchal");
		al.add("sriram");
		al.add("naresh");
		al.add("malakondaial");
		al.add("madhan");
		List<String>al1=al.stream().filter(a->a.length()>8).distinct().collect(Collectors.toList());
		System.out.println(al);
		System.out.println(al1);

	}

}
