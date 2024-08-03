package Collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionsEqalPRactice {

	public static void main(String[] args) {
		Collection<String>animals=new ArrayList<>();
		animals.add("dog");
		animals.add("got");
		animals.add("monky");
		animals.add("cat");
		animals.add("donky");
//	Collection<String>birds=new ArrayList<>();
//		birds.add("hen");
//		birds.add("pecok");
//		birds.add("pichuka");
//		birds.add("konga");
//		birds.add("kaki");
		Object[] m=animals.toArray();
		for (Object a:m) {
			System.out.println(a);
		}
			Collection<String>birds=new ArrayList<>();
			birds.add("hggh");
			birds.add("got");
			birds.add("monky");
			birds.add("cat");
			birds.add("donky");
		//	System.out.println("");
			if (animals.equals(birds)) {
				System.out.println("yas it is same data you dont worry !!");
				
			}else{
				System.out.println("huss this data not same  brother bad luck !! ");
				
			}
			
		}
	}


