
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

}
