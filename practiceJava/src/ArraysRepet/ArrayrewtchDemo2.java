package ArraysRepet;

public class ArrayrewtchDemo2 {

	public static void main(String[] args) {
			double []numbers = {3,5,4,346,746,55,-958,867};
			double sum=0;
			double avg=0;
			for (int i=0;i<numbers.length;i++) {
				sum+=numbers[i];
				//avg =sum/numbers.length[i];
			
			}
			avg /=numbers.length;

			System.out.println("this is sum  !!"+sum);
			System.out.println("this is avg !!"+avg);
	}

}
