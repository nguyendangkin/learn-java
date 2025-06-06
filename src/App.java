import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen: ");
        int n = scanner.nextInt();

        System.out.printf("Nhap so luong phan tu mang ma ban muon: ");
        n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Phan tu thu " + (i + 1));
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        Arrays.sort(numbers);
        System.out.println("Mang da xap xep la: " + Arrays.toString(numbers));

        int minValue = numbers[0];
        int maxValue = numbers[numbers.length - 1];

        System.out.println("gia tri lon nhat: " + maxValue);
        System.out.println("gia tri nho nhat: " + minValue);

    }

}