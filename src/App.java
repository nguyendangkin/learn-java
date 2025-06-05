
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int a;
        int b;
        int c;
        double denTa;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vui long nhap so nguyen a:");
        a = scanner.nextInt();
        System.out.println("Vui long nhap so nguyen b:");
        b = scanner.nextInt();
        System.out.println("Vui long nhap so nguyen c:");
        c = scanner.nextInt();

        if (a == 0 && b == 0) {
            System.out.println("Phuong trinh co vo so nghiem");
        } else if (a == 0 && b != 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else {
            denTa = Math.pow(b, 2) - 4 * a * c;
            int check = (denTa < 0) ? -1 : (denTa > 0) ? 0 : 1;

            switch (check) {
                case -1:
                    System.out.println("Phương trình vô nghiệm");
                    break;
                case 0:
                    double x = -b / (2.0 * a);
                    System.out.println("Phương trình có nghiệm kép: x = " + x);
                    break;
                case 1:
                    double x1 = (-b + Math.sqrt(denTa)) / (2.0 * a);
                    double x2 = (-b - Math.sqrt(denTa)) / (2.0 * a);
                    System.out.println("Phương trình có 2 nghiệm phân biệt: x1 = " + x1 + ", x2 = " + x2);
                    break;
                default:
                    System.out.println("Có lỗi xảy ra");
            }

        }

        scanner.close();
    }
}
