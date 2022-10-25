import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Chapter {
	String name;
	List<SubChapter> sc = new ArrayList<SubChapter>();

	public Chapter(String name) {
		this.name = name;
	}
	public int createSubChapter(String subChapter) {
		SubChapter subCh = new SubChapter(subChapter);
		this.sc.add(subCh);
		return this.sc.indexOf(subCh);
	}
	public SubChapter getSubChapter(int indexChapter) {
		return this.sc.get(indexChapter);
	}

}