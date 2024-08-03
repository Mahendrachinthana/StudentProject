package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class CollectionsAddAll {

	public static void main(String[] args) {
		Collection<String> boys = new ArrayList<>();

		boys.add("mahendra");
		boys.add("Lokesh");
		boys.add("Manoj");
		boys.add("Suresh");
		boys.add("Madhav");
		boys.add("Ramu");
		System.out.println("this is only boys will be come  !! " + boys);
		Collection<String> garls = new ArrayList<>();
		garls.add("lakshmi");
		garls.add("maunika");
		garls.add("madhavi");
		garls.add("lakshmi");
		garls.add("priya");
		garls.add("supriya");
		System.out.println("this is only garls will be come  !! " + garls);
		boys.clear();
		Collection<Object> Student = new ArrayList<>();
		Student.addAll(boys);
		Student.addAll(garls);
		System.out.println("alredy clear data but i will check data just once" + boys);
		System.out.println("this is collection All method !! " + Student);
		
		

	}

}
