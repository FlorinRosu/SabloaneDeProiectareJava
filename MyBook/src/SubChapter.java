import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SubChapter {
	String name;
	List<Paragraph> p = new ArrayList<Paragraph>();
	List<Table> t = new ArrayList<Table>();
	List<Image> i = new ArrayList<Image>();

	public SubChapter(String name) {
		this.name = name;
	}

	public void createNewParagraph(String paragraph) {
		Paragraph para = new Paragraph(paragraph);
		this.p.add(para);
	}

	public void createNewImage(String image) {
		Image img = new Image(image);
		this.i.add(img);
	}

	public void createNewTable(String table) {
		Table titl = new Table(table);
		this.t.add(titl);
	}

	public String print() {
		System.out.println("SubChapter: " + this.name);
		Iterator<Paragraph> p = this.p.iterator();
		Iterator<Image> i = this.i.iterator();
		Iterator<Table> t = this.t.iterator();
		while (p.hasNext()) {
			System.out.println(p.next().print());
		}
		while (i.hasNext()) {
			System.out.println(i.next().print());
		}
		while (t.hasNext()) {
			System.out.println(t.next().print());
		}
		return " ";

	}

}