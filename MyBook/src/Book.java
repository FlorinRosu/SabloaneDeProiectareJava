import java.util.ArrayList;
import java.util.List;

public class Book {

	private String title;
	private List<String> paragraph;
	private List<String> image;
	private List<String> table;

	public Book(String title) {
		this.title = title;
		this.paragraph = new ArrayList<String>();
		this.image = new ArrayList<String>();
		this.table = new ArrayList<String>();

	}

	public void createNewParagraph(String paragraph) {

		this.paragraph.add(paragraph);

	}

	public void createNewImage(String image) {

		this.image.add(image);

	}

	public void createNewTable(String table) {

		this.table.add(table);

	}

	public void print() {

		System.out.println(this.title);
		System.out.println(this.paragraph);
		System.out.println(this.image);
		System.out.println(this.table);
	}
}