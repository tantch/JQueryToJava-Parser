import java.util.ArrayList;
import java.util.Iterator;

public class Tester {

	public static void main(String[] args) {
		ArrayList<Book> lib = new ArrayList<Book>();
		ArrayList<Author> autores1 = new ArrayList<Author>();
		ArrayList<String> names1;
		ArrayList<String> names2;
		ArrayList<Integer> isbns;
		ArrayList<Integer> years;
		Book temp = new Book(1994, 12345);
		temp.addAuthor(new Author("Luis"));
		lib.add(temp);
		Book tempb = new Book(2323, 123331);
		tempb.addAuthor(new Author("Nia"));
		lib.add(tempb);

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
			temp0.add(book.getIsbn());
		}
		isbns = temp0;
		years = new ArrayList<Integer>();

		ArrayList<Integer> temp1 = new ArrayList<Integer>();
		for (Book book : lib) {
			temp1.add(book.year);
		}
		years = temp1;

		System.out.println(isbns.toString());
		System.out.println(years.toString());

		names1 = new ArrayList<String>();

		ArrayList<Author> temp2 = new ArrayList<Author>();
		for (Book book : lib) {
			temp2.addAll(book.getAuthors());
		}
		autores1 = temp2;
		try {
			if (autores1.size() < 1) {
				System.out
						.println("An empty arraylist cannot be used as an in var");
				return;
			}
		} catch (NullPointerException e) {
			System.out.println("ERROR : ArrayList<> autores1 is null ");
			System.exit(-1);
		}
		ArrayList<String> temp3 = new ArrayList<String>();
		for (Author author : autores1) {
			temp3.add(author.name);
		}
		names1 = temp3;
		names2 = new ArrayList<String>();

		ArrayList<Author> temp4 = new ArrayList<Author>();
		for (Book book : lib) {
			temp4.addAll(book.getAuthors());
		}
		for (Iterator<Author> it = temp4.iterator(); it.hasNext();) {
			Author obj = it.next();
			int i = 0;
			if (obj.name != "Nia") {
				it.remove();
				continue;
			}
			i++;
		}
		ArrayList<String> temp5 = new ArrayList<String>();
		for (Author author : temp4) {
			temp5.add(author.name);
		}
		names2 = temp5;

		System.out.println(names1.toString());
		System.out.println(names2.toString());
	}

	private static class Book {

		private ArrayList<Author> authors;
		private int isbn;
		public int year;

		public Book(int isbn, int year) {
			this.isbn = isbn;
			this.year = year;
			authors = new ArrayList<Author>();
		}

		public ArrayList<Author> getAuthors() {
			return authors;
		}

		public int getIsbn() {
			return isbn;
		}

		public void addAuthor(Author author) {
			authors.add(author);
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