package inheritence2;

public class Animal2 {
	public static void main (String []args) {
		Animal2 obj=new Animal2();
		cat obj1 =new cat();
		obj.Animalsound();
		obj.Animalsound();
		
	}
	public void Animalsound() {
		System.out.println("this is animal sound ");
		
		
	}

}
class cat {
	public void Animalsoun() {
		System.out.println("this is cat sound");
		
	}
}
//class Cat3{
//	public static void main (String []args) {
//		Animal2 obj=new Animal2();
//		
//		cat obj1=new cat();
//		obj.Animalsound();
//		obj1.Animalsoun();
//		
//	}
//}