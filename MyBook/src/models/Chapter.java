package models;

import java.util.ArrayList;

public class Chapter {
	String name;
	ArrayList<SubChapter> subchapters;

	public Chapter(String name) {
		this.name = name;
		subchapters = new ArrayList<SubChapter>();
	}
	
	public void print() {
		System.out.println("Chapter: " + this.name);
		subchapters.forEach(SubChapter::print);
	}

	public int createSubChapter(String subChapterTitle) {
		SubChapter subchapter = new SubChapter(subChapterTitle);
		subchapters.add(subchapter);
		return subchapters.indexOf(subchapter);
	}

	public SubChapter getSubChapter(int indexSubChapter) {
		return subchapters.get(indexSubChapter);
	}
}
