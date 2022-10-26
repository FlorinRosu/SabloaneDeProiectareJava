import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Book extends Section {

	List<Author> a = new ArrayList<Author>();

	public Book(String title) {
		super(title);
	}

	public void addAuthor(Author a) {
		this.a.add(a);

	}

	public void addContent(Element e) {
		this.e.add(e);

	}

	public void print() {

		System.out.println("Book: " + this.title + "\n");
		Iterator<Author> it = a.iterator();

		System.out.println("Authors:");

		while (it.hasNext()) {
			System.out.println("Author: " + it.next().print());
		}
		System.out.println();
		
		Iterator<Element> it2 = this.e.iterator();
		while (it2.hasNext()) {
			it2.next().print();
		}

	}

}
