import javax.swing.JOptionPane;

public class ShowTwoNumbers {
    public static void main(String[] args) {
        String s1, s2;
        String notiMessage = "You've just entered: ";
        // parent box, content, title box, type notice box
        s1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number:",
                JOptionPane.INFORMATION_MESSAGE);
        notiMessage += s1 + " and ";
        s2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number:",
                JOptionPane.INFORMATION_MESSAGE);
        notiMessage += s2;
        JOptionPane.showMessageDialog(null, notiMessage, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
