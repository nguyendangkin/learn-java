package tutorial;

public class SinhVienIt extends SinhVien {
    private double scoreHTML;
    private double scoreJava;

    public double getScoreHTML() {
        return scoreHTML;
    }

    public SinhVienIt(double scoreHTML, double scoreJava) {
        super();
        this.scoreHTML = scoreHTML;
        this.scoreJava = scoreJava;
    }

    public void setScoreHTML(double scoreHTML) {
        this.scoreHTML = scoreHTML;
    }

    public double getScoreJava() {
        return scoreJava;
    }

    public void setScoreJava(double scoreJava) {
        this.scoreJava = scoreJava;
    }

    @Override
    public double getScore() {
        return (this.scoreJava * 2 + this.scoreHTML) / 3;
    }
}
