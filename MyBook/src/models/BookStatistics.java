package models;

public class BookStatistics implements Visitor{
	int numberOfParagraphs;
	int numberOfImages;
	int numberOfTables;
	
	BookStatistics(){
		this.numberOfParagraphs = 0;
		this.numberOfImages = 0;
		this.numberOfTables = 0;
	}

	@Override
	public void visitBook(Book book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitSection(Section section) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitTableOfContents(TableOfContents tableOfContents) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitParagraph(Paragraph paragraph) {
		this.numberOfParagraphs++;
		
	}

	@Override
	public void visitImageProxy(ImageProxy imageProxy) {
		this.numberOfImages++;
		
	}

	@Override
	public void visitImage(Image image) {
		this.numberOfImages++;
		
	}

	@Override
	public void visitTable(Table table) {
		this.numberOfTables++;
		
	}
	
	public void printStatistics() {
		System.out.println("Book Statistics:\n*** Number of images: " + this.numberOfImages 
				+ "\n*** Number of tables: " + this.numberOfTables + "\n*** Number of paragraphs: " + this.numberOfParagraphs);
	}
	
}
