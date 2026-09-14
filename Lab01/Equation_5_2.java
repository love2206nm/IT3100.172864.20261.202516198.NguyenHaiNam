import javax.swing.JOptionPane;

public class Equation_5_2 {

    public static void main(String[] args) {
        // Menu to choose the type of equation
        String menu = "Please choose the equation type to solve:\n"
                + "1. First-degree equation with one variable (ax + b = 0)\n"
                + "2. System of first-degree equations with two variables\n"
                + "3. Second-degree equation with one variable (ax^2 + bx + c = 0)";

        String strChoice = JOptionPane.showInputDialog(
                null,
                menu,
                "Equation Solver Menu",
                JOptionPane.QUESTION_MESSAGE);

        if (strChoice == null) {
            System.exit(0);
        }

        int choice = Integer.parseInt(strChoice);

        switch (choice) {
            case 1:
                solveLinearEquation();
                break;
            case 2:
                solveLinearSystem();
                break;
            case 3:
                solveQuadraticEquation();
                break;
            default:
                JOptionPane.showMessageDialog(
                        null,
                        "Invalid choice! Please choose 1, 2, or 3.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
        }

        System.exit(0);
    }

    // 1. Solve: ax + b = 0
    private static void solveLinearEquation() {
        String strA = JOptionPane.showInputDialog(null, "Equation: ax + b = 0\nEnter coefficient a:", "Input a",
                JOptionPane.INFORMATION_MESSAGE);
        double a = Double.parseDouble(strA);

        String strB = JOptionPane.showInputDialog(null, "Equation: ax + b = 0\nEnter coefficient b:", "Input b",
                JOptionPane.INFORMATION_MESSAGE);
        double b = Double.parseDouble(strB);

        String result;
        if (a == 0) {
            if (b == 0) {
                result = "The equation has infinitely many solutions.";
            } else {
                result = "The equation has no solution.";
            }
        } else {
            double x = -b / a;
            result = "The equation has a unique solution:\nx = " + x;
        }

        JOptionPane.showMessageDialog(null, result, "Result: Linear Equation", JOptionPane.INFORMATION_MESSAGE);
    }

    // 2. Solve:
    // a11*x1 + a12*x2 = b1
    // a21*x1 + a22*x2 = b2
    private static void solveLinearSystem() {
        double a11 = Double.parseDouble(JOptionPane.showInputDialog("Enter a11:"));
        double a12 = Double.parseDouble(JOptionPane.showInputDialog("Enter a12:"));
        double b1 = Double.parseDouble(JOptionPane.showInputDialog("Enter b1:"));

        double a21 = Double.parseDouble(JOptionPane.showInputDialog("Enter a21:"));
        double a22 = Double.parseDouble(JOptionPane.showInputDialog("Enter a22:"));
        double b2 = Double.parseDouble(JOptionPane.showInputDialog("Enter b2:"));

        // Determinants
        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        String result;
        if (D != 0) {
            double x1 = D1 / D;
            double x2 = D2 / D;
            result = "The system has a unique solution:\n"
                    + "x1 = " + x1 + "\n"
                    + "x2 = " + x2;
        } else {
            if (D1 == 0 && D2 == 0) {
                result = "The system has infinitely many solutions.";
            } else {
                result = "The system has no solution.";
            }
        }

        JOptionPane.showMessageDialog(null, result, "Result: Linear System", JOptionPane.INFORMATION_MESSAGE);
    }

    // 3. Solve: ax^2 + bx + c = 0
    private static void solveQuadraticEquation() {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Equation: ax^2 + bx + c = 0\nEnter coefficient a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Equation: ax^2 + bx + c = 0\nEnter coefficient b:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Equation: ax^2 + bx + c = 0\nEnter coefficient c:"));

        String result;
        if (a == 0) {
            // Degenerates to linear equation: bx + c = 0
            if (b == 0) {
                if (c == 0) {
                    result = "With a = 0, b = 0, c = 0:\nThe equation has infinitely many solutions.";
                } else {
                    result = "With a = 0, b = 0, c != 0:\nThe equation has no solution.";
                }
            } else {
                double x = -c / b;
                result = "With a = 0, this is a linear equation (bx + c = 0).\nUnique solution:\nx = " + x;
            }
        } else {
            double delta = b * b - 4 * a * c;

            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                result = "The equation has two distinct real roots:\n"
                        + "x1 = " + x1 + "\n"
                        + "x2 = " + x2;
            } else if (delta == 0) {
                double x = -b / (2 * a);
                result = "The equation has a double root:\n"
                        + "x1 = x2 = " + x;
            } else {
                result = "Delta = " + delta + " < 0.\nThe equation has no real root.";
            }
        }

        JOptionPane.showMessageDialog(null, result, "Result: Quadratic Equation", JOptionPane.INFORMATION_MESSAGE);
    }
}
