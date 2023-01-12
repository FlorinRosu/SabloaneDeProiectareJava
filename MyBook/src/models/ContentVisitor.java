package models;

public class ContentVisitor implements Visitor{
	int contentNumber;
	TableOfContents toc;
	
	
	public ContentVisitor(TableOfContents toc) {
		this.contentNumber = 0;
		this.toc = toc;
	}

	@Override
	public void visitBook(Book book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitSection(Section section) {
		this.contentNumber++;
		toc.addEntry(section.title + "........" + this.contentNumber);
		
	}

	@Override
	public void visitTableOfContents(TableOfContents tableOfContents) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitParagraph(Paragraph paragraph) {
		this.contentNumber++;
		
		
	}

	@Override
	public void visitImageProxy(ImageProxy imageProxy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitImage(Image image) {
		this.contentNumber++;
		
	}

	@Override
	public void visitTable(Table table) {
		this.contentNumber++;
		
	}

	public TableOfContents getTOC() {
		return this.toc;
	}

}
