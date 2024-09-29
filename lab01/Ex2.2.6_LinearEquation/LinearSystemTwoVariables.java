import javax.swing.JOptionPane;

public class LinearSystemTwoVariables {
    public static void main(String[] args) {
    	String equationFormMessage = "a11 * x1 + a12 * x2 = b1\na21 * x1 + a22 * x2 = b2\n";
    	
        String inputA11 = JOptionPane.showInputDialog(equationFormMessage + "Enter a11:");
        double a11 = Double.parseDouble(inputA11);

        String inputA12 = JOptionPane.showInputDialog(equationFormMessage + "Enter a12:");
        double a12 = Double.parseDouble(inputA12);

        String inputB1 = JOptionPane.showInputDialog(equationFormMessage + "Enter b1:");
        double b1 = Double.parseDouble(inputB1);

        String inputA21 = JOptionPane.showInputDialog(equationFormMessage + "Enter a21:");
        double a21 = Double.parseDouble(inputA21);

        String inputA22 = JOptionPane.showInputDialog(equationFormMessage + "Enter a22:");
        double a22 = Double.parseDouble(inputA22);

        String inputB2 = JOptionPane.showInputDialog(equationFormMessage + "Enter b2:");
        double b2 = Double.parseDouble(inputB2);

        double determinant = a11 * a22 - a12 * a21;

        if (determinant == 0) {
            JOptionPane.showMessageDialog(null, "Cannot find sollution");
        } else {
            double x1 = (b1 * a22 - b2 * a12) / determinant;
            double x2 = (a11 * b2 - a21 * b1) / determinant;

            JOptionPane.showMessageDialog(null, "The solution is x1 = " + x1 + " and x2 = " + x2);
        }
    }
}
