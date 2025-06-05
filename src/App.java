
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vui long nhap so nguyen a:");
        a = scanner.nextInt();
        System.out.println("Vui long nhap so nguyen b:");
        b = scanner.nextInt();

        if (a == 0 && b == 0) {
            System.out.println("Phuong trinh co vo so nghiem");
        } else if (a == 0 && b != 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else {
            double x = -(double) b / a;
            System.out.println("Phuong trinh co nghiem x la: " + x);
        }

        scanner.close();
    }
}
