package Collections;

import java.util.ArrayList;
import java.util.Collection;

class CollectionsRetainPractice {

	public static void main(String[] args) {
		Collection<String> villagenames = new ArrayList<>();
		villagenames.add("Sankavaram");
		villagenames.add("Gundemadakala");
		villagenames.add("venkatadripalem");
		villagenames.add("chavatapalli");
		Collection<String> mandalnames = new ArrayList<>();
		mandalnames.add("vinjamur");
		mandalnames.add("kaligiri");
		mandalnames.add("duthalur");
		mandalnames.add("sangam");
//		if(villagenames.retainAll(mandalnames)) {
//			System.out.println("yas this is data is found");
//		}else {
//			System.out.println("no thhis data not found");
//		}
		System.out.println("main stated result" + mandalnames);
		villagenames.retainAll(mandalnames);
		System.out.println("this is second collection Stated" + villagenames);
	}

}
