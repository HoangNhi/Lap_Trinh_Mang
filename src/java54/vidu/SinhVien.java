package java54.vidu;

public class SinhVien implements Comparable<SinhVien> {
    private int maSinhVien;
    private String hoVaTen;
    private String tenLop;
    private double diemTrungBinh;

    public SinhVien(int maSinhVien, String hoVaTen, String tenLop, double diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.tenLop = tenLop;
        this.diemTrungBinh = diemTrungBinh;
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getTen(){
        String res = getHoVaTen().trim();
        return res.substring(res.lastIndexOf(" ") + 1);
    }
    @Override
    public int compareTo(SinhVien o) {
        // <0
        // =0
        // >0
        return getTen().compareTo(o.getTen());
    }
}
