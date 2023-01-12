package models;

public class Table implements Element{
	String title;

	public Table(String title) {
		this.title = title;
	}
	
	public void print() {
		System.out.println("Table with Title: " + this.title);
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

	@Override
	public void accept(Visitor visitor) {
		visitor.visitTable(this);
		
	}
}
