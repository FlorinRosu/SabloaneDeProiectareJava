package models;

import java.util.ArrayList;

public class Book extends Section{
	ArrayList<Author> authors;
	ArrayList<Element> contents;
	ArrayList<Observer> observerCollection;
	TableOfContents toc;
	
	public Book(String title) {
		super(title);
		this.authors = new ArrayList<Author>();
		this.contents = new ArrayList<Element>();
		this.observerCollection = new ArrayList<Observer>();
	}

	public void print() {
		System.out.println("Book: " + this.title +"\n\n" + "Authors:");
		this.authors.forEach(Author::print);
		System.out.println();
		this.contents.forEach(Element::print);
	}
	
	public TableOfContents getTOC() {
		return this.toc;
	}

	public void addAuthor(Author author) {
		this.authors.add(author);
		
	}

	public void addContent(Element element) {
		this.contents.add(element);
		
	}
	
	public void registerObservers(Observer observer) {
		this.observerCollection.add(observer);
	}
	
	public void unregisterObserver(Observer observer) {
		this.observerCollection.remove(observer);
	}

	public void notifyObservers() {
		for (Observer observer: observerCollection) {
			observer.update();
		}
	}
	
	public void accept(Visitor visitor) {
		visitor.visitBook(this);
		for(Element element: contents) {
			element.accept(visitor);
		}
	}
	
	public void setTOC(TableOfContents toc) {
		this.toc = toc;
	}
}

