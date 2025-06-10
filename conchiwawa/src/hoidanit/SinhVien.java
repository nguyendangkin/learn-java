package hoidanit;

public class SinhVien {
    private String maSoVinhVien;
    private String hoTen;
    private double diem;
    private int tuoi;

    public SinhVien(String maSoVinhVien, String hoTen, double diem, int tuoi) {
        this.maSoVinhVien = maSoVinhVien;
        this.hoTen = hoTen;
        this.diem = diem;
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "SinhVien [maSoVinhVien=" + maSoVinhVien + ", hoTen=" + hoTen + ", diem=" + diem + ", tuoi=" + tuoi
                + "]";
    }

    public String getMaSoVinhVien() {
        return maSoVinhVien;
    }

    public void setMaSoVinhVien(String maSoVinhVien) {
        this.maSoVinhVien = maSoVinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

}
