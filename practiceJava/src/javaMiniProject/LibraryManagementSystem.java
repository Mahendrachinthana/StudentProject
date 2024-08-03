package javaMiniProject;

import java.util.Scanner;

public class LibraryManagementSystem {
	public static void main(String[] args) {
		Library library = new Library();
		Scanner Scanner = new Scanner(System.in);
		boolean running = true;
		while (running) {
			System.out.println("Library Activiy system");
			System.out.println(" number 1 books ");
			System.out.println("number 2 isborro ");
			System.out.println("number 3 return books");
			System.out.println(" number 4 is available books ");
			System.out.println("number 5 sherch books ");
			System.out.println("numbner 6 exit");
			System.out.println("chose an option");
			int choise = Scanner.nextInt();
			Scanner.nextLine();
			switch(choise){
			case 1:
				System.out.println("enter the book name");
				String name =Scanner.nextLine();
				System.out.println("enter book author");
			
		
			}

		}

	}

}
