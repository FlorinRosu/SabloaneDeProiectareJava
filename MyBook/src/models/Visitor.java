package models;

public interface Visitor {

	public void visitBook(Book b);

	public void visitSection(Section b);

	public void visitTableOfContents(TableOfContents b);

	public void visitParagraph(Paragraph b);

	public void visitImageProxy(ImageProxy b);

	public void visitImage(Image b);

	public void visitTable(Table b);

}
