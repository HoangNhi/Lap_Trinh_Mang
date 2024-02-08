package java61.code;

import javax.swing.text.Style;
import java.util.ArrayList;
import java.util.Collections;

public class QuanLySinhVien {
    private ArrayList<Student> danhSach;

    public QuanLySinhVien(){
        this.danhSach = new ArrayList<Student>();
    }

    public QuanLySinhVien(ArrayList<Student> danhSach){
        this.danhSach = danhSach;
    }

    public ArrayList<Student> getDanhSach() {
        return danhSach;
    }

    public void setDanhSach(ArrayList<Student> danhSach) {
        this.danhSach = danhSach;
    }

    public void themSinhVien(Student sv){
        this.danhSach.add(sv);
    }

    public void inDanhSachSinhVien() {
        for(Student sv : danhSach){
            System.out.println(sv);
        }
    }

    public boolean kiemTraDanhSachRong(){
        return this.danhSach.isEmpty();
    }

    public int laySoLuongSinhVien(){
        return this.danhSach.size();
    }

    public void lamRongDanhSach(){
        this.danhSach.removeAll(getDanhSach());
    }

    public Student kiemTraTonTai(String maSo){
        for(Student sv : danhSach){
            if(sv.getMaSinhVien().compareTo(maSo) == 0){
                return sv;
            }
        }
        return null;
    }

    public boolean xoaSinhVIen(Student sv){
        return this.danhSach.remove(sv);
    }

    public void timSinhVien(String ten){
        for(Student sv : danhSach) {
            if(sv.getHoVaTen().contains(ten)){
                System.out.println(sv);
            }
        }
    }

    public void sapXepSinhVienGiamDanTheoDiem(){
        ArrayList<Student> ds = new ArrayList<Student>(danhSach);
        Collections.sort(ds, new Student());
        for(Student sv : ds){
            System.out.println(sv);
        }
    }

}
