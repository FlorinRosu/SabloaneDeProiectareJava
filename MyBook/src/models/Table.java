package models;

public class Table implements Element {

	String t;
	
	public Table(String t) {
	super();
	this.t = t;
}

	@Override
	public void print() {
		System.out.println("Paragraph: " + this.t);
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
		v.visitTable(this);
		
	}

}
