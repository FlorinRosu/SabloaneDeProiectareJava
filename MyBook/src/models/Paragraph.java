package models;

import services.AlignStrategy;

public class Paragraph implements Element{
	String text;

	public Paragraph(String text) {
		this.text = text;
	}
	
	public void print() {
		System.out.println("Paragraph: " + this.text);
	}

	@Override
	public void add(Element element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Element element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Element get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setAlign(AlignStrategy alignStrategy) {
		this.text = alignStrategy.render(this.text);
		
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitParagraph(this);
		
	}
}
