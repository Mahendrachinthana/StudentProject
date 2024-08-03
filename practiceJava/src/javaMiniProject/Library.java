package javaMiniProject;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Books> books;

	public Library() {
		this.books = new ArrayList<>();

	}
	public void addBooks(Books books) {
		Books.add(books);
		
	}

	public void borrobook(String titile) {
		for(Books book:books) {
			if (book.gettitile().equalsIgnoreCase(titile)) {
				book.borrod();
				return ;
			}
			
		}
		System.out.println("book not fount");
		
	}
	public void booklibrary(String titile) {
		for (Books book :books) {
			if (book.gettitile().equalsIgnoreCase(titile)) {
			
			}
		}
	}
	public void ViewAvailableBooks(String title) {
		for (Books book:books) {
			if (!book.isborrod()) {
				System.out.println(books);
				
			}
		}
	}
	public void SherchQuery(String Query) {
		for (Books book:books) {
			if(book.gettitile().equalsIgnoreCase(Query) || book.getauthor().equalsIgnoreCase(Query)) {
				System.out.println(book);
				
			}
		}
		
	}
}