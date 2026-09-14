import javax.swing.JOptionPane;

public class MediaDiscount {

    public static void main(String[] args) {
        String strcost = JOptionPane.showInputDialog("Enter the cost of the media:");
        double cost = Double.parseDouble(strcost);

        if (cost > 20) {
            System.out.println("Discounted");
        } else {
            System.out.println("Full Price");
        }
        System.exit(0);
    }
}
