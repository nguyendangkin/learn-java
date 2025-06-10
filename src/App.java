
import tutorial.Student;

public class App {
    public static void main(String[] args) {
        Student st1 = new Student("12", "chin", 22, 3);
        System.out.println(st1);
        st1.setGrade();
        System.out.println(st1);
    }

}
