public class Image {

	String imageName;

	public Image(String imageName) {
		this.imageName = imageName;
	}

	public String print() {
		return "Image with name: " + this.imageName;
	}

}