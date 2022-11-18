package models;

public class Author {

	String name;

	public Author(String name) {
		this.name = name;
	}

	public String print() {
		return this.name;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + "]";
	}

}
