package models;

public class TableOfContentsVisitor implements Visitor {

	TableOfContents ToC= new TableOfContents();
	int k;
	

	public TableOfContents getTableOfContentsVisitor() {

		return this.ToC;

	}

	@Override
	public void visitBook(Book b) {
		this.ToC.add(b);
		k++;
	}

	@Override
	public void visitSection(Section b) {
		this.ToC.add(b);

	}

	@Override
	public void visitTableOfContents(TableOfContents b) {
		this.ToC.add(b);

	}

	@Override
	public void visitParagraph(Paragraph b) {
		this.ToC.add(b);

	}

	@Override
	public void visitImageProxy(ImageProxy b) {
		this.ToC.add(b);

	}

	@Override
	public void visitImage(Image b) {
		this.ToC.add(b);
	}

	@Override
	public void visitTable(Table b) {
		this.ToC.add(b);

	}

}
