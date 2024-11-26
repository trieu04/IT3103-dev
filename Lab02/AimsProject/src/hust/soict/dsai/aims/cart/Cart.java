package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;

	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered;

	public int addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("Cart is full, cannot add!");
			return 0;
		} else {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("The DVD \"" + disc.getTitle() + "\"have been added!");
			return 1;
		}
	}
	
	public int addDigitalVideoDisc(DigitalVideoDisc... dvdArray) {
		int addCount = 0;
		for (DigitalVideoDisc disc : dvdArray) {
			addCount += addDigitalVideoDisc(disc);
		}
		return addCount;
	}
	
	public int addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		int addCount = 0;
		addCount += addDigitalVideoDisc(dvd1);
		addCount += addDigitalVideoDisc(dvd2);
		return addCount;
	}

	public int removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if (itemsOrdered[0] == null) {
			System.out.println("Your cart is empty!");
			return 0;
		}
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].equals(disc)) {
				for (int j = i; j < qtyOrdered - 1; j++) {
					itemsOrdered[j] = itemsOrdered[j + 1];
				}
				itemsOrdered[qtyOrdered - 1] = null;
				qtyOrdered--;
				System.out.println("Remove DVD \"" + disc.getTitle() + "\" successfully!");
				return 1;
			}
		}
		System.out.println("No DVD match!");
		return 0;
	}
	
	public int removeDigitalVideoDisc(DigitalVideoDisc... dvdArray) {
		int removeCount = 0;
		for (DigitalVideoDisc disc : dvdArray) {
			removeCount += removeDigitalVideoDisc(disc);
		}
		return removeCount;
	}

	public float totalCost() {
		float sum = 0.00f;
		for (int i = 0; i < qtyOrdered; i++) {
			sum += itemsOrdered[i].getCost();
		}
		return sum;
	}
	
	public void print() {
		System.out.println("***********************CART************************");
		System.out.println("Ordered Items:");
		for(int i = 0; i < qtyOrdered; i++) {
			System.out.println(itemsOrdered[i].toString());
		}
		System.out.println("Total cost: " + totalCost());
		System.out.println("***************************************************");
	}
	
	public void searchByID (int id) {
		System.out.println("Search by ID " + id + ": ");
		for(int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].getId() == id) {
				System.out.println("Found: " + itemsOrdered[i].toString());
				return;
			}
		}
		System.out.println("Not Found!");
		return;
	}
	
	public void searchByTitle(String search) {
		System.out.println("Search by title " + search + ": ");
		int found = 0;
		for(int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].getTitle().toLowerCase().contains(search.toLowerCase())) {
				System.out.println("Found: " + itemsOrdered[i].toString());
				found++;
			}
		}
		
		if (found == 0) {
			System.out.println("Not Found!");
		}
	}
}
