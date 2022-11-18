package services;

public class AlignLeft implements AlignStrategy {

	@Override
	public String render(String text) {
		return text + "###" + "###";
	}


}
