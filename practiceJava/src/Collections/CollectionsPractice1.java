package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionsPractice1 {

	public static void main(String[] args) {
		Collection <String > man=new ArrayList<>();
		man.add("lokesh nettabaku");
		man.add("markesh is man");
		man.add("gengtile man");
		
		
			
			
		Collection <String>commonman=new ArrayList<>();
		commonman.add("lokesh nettabaku");
		commonman.add("lokesh");
		commonman.add("ram");
		System.out.println(commonman);
		if (commonman.contains(man)) {
			System.out.println("this is true");
		}else {
			System.out.println("this false");
		}
		
	}

}
