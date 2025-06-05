import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
        System.out.println("++ ---------------------------------- ++");
        System.out.println("| 1. Giải phương trình bậc nhất       |");
        System.out.println("| 2. Giải phương trình bậc hai        |");
        System.out.println("| 3. Tính số tiền điện                |");
        System.out.println("| 4. Kết thúc                         |");
        System.out.println("++ ---------------------------------- ++");

        System.out.print("Nhập lựa chọn: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Bạn đã chọn giải phương trình bậc nhất!");
                // Thêm code xử lý phương trình bậc nhất ở đây
                break;
            case 2:
                System.out.println("Bạn đã chọn giải phương trình bậc hai!");
                // Thêm code xử lý phương trình bậc hai ở đây
                break;
            case 3:
                System.out.println("Nhập vào số điện của bạn:");
                int soDien = scanner.nextInt();
                int tien;

                if (soDien <= 100) {
                    tien = soDien * 1000;
                } else {
                    tien = 100 * 1000 + (soDien - 100) * 1500;
                }

                System.out.println("Số tiền bạn phải trả là: " + tien);
                break;
            case 4:
                System.out.println("Chương trình kết thúc.");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
        }

        scanner.close();
    }
}