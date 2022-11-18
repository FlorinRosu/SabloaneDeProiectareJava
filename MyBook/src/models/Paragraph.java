package models;

import services.AlignStrategy;

public class Paragraph implements Element {

	String title;

	public Paragraph(String title) {
		super();
		this.title = title;
	}

	@Override
	public void print() {
		System.out.println("Paragraph: " + this.title);

	}

	public void setAlignStrategy(AlignStrategy position) {
		this.title = position.render(this.title);

	}

	@Override
	public void add(Element e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Element e) {
		// TODO Auto-generated method stub

	}

	@Override
	public Element get(int i) {
		return null;
		// TODO Auto-generated method stub

	}

	@Override
	public void accept(Visitor v) {
		v.visitParagraph(this);
		
	}

}
