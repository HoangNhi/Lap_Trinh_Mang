package java61.code;

import java.util.Comparator;

public class Student implements Comparator<Student> {
    private String maSinhVien;
    private String hoVaTen;
    private int namSinh;
    private double diemTrungBinh;

    public Student(){}

    public Student(String maSinhVien, String hoVaTen, int namSinh, double diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.namSinh = namSinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getTen(){
        return getHoVaTen().trim().split(" ")[getHoVaTen().trim().split(" ").length - 1];
    }

    @Override
    public String toString() {
        return "Student{" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", namSinh=" + namSinh +
                ", diemTrungBinh=" + diemTrungBinh +
                '}';
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getDiemTrungBinh() <= o2.getDiemTrungBinh() ? 1 : -1;
    }
}
