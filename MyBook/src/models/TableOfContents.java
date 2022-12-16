package models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TableOfContents implements Element {

	List<Element> le = new ArrayList<>();

	@Override
	public void print() {
		int i = 0;
		for (Element e : le) {

			System.out.println(e + "........." + i);
			i++;

		}

	}

	@Override
	public void add(Element e) {
		this.le.add(e);

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
