import javax.swing.JOptionPane;

public class ArithmeticOperations {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Enter the first number:");
        double num1 = Double.parseDouble(input1);

        String input2 = JOptionPane.showInputDialog("Enter the second number:");
        double num2 = Double.parseDouble(input2);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = 0.0;

        String result;

        if (num2 != 0) {
            quotient = num1 / num2;
            result = "Sum: " + sum + "\n"
                    + "Difference: " + difference + "\n"
                    + "Product: " + product + "\n"
                    + "Quotient: " + quotient;
        } else {
            result = "Sum: " + sum + "\n"
                    + "Difference: " + difference + "\n"
                    + "Product: " + product + "\n"
                    + "Quotient: Division by zero is undefined.";
        }

        JOptionPane.showMessageDialog(null, result);
    }
}
