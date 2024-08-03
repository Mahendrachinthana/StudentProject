package Collections;

public class StringHandiling1 {

	public static void main(String[] args) {
		String name = "mahendra";
		System.out.println("this is String handiling name printinga  ! " + name);
		String obj = new String("mahendra");
		String obj2 = new String("mahendra");

		if (name == obj) {
			System.out.println("yas this is same");
		} else {
			System.out.println("no this is not same");
		}
		if (obj == obj2) {
			System.out.println("yas this is same ");
		} else {
			System.out.println("no this is not same");
		}
	}

}
