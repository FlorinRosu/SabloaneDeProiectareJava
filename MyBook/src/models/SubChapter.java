package models;

import java.util.ArrayList;

public class SubChapter {
	String name;
	ArrayList<Element> elements;
	ArrayList<Paragraph> paragraphs;
	ArrayList<Image> images;
	ArrayList<Table> tables;

	public SubChapter(String name) {
		this.name = name;
		elements = new ArrayList<Element>();
		paragraphs = new ArrayList<Paragraph>();
		images = new ArrayList<Image>();
		tables = new ArrayList<Table>();
	}
	
	public void print() {
		System.out.println("SubChapter: " + this.name);
		elements.forEach(Element::print);
		paragraphs.forEach(Paragraph::print);
		images.forEach(Image::print);
		tables.forEach(Table::print);
	}

	public void createNewParagraphs(String titleParagraph) {
		Paragraph paragraph = new Paragraph(titleParagraph);
		this.elements.add(paragraph);
	}

	public void createNewImages(String titleImage) {
		Image image = new Image(titleImage);
		this.elements.add(image);
		
	}

	public void createNewTables(String titleTable) {
		Table table = new Table(titleTable);
		this.elements.add(table);
		
	}
}
