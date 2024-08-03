package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestLaptop {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		Shorting1 l1 = new Shorting1(8, "hp", 45000);
		Shorting1 l2 = new Shorting1(12, "dell", 60000);
		Shorting1 l3 = new Shorting1(30, "apple", 100000);
		Shorting1 l4 = new Shorting1(6, "lenovo", 80000);
		Shorting1 l5 = new Shorting1(13, "samsung", 95000);
		Shorting1 l6 = new Shorting1(10, "asuss", 40000);
		Shorting1 l7 = new Shorting1(15, "vivo", 86000);
		List<Shorting1> al = new ArrayList<>();
		al.add(l1);
		al.add(l2);
		al.add(l3);
		al.add(l4);
		al.add(l5);
		al.add(l5);
		al.add(l5);
		Comparator c = new Comparator() {

			public int compare(Shorting1 o1, Shorting1 o2) {
				if ( o1.getRam() <  o2.getRam()) {
					return -1;

				} else if (((Shorting1) o1).getRam() < ((Shorting1) o2).getRam()) {

					return 1;
				}else {
					return 0;
				}

			}

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return 0;
			}

		};
		Collections.sort(al,c);

		System.out.println("all elements add" + al);

	}
}
