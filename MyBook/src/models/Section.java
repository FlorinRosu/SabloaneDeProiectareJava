package models;

import java.util.ArrayList;

public class Section implements Element{
	String title;
	ArrayList<Element> elements;
	
	public Section(String title) {
		this.title = title;
		elements = new ArrayList<Element>();
	}

	@Override
	public void print() {
		System.out.println(this.title);
		this.elements.forEach(Element::print);
		
	}

	@Override
	public void add(Element element) {
		this.elements.add(element);
		
	}

	@Override
	public void remove(Element element) {
		this.elements.remove(element);
		
	}

	@Override
	public Element get(int index) {
		return this.elements.get(index);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitSection(this);
		for(Element element: elements) {
			element.accept(visitor);
		}
		
	}

}
