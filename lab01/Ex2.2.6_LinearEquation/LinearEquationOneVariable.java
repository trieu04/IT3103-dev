import javax.swing.JOptionPane;

public class LinearEquationOneVariable {
	
    public static void main(String[] args) {
        String strA = JOptionPane.showInputDialog("ax + b = 0\nInput a: ");
        double a = Double.parseDouble(strA);
        
        String strB = JOptionPane.showInputDialog( "ax + b = 0\nInput b: ");
        double b = Double.parseDouble(strB);

        if (a == 0) {
        	JOptionPane.showMessageDialog(null, "a cannot be 0.");
        } else {
            double x = -b / a;
            JOptionPane.showMessageDialog(null, "The solution is x = " + x);
        }

    }
}
