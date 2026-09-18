import java.util.Arrays;
import java.util.Scanner;

public class SortAndCalculateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ban muon nhap mang tu ban phim (1) hay dung mang mac dinh (2)?");
        int choice = scanner.nextInt();

        double[] my_array1;

        if (choice == 1) {
            System.out.print("Nhap so luong phan tu: ");
            int n = scanner.nextInt();
            my_array1 = new double[n];
            System.out.println("Nhap cac phan tu cua mang:");
            for (int i = 0; i < n; i++) {
                my_array1[i] = scanner.nextDouble();
            }
        } else {
            my_array1 = new double[] { 1789, 2035, 1899, 1456, 2013 };
        }

        System.out.println("\nMang ban dau: " + Arrays.toString(my_array1));

        Arrays.sort(my_array1);
        System.out.println("Mang sau khi sap xep: " + Arrays.toString(my_array1));

        double sum = 0;
        for (double cost : my_array1) {
            sum += cost;
        }

        double average = sum / my_array1.length;

        System.out.println("Tong (Sum): " + sum);
        System.out.println("Trung binh (Average): " + average);

        scanner.close();
    }
}