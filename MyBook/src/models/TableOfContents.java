package models;

import java.util.ArrayList;

public class TableOfContents implements Element{
	ArrayList<String> contents;
	
	
	public TableOfContents() {
		this.contents = new ArrayList<String>();
	}

	@Override
	public void print() {
		contents.forEach(System.out::println);
		
	}

	public void addEntry(String entry) {
		contents.add(entry);
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
		visitor.visitTableOfContents(this);
	}
	
}
