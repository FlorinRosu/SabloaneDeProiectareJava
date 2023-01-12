package models;

import java.awt.Dimension;

public class ImageProxy implements Element, Picture {
	Image realImage;
	String url;
	
	
	
	public ImageProxy(String url) {
		this.url = url;
		this.realImage = null;
	}

	private Image loadImage() {
		if(realImage == null) {
			realImage = new Image(this.url);
		}
		
		return realImage;
	}
	
	@Override
	public String url() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension dim() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PictureContent content() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void print() {
		realImage = loadImage();
		System.out.println("ImageProxy with name: " + this.realImage.url);
		
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
		visitor.visitImageProxy(this);
		
	}

}
