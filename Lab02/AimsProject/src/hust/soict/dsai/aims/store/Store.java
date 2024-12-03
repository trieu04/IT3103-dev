package hust.soict.dsai.aims.store;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;

public class Store {
	private ArrayList<Media> itemsInStore = new ArrayList<>();

	public void addMedia(Media media) {
		itemsInStore.add(media);
		System.out.println(media.getTitle() + " has been added to the store.");
	}

	public void removeMedia(Media media) {
		if (itemsInStore.remove(media)) {
			System.out.println(media.getTitle() + " has been removed from the store.");
		} else {
			System.out.println("The media is not available.");
		}
	}

	public void print() {
		System.out.println("Items currently in store:");
		for (Media media : itemsInStore) {
			System.out.println(media.toString());
		}
	}

	public Media searchByID(int id) {
		System.out.println("Search by ID " + id + ": ");
		for (Media media : itemsInStore) {
			if (media.getId() == id) {
				return media;
			}
		}
		return null;
	}

	public Media searchByTitle(String search) {
		System.out.println("Search by title " + search + ": ");
		for (Media media : itemsInStore) {
			if (media.getTitle().toLowerCase().equalsIgnoreCase(search.toLowerCase())) {
				return media;
			}
		}
		return null;
	}
}
