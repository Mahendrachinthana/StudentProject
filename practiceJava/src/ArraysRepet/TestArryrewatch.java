package ArraysRepet;

public class TestArryrewatch {

	public static void main(String[] args) {
		int[] nubbers = { 4, 6, 7, -56, 86, 34, 78, 55 };
		int sum = 0;
		int avg = 0;
		for (int i = 0; i < nubbers.length; i++) {
			sum = sum + nubbers[i];
			
			avg = sum /nubbers[i];

		}
		//avg = sum / avg;
		System.out.println("sum array"+sum);
		System.out.println("this is age "+avg);

	}

}
