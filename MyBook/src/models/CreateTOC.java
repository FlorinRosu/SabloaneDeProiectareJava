package models;

public class CreateTOC implements Visitor{
	TableOfContents toc;
	
	
	public CreateTOC() {
		this.toc = new TableOfContents();
	}
	
	

	public TableOfContents getTOC() {
		return toc;
	}



	public void setTOC(TableOfContents toc) {
		this.toc = toc;
	}



	@Override
	public void visitBook(Book book) {
		this.toc.addEntry(book.title);
		
	}

	@Override
	public void visitSection(Section section) {
		this.toc.addEntry(section.title);
		
	}

	@Override
	public void visitTableOfContents(TableOfContents tableOfContents) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitParagraph(Paragraph paragraph) {
		this.toc.addEntry(paragraph.text);
		
	}

	@Override
	public void visitImageProxy(ImageProxy imageProxy) {
		this.toc.addEntry(imageProxy.url);
		
	}

	@Override
	public void visitImage(Image image) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitTable(Table table) {
		this.toc.addEntry(table.title);
		
	}

	public void print() {
		this.toc.print();
	}
}
