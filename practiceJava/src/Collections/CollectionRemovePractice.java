package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionRemovePractice {

	public static void main(String[] args) {
		Collection<String> Locations = new ArrayList<>();
		Locations.add("hydarabad");
		Locations.add("Andhra pradesh");
		Locations.add("chennai");
		Locations.add("benglore");
		Locations.remove("hydarabad");
		// Iterator <String> m= Locations.iterator<>();
		Iterator<String> m = Locations.iterator();
		while (m.hasNext()) {
			System.out.println("this is loop !! " + m.next());
			System.out.println("this is hascode" + Locations.hashCode());
			Collection<String> n = new ArrayList<>();
			n.add("sankavaram");
			n.add("gundemadakala");
			n.add("vinjamur");
			n.add("kaligiri");
			n.add("asnapram");
			n.add("sangam");
			System.out.println("this is print  names !! " + n);
			if (Locations.equals(m)) {
				System.out.println("data is found");
				Locations.add("chennai");
				Locations.add("benglore");
				System.out.println("" + Locations);

			} else {
				System.out.println("this is data not found");
			}
		}

	}

}
