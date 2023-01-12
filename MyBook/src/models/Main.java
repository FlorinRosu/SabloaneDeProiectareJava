package models;




public class Main {
	
	public static void Printing() {
		DocumentManager.getInstance().getBook().getTOC().print();
	}
	
	
	public static void main(String[] args) {
		Book myBook = new Book("My Book");
		DocumentManager.getInstance().setBook(myBook);
		Author me = new Author("My Self");
		myBook.addAuthor(me);
		Section cap1 = new Section("Capitolul 1");
		Paragraph p1 = new Paragraph("Paragraph 1");
		cap1.add(p1);
		Paragraph p2 = new Paragraph("Paragraph 2");
		cap1.add(p2);
		Paragraph p3 = new Paragraph("Paragraph 3");
		cap1.add(p3);
		Paragraph p4 = new Paragraph("Paragraph 4");
		cap1.add(p4);
		
		cap1.add(new ImageProxy("ImageOne"));
		cap1.add(new Image("ImageTwo"));
		cap1.add(new Paragraph("Some text"));
		cap1.add(new Table("Table 1"));
		
		//Section cap1 = new Section("Capitolul 1");
		Section cap11 = new Section("Capitolul 1.1");
		Section cap111 = new Section("Capitolul 1.1.1");
		Section cap1111 = new Section("Subchapter 1.1.1.1");
		cap1.add(new Paragraph("Moto capitol"));
		cap1.add(cap11);
		cap11.add(new Paragraph("Text from subchapter 1.1"));

		cap11.add(cap111);
		cap111.add(new Paragraph("Text from subchapter 1.1.1"));
		cap111.add(cap1111);
		cap1111.add(new Image("Image subchapter 1.1.1.1"));

		myBook.addContent(cap1);
		myBook.addContent(cap11);
		myBook.addContent(cap111);
		myBook.addContent(cap1111);
		
		
		TableOfContents toc = new TableOfContents();
		ContentVisitor visitor = new ContentVisitor(toc);
		cap1.accept(visitor);
		
		CreateTOC v = new CreateTOC();
		myBook.accept(v);
		myBook.setTOC(v.getTOC());

		Printing();
		System.out.println("\n\n");
		
		UpdateTOC o = new UpdateTOC(myBook);
		myBook.registerObservers(o);
		cap1111.add(new Paragraph("Motto 2"));
		Section cap2 = new Section("Capitolul 2");
		myBook.addContent(cap2);
		myBook.notifyObservers();
		
		Printing();
		
	}

}
