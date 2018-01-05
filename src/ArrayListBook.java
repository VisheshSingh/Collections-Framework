import java.util.ArrayList;
import java.util.List;

class Book {
	int id;
	String name, author, publisher;
	float price;

	Book(int id, String name, String author, String publisher, float price) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}
}

public class ArrayListBook {

	public static void main(String[] args) {
		Book b1 = new Book(101, "Code in Java", "John Doe", "Jack", 24f);
		Book b2 = new Book(102, "Luck By Chance", "peter Grillo Doe", "Luke hanneman", 49f);
		Book b3 = new Book(103, "Mr. Whose the Boss", "Bighead", "yein hun-yeng", 12f);

		List<Book> li = new ArrayList<Book>();
		li.add(b1);
		li.add(b2);
		li.add(b3);
		System.out.println("List of Books: ");
		for (Book b : li) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.price);
		}
	}

}
