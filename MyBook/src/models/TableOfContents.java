package models;

public class TableOfContents implements Element {

	@Override
	public void print() {
		// TODO Auto-generated method stub

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
		v.visitTableOfContents(this);
		
	}

}
