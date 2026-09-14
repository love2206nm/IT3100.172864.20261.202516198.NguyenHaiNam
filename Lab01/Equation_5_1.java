import javax.swing.JOptionPane;

public class Equation_5_1 {

    public static void main(String[] args) {
        // Input first number from user
        String strNum1 = JOptionPane.showInputDialog(
                null,
                "Please input the first number: ",
                "Input first number",
                JOptionPane.INFORMATION_MESSAGE
        );
        double num1 = Double.parseDouble(strNum1);

        // Input second number from user
        String strNum2 = JOptionPane.showInputDialog(
                null,
                "Please input the second number: ",
                "Input second number",
                JOptionPane.INFORMATION_MESSAGE
        );
        double num2 = Double.parseDouble(strNum2);

        // Calculate sum, difference, and product
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        // Prepare result string
        String result = "First number: " + num1 + "\n"
                + "Second number: " + num2 + "\n"
                + "Sum: " + sum + "\n"
                + "Difference: " + difference + "\n"
                + "Product: " + product + "\n";

        // Check the divisor before calculating quotient
        if (num2 == 0) {
            result += "Quotient: Cannot divide by zero (divisor is 0)!";
        } else {
            double quotient = num1 / num2;
            result += "Quotient: " + quotient;
        }

        // Display results in a dialog box
        JOptionPane.showMessageDialog(
                null,
                result,
                "Calculation Results",
                JOptionPane.INFORMATION_MESSAGE
        );

        System.exit(0);
    }
}
