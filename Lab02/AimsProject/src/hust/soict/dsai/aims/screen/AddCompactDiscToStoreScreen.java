package hust.soict.dsai.aims.screen;

import javax.swing.JOptionPane;

import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.store.Store;

public class AddCompactDiscToStoreScreen extends AddItemToStoreScreen {
    private Store store;

    public AddCompactDiscToStoreScreen(Store store) {
        super("CD");
        this.store = store;
    }

    @Override
    protected void addItem() {
        String title = titleField.getText();
        String category = categoryField.getText();
        float cost = Float.parseFloat(costField.getText());

        CompactDisc cd = new CompactDisc(title, category, cost, "Unknown");
        store.addMedia(cd);
        JOptionPane.showMessageDialog(this, "CD added to store!");
    }
}
