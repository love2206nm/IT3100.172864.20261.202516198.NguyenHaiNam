import java.util.Scanner;

public class TriangleDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter height n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        scanner.close();
    }
}