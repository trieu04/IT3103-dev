package hust.soict.dsai.aims.test.media;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class MediaTest {
	public static void main(String[] args) {
		List<Media> mediae = new ArrayList<Media>();

		DigitalVideoDisc dvd = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		mediae.add(dvd);

		CompactDisc cd = new CompactDisc();
		cd.setTitle("Dom Dom");
		cd.setCategory("Music");
		cd.setCost(20);
		mediae.add(cd);

		Book book = new Book();
		book.setTitle("Minano Nihongo 1");
		book.setCategory("Learn");
		book.setCost(10);
		mediae.add(book);

		for (Media media : mediae) {
			System.out.println(media.toString());
		}
	}
}
