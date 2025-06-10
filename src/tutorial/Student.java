package tutorial;

public class Student extends Person {
    private int mark;
    private String grade;

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student [mark=" + mark + ", grade=" + grade + "]";
    }

    public void setGrade() {
        if (this.mark >= 8) {
            this.grade = "A";
        } else if (this.mark >= 7) {
            this.grade = "B";
        } else if (this.mark >= 6) {
            this.grade = "C";
        } else if (this.mark >= 5) {
            this.grade = "D";
        } else {
            this.grade = "Tach roi!";
        }

    }

    public Student(String id, String name, int age, int mark) {
        super(id, name, age);
        this.mark = mark;

    }

}
