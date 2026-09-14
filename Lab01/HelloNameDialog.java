import javax.swing.JOptionPane;

public class HelloNameDialog {

    public static void main(String[] inpu_string) { // static la de JVM goi truc tiep den ham nay
        String results;
        results = JOptionPane.showInputDialog("Please enter your name:");
        JOptionPane.showMessageDialog(null, "Hi" + results + "!");
        System.exit(0);
    }
}