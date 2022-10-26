
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

}
