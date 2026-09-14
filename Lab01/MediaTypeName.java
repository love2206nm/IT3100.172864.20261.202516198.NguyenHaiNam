import javax.swing.JOptionPane;

public class MediaTypeName {

    public static void main(String[] args) {

        String Str_Option = JOptionPane.showInputDialog("Choose a media type (1: DVD, 2: CD, 3: Book): ");

        int Option = Integer.parseInt(Str_Option);

        String MediaType;

        switch (Option) {
            case 1:
                MediaType = "DVD";
                break;
            case 2:
                MediaType = "CD";
                break;
            case 3:
                MediaType = "Book";
                break;
            default:
                MediaType = "Unkown";
        }

        System.out.println("Your media type is: " + MediaType);

        System.exit(0);
    }
}
