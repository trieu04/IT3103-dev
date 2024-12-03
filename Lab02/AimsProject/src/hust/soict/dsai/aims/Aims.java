package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.media.*;
import java.util.*;

public class Aims {
	private static Scanner scanner = new Scanner(System.in);
	private static Store store = new Store();
	private static Cart cart = new Cart();

	public static void main(String[] args) {
		createSampleStore();
		showMenu();
	}

	public static void showMenu() {
		int choice;
		do {
			System.out.println("AIMS: ");
			System.out.println("--------------------------------");
			System.out.println("1. View store");
			System.out.println("2. Update store");
			System.out.println("3. See current cart");
			System.out.println("0. Exit");
			System.out.println("--------------------------------");
			System.out.println("Please choose a number: 0-1-2-3");

			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				storeMenu();
				break;
			case 2:
				updateStoreMenu();
				break;
			case 3:
				cartMenu();
				break;
			case 0:
				System.out.println("Exiting... Goodbye!");
				break;
			default:
				System.out.println("Invalid option. Please try again.");
			}
		} while (choice != 0);
	}

	public static void storeMenu() {
		store.print();

		int choice;
		do {
			System.out.println("Options: ");
			System.out.println("--------------------------------");
			System.out.println("1. See a media’s details");
			System.out.println("2. Add a media to cart");
			System.out.println("3. Play a media");
			System.out.println("4. See current cart");
			System.out.println("0. Back");
			System.out.println("--------------------------------");
			System.out.println("Please choose a number: 0-1-2-3-4");

			choice = scanner.nextInt();
			scanner.nextLine(); // consume the newline

			switch (choice) {
			case 1:
				seeMediaDetails();
				break;
			case 2:
				addMediaToCart();
				break;
			case 3:
				playMedia();
				break;
			case 4:
				cart.print();
				break;
			case 0:
				showMenu();
				break;
			default:
				System.out.println("Invalid option. Please try again.");
			}
		} while (choice != 0);
	}

	public static void seeMediaDetails() {
		System.out.print("Enter media title: ");
		String title = scanner.nextLine();
		Media media = cart.searchByTitle(title);

		if (media == null) {
			System.out.println("Media not found.");
			return;
		}

		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add to cart");
		System.out.println("2. Play");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");

		int choice = scanner.nextInt();
		scanner.nextLine(); // consume the newline

		switch (choice) {
		case 1:
			cart.addMedia(media);
			break;
		case 2:
			media.play();
			break;
		case 0:
			storeMenu();
			break;
		default:
			System.out.println("Invalid option. Please try again.");
		}

	}

	public static void addMediaToCart() {
		System.out.print("Enter media title to add to cart: ");
		String title = scanner.nextLine();
		Media media = store.searchByTitle(title);
		if (media != null) {
			cart.addMedia(media);
		} else {
			System.out.println("Media not found.");
		}
	}

	public static void updateStoreMenu() {
		createSampleStore();
	}

	public static void playMedia() {
		System.out.print("Enter media title to play: ");
		String title = scanner.nextLine();
		Media media = cart.searchByTitle(title);
		if (media != null) {
			media.play();
		} else {
			System.out.println("Media not found.");
		}
	}

	public static void cartMenu() {
		int choice;
		do {
			System.out.println("Options: ");
			System.out.println("1. Filter medias in cart");
			System.out.println("2. Sort medias in cart");
			System.out.println("3. Remove media from cart");
			System.out.println("4. Play a media");
			System.out.println("5. Place order");
			System.out.println("0. Back");
			System.out.print("Please choose a number: 0-1-2-3-4-5: ");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				filterMediasInCart();
				break;
			case 2:
				sortMediasInCart();
				break;
			case 3:
				removeMediaFromCart();
				break;
			case 4:
				playMedia();
				break;
			case 5:
				placeOrder();
				break;
			case 0:
				showMenu();
				break;
			default:
				System.out.println("Invalid option. Please try again.");
			}
		} while (choice != 0);
	}

	public static void filterMediasInCart() {
		System.out.print("Filter Medias In Cart.");
	}

	public static void sortMediasInCart() {
		System.out.print("Sort Medias In Cart.");
	}

	public static void removeMediaFromCart() {
		System.out.print("Enter media title to remove from cart: ");
		String title = scanner.nextLine();
		Media media = store.searchByTitle(title);
		if (media != null) {
			cart.removeMedia(media);
			System.out.println("Media removed.");
		} else {
			System.out.println("Media not found.");
		}
	}

	public static void placeOrder() {
		System.out.println("Order has been placed!");
		cart.print();
	}

	public static void createSampleStore() {
		Media dvd1 = new DigitalVideoDisc("Inception", "Sci-fi", "Christopher Nolan", 148, 19.99f);

		Media cd1 = new CompactDisc();
		cd1.setTitle("Dom Dom");
		cd1.setCategory("Music");
		cd1.setCost(20);

		Media book1 = new Book();
		book1.setTitle("Minano Nihongo 1");
		book1.setCategory("Learn");
		book1.setCost(10);

		store.addMedia(dvd1);
		store.addMedia(cd1);
		store.addMedia(book1);
	}
}