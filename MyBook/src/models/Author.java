package models;

public class Author {
	String name;
	String surname;

	public Author(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println("Author: " + this.name);
	}
}
