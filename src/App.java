
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int soDien;
        int tien;
        System.out.println("Nhap vao so dien cua ban:");
        soDien = scanner.nextInt();
        if (soDien <= 100) {
            tien = soDien * 1000;
        } else {
            tien = soDien * 1000 + (soDien - 100) * 1500;
        }

        System.out.println("So tien ban phai tra la: " + tien);

        scanner.close();
    }
}
