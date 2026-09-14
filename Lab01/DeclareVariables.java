import javax.swing.JOptionPane;

public class DeclareVariables {

    public static void main(String[] args) {
        String title = "The Lion King";
        double cost = 19.95;
        boolean isAvailable = true;
        int id = 1;

        System.out.println(title);
        System.out.println(cost);
        System.out.println(id);
        System.out.println(isAvailable);

        int round_cost = (int) cost;
        System.out.println(round_cost);
        // _____Answering the question: Rounding down because the machine cut down the
        // bit of the Ram
    }
}
