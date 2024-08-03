package Projects;
import java.util.Random;
import java.util.Scanner;

public class NumberingGame {
	public static void main(String []args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("plz enter an gaming number");
		int game=sc.nextInt();
		Random obj=new Random();
		int mahigame=obj.nextInt(1000);
		System.out.println("this is random number"+mahigame);
		
		if (game == mahigame ) {
			System.out.println("congrants you won the game");
		}
		if (mahigame>=600) {
			System.out.println( " hello master congrats you won the game");
		}else {
			System.out.println(" hello master you los the game");
			
		}
		
			
		}
		
			
		
	}


