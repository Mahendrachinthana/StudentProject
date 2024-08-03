package ExeptionHandilingpractice;

public class ExeptionArrays1 {

	public static void main(String[] args)throws Exception {
		try {
			int [] number =new int[5];
			number[0]=52;
			number [1]=10;
			number[2]=54;
			number[3]=85;
			number[4]=45;
			for (int i=0;i<number.length;i++) {
				System.out.println("this is number of arrays number :: " +number[i]);
			}
			int a = 85;
			int b = 58;
			String name = "mahi";
			System.out.println("Arrays number :: "+a+ b);
			System.out.println("this is  String  name  :: "+name);
			
		}catch(ArithmeticException  e){
			System.out.println("this is array exeption bound !! ");
			
		}finally {
			System.out.println("this is Arrays number");
		}
	}

}
