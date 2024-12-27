package hust.soict.dsai.aims.cart;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;

	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

	public int addMedia(Media media) {
		if (itemsOrdered.size() == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is full, cannot add!");
			return 0;
		} else {
			itemsOrdered.add(media);
			System.out.println("The media has been added: " + media.getTitle());
			return 1;
		}
	}

	public int addMedia(Media... mediaArray) {
		int addCount = 0;
		for (Media media : mediaArray) {
			addCount += addMedia(media);
		}
		return addCount;
	}

	public int removeMedia(Media media) {
		for (int i = 0; i < itemsOrdered.size(); i++) {
			if (itemsOrdered.get(i).equals(media)) {
				itemsOrdered.remove(i);
				System.out.println("Media removed: " + media.getTitle());
				return 1;
			}
		}

		System.out.println("No matching media.");
		return 0;
	}

	public int removeMedia(Media... mediaArray) {
		int removeCount = 0;
		for (Media media : mediaArray) {
			removeCount += removeMedia(media);
		}
		return removeCount;
	}

	public float totalCost() {
		float sum = 0;
		for (Media media : itemsOrdered) {
			sum += media.getCost();
		}
		return sum;
	}

	public void print() {
		System.out.println("***********************CART************************");
		System.out.println("Ordered Items:");
		for (Media media : itemsOrdered) {
			System.out.println(media.toString());
		}
		System.out.println("Total cost: " + totalCost());
		System.out.println("***************************************************");
	}

	public Media searchByID(int id) {
		System.out.println("Search by ID " + id + ": ");
		for (Media media : itemsOrdered) {
			if (media.getId() == id) {
				return media;
			}
		}
		return null;
	}

	public Media searchByTitle(String search) {
		System.out.println("Search by title " + search + ": ");
		for (Media media : itemsOrdered) {
			if (media.getTitle().toLowerCase().equalsIgnoreCase(search.toLowerCase())) {
				return media;
			}
		}
		return null;
	}
	
    public ObservableList<Media> getItemsOrdered() {
        return FXCollections.observableArrayList(itemsOrdered);
    }
}
