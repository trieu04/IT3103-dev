package hust.soict.dsai.swingg;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class NumberGrid extends JFrame {
    private JButton[] btnNumbers = new JButton[10];
    private JButton btnDelete, btnReset;
    private JTextField tfDisplay;

    public NumberGrid() {
        tfDisplay = new JTextField();
        tfDisplay.setEditable(false);
        tfDisplay.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        JPanel panelButtons = new JPanel(new GridLayout(4, 3));
        addButtons(panelButtons);

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(tfDisplay, BorderLayout.NORTH);
        cp.add(panelButtons, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Number Grid");
        setSize(200, 200);
        setVisible(true);
    }

    private void addButtons(JPanel panel) {
        for (int i = 1; i < 10; i++) {
            btnNumbers[i] = new JButton(String.valueOf(i));
            panel.add(btnNumbers[i]);
            btnNumbers[i].addActionListener(new ButtonListener(tfDisplay));
        }

        btnReset = new JButton("C");
        panel.add(btnReset);
        btnReset.addActionListener(new ButtonListener(tfDisplay));

        btnNumbers[0] = new JButton("0");
        panel.add(btnNumbers[0]);
        btnNumbers[0].addActionListener(new ButtonListener(tfDisplay));

        btnDelete = new JButton("DEL");
        panel.add(btnDelete);
        btnDelete.addActionListener(new ButtonListener(tfDisplay));
    }

    private static class ButtonListener implements ActionListener {
        private JTextField tfDisplay;

        public ButtonListener(JTextField tfDisplay) {
            this.tfDisplay = tfDisplay;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            switch (command) {
                case "C":
                    tfDisplay.setText("");
                    break;

                case "DEL":
                    String currentText = tfDisplay.getText();
                    if (!currentText.isEmpty()) {
                        tfDisplay.setText(currentText.substring(0, currentText.length() - 1));
                    }
                    break;

                default:
                    tfDisplay.setText(tfDisplay.getText() + command); // Append the digit to the display
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new NumberGrid();
    }
}
