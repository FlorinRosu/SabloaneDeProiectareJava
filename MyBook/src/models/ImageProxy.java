package models;

public class ImageProxy implements Picture, Element {

	private Image realImage = null;
	private String url;

	public ImageProxy(String url) {
		this.url = url;

	}

	public Image loadImage() {
		if (realImage == null) {
			this.realImage = new Image(this.url);
		}
		return this.realImage;
	}

	@Override
	public void print() {
		loadImage().print();

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void accept(Visitor v) {
		v.visitImageProxy(this);
		
	}
}
