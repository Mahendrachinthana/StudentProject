package appsongproject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class SongMain {
	private static ArrayList<Allbom> albom = new ArrayList<>();

	public static void main(String[] args) {

		Allbom albom1 = new Allbom("allbom1", "Ac/DC");
		albom1.addsong("tNT", 4.5);
		albom1.addsong("highwey to hell", 3.5);
		albom1.addsong("thundurstruck", 5.0);
		albom1.add(albom1);

		albom1 = new Allbom("allbom2Emines", "Emines");
		albom1.addsong("rap song", 4.5);
		albom1.addsong("Not afrai", 3.5);
		albom1.addsong("lose your self", 4.5);
		albom1.add(albom1);
		LinkedList<Song> playList = new LinkedList<>();
		LinkedList<Song> playList_1 = null;
		albom1.get(0).addplayList("TNT", playList_1);
		albom1.get(0).addplayList("Highway to hell", playList_1);
		albom1.get(1).addplayList("Rap god", playList_1);
		albom1.get(1).addplayList("Lose your self", playList_1);
		play(playList_1);

	}

	private static void play(LinkedList<Song> playList) {
		Scanner sc = new Scanner(System.in);
		boolean quit = false;
		boolean forward = true;
		ListIterator<Song> ListIterator = playList.listIterator();
		if (playList.size() == 0) {
			System.out.println("this playlist have no song");
		} else {
			System.out.println("now playing " + ListIterator.next().toString());
			printMenu();

		}
		while (!quit) {
			int action = sc.nextInt();
			sc.nextLine();
			switch (action) {
			case 0:
				System.out.println("playList complete");
				quit = true;
				break;
			case 1:
				if (!forward) {
					if (ListIterator.hasNext()) {
						ListIterator.next();
					}
					forward = true;

				}
				if (ListIterator.hasNext()) {
					System.out.println("now playing " + ListIterator.toString());
				} else {
					System.out.println("we have non avilable reched to the end of the list");
					forward = false;
				}
				break;
			case 2:
				if (forward) {
					if (ListIterator.hasPrevious()) {
						ListIterator.previous();

					}
					forward = false;

				}
				if (ListIterator.hasPrevious()) {
					System.out.println("now plyling " + ListIterator.previous().toString());

				} else {
					System.out.println("we are the first song ");
					forward = false;

				}
				break;
			case 3:
				if (forward) {
					if (ListIterator.hasPrevious()) {
						System.out.println("new plyling " + ListIterator.previous().toString());

						forward = false;

					} else {
						System.out.println("we are at the start of the List");
					}
				} else {

					if (ListIterator.hasNext()) {

						System.out.println("new playing" + ListIterator.next().toString());
						forward = false;

					} else {
						System.out.println("we have to  the end of list");
					}
				}

				break;
			case 4:
				printList(playList);
				break;
			case 5:
				printMenu();
				break;
			case 6:
				if (playList.size() > 0) {
					ListIterator.remove();
					if (ListIterator.hasNext()) {
						System.out.println("new playing " + ListIterator.next().toString());
						forward = true;

					} else {
						if (ListIterator.hasPrevious()) {
							System.out.println("now plying" + ListIterator.previous().to);
						}
					}
				}

			}
		}
	}

	private static void printMenu() {
		System.out.println("Available options\n presh");
		System.out.println("0-to quit\n" + "1- to play next song \n " + "2 - to play previous song\n+"
				+ "3 - rey play corrent song \n" + "4 - to list of  all songs \n"
				+ "5 - to print all availabule option\n" + "6 - delete current song ");
	}

	private static void printList(LinkedList<Song> playList) {
		Iterator<Song> iterator = playList.iterator();
		System.out.println("------------------");
		while (iterator.hasNext())
			;
		{

			System.out.println(iterator.next());
		}
		System.out.println("------------------");

	}
}
