package javaMiniProject;

public class Books {
	private String titile;
	private String author;
	private boolean isborrod;

	public Books(String titile, String author) {
		this.titile = titile;
		this.author = author;
		this.isborrod = false;

	}

	public String gettitile() {
		return titile;

	}

	public String getauthor() {
		return author;

	}

	public boolean isborrod() {
		return isborrod;

	}

	public void borrod() {
		if (!isborrod()) {
			isborrod = true;
			System.out.println("this bood just borrod");

		} else {
			System.out.println("this book is alredy borrod");

		}
	}

	public void returnblock() {
		if (!isborrod) {
			isborrod = false;
			System.out.println("yes is yet");
		} else {
			System.out.println("no is not yet");
		}

	}

	public String toString() {
		return "books{" + "titile = " + titile + "/" + "author =" + author + "/" + "borrod =" + isborrod +

				"}";
	}

	public static void add(Books books) {
		// TODO Auto-generated method stub
		
	}

	 
}