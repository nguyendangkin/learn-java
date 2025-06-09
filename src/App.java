
import tutorial.SinhVien;
import tutorial.SinhVienCoKhi;
import tutorial.SinhVienIt;

public class App {
    public static void main(String[] args) {
        SinhVien it1 = new SinhVienIt(7, 2);
        System.out.println("DIen sinh vien it: " + it1.getScore());

        SinhVien coKhi1 = new SinhVienCoKhi(22, 33);
        System.out.println("Diem sinh vien co khi: " + coKhi1.getScore());
    }

}
