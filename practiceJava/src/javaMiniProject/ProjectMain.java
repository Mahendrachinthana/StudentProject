package javaMiniProject;

import java.util.Scanner;

public class ProjectMain {
	public static void main(String[] args) {
		Library library = new Library();
		Scanner Scanner = new Scanner(System.in);

		boolean running = true;
		while (running) {
			System.out.println("library books ");
			System.out.println("add a books");

			System.out.println("barro a books");

			System.out.println("viwe avlilable books ");

			System.out.println("sherch for books");
			System.out.println("exit");
			System.out.println("chose an   books");
			int choice = Scanner.nextInt();

			Scanner.nextLine();
			switch (choice) {
			case 1:
				System.out.println("enter an book title");
				String title = Scanner.nextLine();
				library.addBooks(new Books(title, title));
				break;
			case 2:
				System.out.println("enter book title barro");
				title = Scanner.nextLine();
				library.borrobook(title);
				break;

			case 3:
				System.out.println("eneter book title library");
				title = Scanner.nextLine();
				library.ViewAvailableBooks(title);
				break;
			case 4:
				System.out.println("enter avilable books");
				title =Scanner .nextLine();
				library.SherchQuery(title);
				break;
			case 5:
			
				System.out.println("sherch books");
				title =Scanner.nextLine();
				String Query =Scanner.nextLine();
				library.SherchQuery(Query);
				break;
			case 6:
				running =false;
				break;
				default:
					System.out.println("invalid choice plz try againe");
				

			

			}
		
		}
		Scanner.close();

	}
	

}
