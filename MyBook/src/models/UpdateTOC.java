package models;

public class UpdateTOC implements Observer{
	Book book;
	
	public UpdateTOC(Book book) {
		this.book = book;
	}

	@Override
	public void update() {
		CreateTOC v = new CreateTOC();
		book.accept(v);
		book.setTOC(v.getTOC());
		
	}

}
