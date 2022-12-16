package models;

import services.AlignCenter;
import services.AlignLeft;
import services.AlignRight;

public class Main {
	public static void Printing() {
		DocumentManager.getInstance().getBook().print();
	}

	public static void main(String[] args) throws Exception {
		Book b = new Book("Abcdef");

		DocumentManager.getInstance().setBook(b);
		Author a = new Author("Ion Creanga");
		b.addAuthor(a);

		Section cap1 = new Section("Capitolul 1");
		Paragraph p1 = new Paragraph("Paragraph 1");
		Paragraph p2 = new Paragraph("Paragraph 2");
		Paragraph p3 = new Paragraph("Paragraph 3");
		Paragraph p4 = new Paragraph("Paragraph 4");
		cap1.add(p1);
		cap1.add(p2);
		cap1.add(p3);
		cap1.add(p4);
		cap1.add(new ImageProxy("ImageOne"));
		cap1.add(new Image("ImageTwo"));
		cap1.add(new Paragraph("Some text"));
		cap1.add(new Table("Table 1"));

		TableOfContentsVisitor v = new TableOfContentsVisitor();

		b.addContent(v.getTableOfContentsVisitor());
		b.accept(v);

		Printing();

	}
}