import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Section implements Element {

	String title;

	List<Element> e = new ArrayList<Element>();

	public Section(String title) {
		super();
		this.title = title;
	}

	@Override
	public void print() {
		System.out.println(this.title);
		Iterator<Element> it = this.e.iterator();
		while (it.hasNext()) {
			it.next().print();
		}
	}

	@Override
	public void add(Element e) {
		this.e.add(e);

	}

	@Override
	public void remove(Element e) {
		this.e.remove(e);
	}

	@Override
	public Element get(int i) {
		return this.e.get(i);

	}

}
