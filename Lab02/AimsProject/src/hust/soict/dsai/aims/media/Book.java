package hust.soict.dsai.aims.media;
import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();
	
	public Book() {
		super();
	}
	
    public Book(String title, String category, float cost) {
    	super();
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
	
	public int addAuthor(String authorName) {
		if (findAuthor(authorName) == -1) {
			authors.add(authorName);
			return 1;
		}
		else {
			return 0;
		}
	}
	
	public int removeAuthor(String authorName) {
		int i = findAuthor(authorName); 
		if (i != -1) {
			authors.remove(i);
			return 1;
		}
		return 0;
	}
	
	private int findAuthor(String authorName) {
		for (int i = 0; i < authors.size(); i++) {
			if (authors.get(i).compareTo(authorName) == 0) {
				return i;
			}
		}
		return -1;
	}
}
