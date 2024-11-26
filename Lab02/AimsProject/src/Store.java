import java.util.ArrayList;

public class Store {
    private ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<>();

    public void addDVD(DigitalVideoDisc dvd) {
        itemsInStore.add(dvd);
        System.out.println(dvd.getTitle() + " has been added to the store.");
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        if (itemsInStore.remove(dvd)) {
            System.out.println(dvd.getTitle() + " has been removed from the store.");
        } else {
            System.out.println("The DVD is not available.");
        }
    }

    public void print() {
        System.out.println("Items currently in store:");
        for (DigitalVideoDisc dvd : itemsInStore) {
            System.out.println(dvd.toString());
        }
    }
}
