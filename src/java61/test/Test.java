package java61.test;

import java61.code.QuanLySinhVien;
import java61.code.Student;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        QuanLySinhVien ds = new QuanLySinhVien();

        ds.themSinhVien(new Student("00001", "Nguyen Van An", 2003, 3.1));
        ds.themSinhVien(new Student("00002", "Nguyen Van Binh", 2003, 2));
        ds.themSinhVien(new Student("00003", "Nguyen Van C", 2003, 4));

        Scanner sc = new Scanner(System.in);
        String maSo = "";
        int luaChon = 0;
        do{
            System.out.println("----- Menu -----");
            System.out.println("" +
                    "1. Them sinh vien vao danh sach \n" +
                    "2. In danh sach sinh vien ra man hinh\n" +
                    "3. Kiem tra danh sach co rong hay khong\n" +
                    "4. Lay ra so luong sinh vien trong danh sach\n" +
                    "5. Lam rong danh sach sinh vien\n" +
                    "6. Kiem tra sinh vien co ton tai trong danh sach hay khong, dua tren ma sinh vien\n" +
                    "7. Xoa mot sinh vien ra khoi danh sach dua tren ma sinh vien\n" +
                    "8. Tim kiem tat ca sinh vien dua tren Ten duoc nhap tu ban phim\n" +
                    "9. Xuat ra danh sach sinh vien co diem tu cao den thap\n" +
                    "0. Thoat chuong trinh");
            System.out.print("\nLua chon cua ban (1-9): ");
            luaChon = sc.nextInt();
            switch (luaChon){
                case 1:
                    Student sv = new Student();
                    System.out.print("Nhap ma sinh vien: ");
                    sv.setMaSinhVien(sc.next());
                    System.out.print("Nhap ten sinh vien: ");
                    sc.nextLine();
                    sv.setHoVaTen(sc.nextLine());
                    System.out.print("Nhap nam sinh: ");
                    sv.setNamSinh(sc.nextInt());
                    System.out.print("Nhap diem trung binh: ");
                    sv.setDiemTrungBinh(sc.nextDouble());
                    System.out.println("sv: " + sv);
                    ds.themSinhVien(sv);
                    break;
                case 2:
                    System.out.println("Danh sach sinh vien:");
                    if(ds.kiemTraDanhSachRong()){
                        System.out.println("Danh sach sinh vien rong");
                    }else{
                        ds.inDanhSachSinhVien();
                    }
                    break;
                case 3:
                    System.out.println("Kiem tra danh sach: " + (ds.kiemTraDanhSachRong()? "Rong" : "Khong rong"));
                    break;
                case 4:
                    System.out.println("So luong sinh vien trong danh sach: " + ds.laySoLuongSinhVien());
                    break;
                case 5:
                    System.out.println("Lam rong danh sach sinh vien");
                    ds.lamRongDanhSach();
                    if(ds.kiemTraDanhSachRong()){
                        System.out.println("Thanh cong");
                    }else{
                        System.out.println("That bai");
                    }
                    break;
                case 6:
                    System.out.println("\nKiem tra sinh vien co ton tai trong danh sach hay khong, dua tren ma so sinh vien\n");
                    System.out.print("Nhap ma so sinh vien can kiem tra: ");
                    maSo = sc.next();
                    if(ds.kiemTraTonTai(maSo) == null){
                        System.out.println("Sinh vien khong ton tai");
                    }else{
                        System.out.println(ds.kiemTraTonTai(maSo));
                    }
                    break;
                case 7:
                    System.out.println("Xoa mot sinh vien ra khoi danh sach, dua tren ma sinh vien\n");
                    System.out.print("Nhap ma sinh vien can xoa: ");
                    maSo = sc.next();
                    if(ds.kiemTraTonTai(maSo) == null){
                        System.out.println("Sinh vien khong ton tai");
                    }else{
                        ds.xoaSinhVIen(ds.kiemTraTonTai(maSo));
                        System.out.println("Thanh cong");
                    }
                    break;
                case 8:
                    System.out.println("Tim kiem tat ca sinh vien dua tren Ten duoc nhap tu ban phim\n");
                    System.out.print("Nhap Ten sinh vien can kiem tra: ");
                    sc.next();
                    String ten = sc.nextLine();
                    System.out.println("Ket qua");
                    ds.timSinhVien(ten);
                    break;
                case 9:
                    System.out.println("Xuat ra danh sach sinh vien co diem tu den thap\n");
                    System.out.println("Danh sach: ");
                    ds.sapXepSinhVienGiamDanTheoDiem();
                    break;
            }
            System.out.println("\nBan co muon tiep tuc khong: ");
            System.out.println("1: Co");
            System.out.println("0: Khong");
            System.out.print("Lua chon cua ban: ");
            luaChon = sc.nextInt();
            if (luaChon == 0){
                break;
            }
        }while (luaChon!=0);
        System.out.println("\nTam biet");
    }
}
