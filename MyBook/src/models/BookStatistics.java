package models;

public class BookStatistics implements Visitor {

	int book;
	int section;
	int tableOfContents;
	int paragraph;
	int imageProxy;
	int image;
	int table;

	@Override
	public void visitBook(Book b) {
		book++;

	}

	@Override
	public void visitSection(Section b) {
		section++;

	}

	@Override
	public void visitTableOfContents(TableOfContents b) {
		tableOfContents++;

	}

	@Override
	public void visitParagraph(Paragraph b) {
		paragraph++;

	}

	@Override
	public void visitImageProxy(ImageProxy b) {
		image++;
	}

	@Override
	public void visitImage(Image b) {
		image++;

	}

	@Override
	public void visitTable(Table b) {
		table++;

	}

	public void printStatistics() {
		
		System.out.println("Book Statistics:");
		System.out.println(" *** Number of images: " + this.image);
		System.out.println(" *** Number of tables: " + this.table);
		System.out.println(" *** Number of paragraph: " + this.paragraph);
		
	}

}
