import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		ArrayList<Book> lib = new ArrayList<Book>();
		ArrayList<Integer> isbns;
		lib.add(new Book(1994, 12345));
		lib.add(new Book(2323, 123331));
		try {
			if (lib.size() < 1) {
				System.out
						.println("An empty arraylist cannot be used as an in var");
				return;
			}
		} catch (NullPointerException e) {
			System.out.println("ERROR : ArrayList<> lib is null ");
			System.exit(-1);
		}
		isbns = new ArrayList<Integer>();

		ArrayList<Integer> temp0 = new ArrayList<Integer>();
		for (Book book : lib) {
			temp0.add(book.isbn);
		}
		isbns = temp0;

		System.out.println(isbns.toString());
	}

	private static class Book {

		public ArrayList<Author> authors;
		public int isbn;
		public int year;

		public Book(int isbn, int year) {
			this.isbn = isbn;
			this.year = year;
		}

		public ArrayList<Author> getAuthor() {
			return authors;
		}

		public int getIsbn() {
			return isbn;
		}

		public int getYear() {
			return year;
		}

	}

	private static class Author {
		public ArrayList<String> awards;
		public String name;

		public Author(String name) {
			this.name = name;
		}
	}
}