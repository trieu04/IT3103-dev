package hust.soict.dsai.aims.screen;

import javax.swing.JOptionPane;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class AddDigitalVideoDiscToStoreScreen extends AddItemToStoreScreen {
    private Store store;

    // Constructor to initialize the screen and the store
    public AddDigitalVideoDiscToStoreScreen(Store store) {
        super("DVD");
        this.store = store;
    }

    @Override
    protected void addItem() {
        // Retrieve input values from text fields
        String title = titleField.getText();
        String category = categoryField.getText();
        float cost = Float.parseFloat(costField.getText());

        // Create a new DigitalVdDisc object
        DigitalVideoDisc dvd = new DigitalVideoDisc(title, category, "Unknown", 120, cost);

        // Add the new DVD to the store
        store.addMedia(dvd);

        // Show a confirmation message to the user
        JOptionPane.showMessageDialog(this, "DVD added to store!");
    }
}
