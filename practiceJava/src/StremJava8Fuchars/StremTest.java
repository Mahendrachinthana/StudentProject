package StremJava8Fuchars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StremTest {

	

	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		al.add("mahendra");
		al.add("lokesh");

		al.add("suman");

		al.add("karthik");

		al.add("karim");
		al.add("mananna");

		al.add("raja");

		al.add("siva");

		al.add("sampath");
		al.add("malakondaiah");
		al.add("penchalreddy");
		al.add("mai");
		
	List<String>all=	al.stream().filter(a->a.length()>5).collect(Collectors.toList());
	System.out.println("compar"+al);
		System.out.println(all);

	}

}
