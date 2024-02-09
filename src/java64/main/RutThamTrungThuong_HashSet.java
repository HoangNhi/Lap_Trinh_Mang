package java64.main;

import java.util.*;

public class RutThamTrungThuong_HashSet {
    Set<String> thungPhieuDuThuong = new HashSet<String>();
    public RutThamTrungThuong_HashSet() {}

    // Them Phieu
    public boolean themPhieu(String giaTri){
        return this.thungPhieuDuThuong.add(giaTri);
    }

    // Xoa Phieu
    public boolean xoaPhieu(String giaTri){
        return this.thungPhieuDuThuong.remove(giaTri);
    }

    // Kiem Tra Phieu
    public boolean kiemTraPhieuTonTai(String giaTri){
        return this.thungPhieuDuThuong.contains(giaTri);
    }

    // Xoa Tat Ca Phieu
    public void xoaTatCaPhieuDuThuong(){
        this.thungPhieuDuThuong.clear();
    }

    // Lay So Luong Phieu
    public int laySoLuong(){
        return this.thungPhieuDuThuong.size();
    }

    // Rut Tham
    public String rutMotPhieu(){
        String res = "";
        Random rd = new Random();
        int index = rd.nextInt(laySoLuong());
        res = this.thungPhieuDuThuong.toArray()[index] + "";
        return res;
    }

    // In Tat Ca Phieu
    public void inTatCa(){
        System.out.println(Arrays.toString(this.thungPhieuDuThuong.toArray()));
    }
    public static void main(String[] args) {
        String ma;
        RutThamTrungThuong_HashSet rt = new RutThamTrungThuong_HashSet();
        Scanner sc = new Scanner(System.in);
        int luaChon = 0;
        Program: do{
            System.out.println("----------");
            System.out.println("Menu: ");
            System.out.println("1. Them ma du thuong");
            System.out.println("2. Xoa ma du thuong");
            System.out.println("3. Kiem tra ma du thuong co ton tai hay khong");
            System.out.println("4. Xoa tat ca cac phieu du thuong");
            System.out.println("5. So luong phieu du thuong");
            System.out.println("6. Rut tham trung thuong");
            System.out.println("7. In ra tat ca cac phieu");
            System.out.println("0. Thoat khoi chuong trinh");

            System.out.print("Lua chon cua ban (0-7): ");
            luaChon = sc.nextInt();

            switch (luaChon){
                case 1:
                    System.out.println("\n1. Them ma so du thuong");
                    System.out.print("Nhap ma so du thuong cua ban: ");
                    ma = sc.next();
                    rt.themPhieu(ma);
                    break;
                case 2:
                    System.out.println("\n2. Xoa ma du thuong");
                    System.out.print("Nhap ma du thuong can xoa: ");
                    ma = sc.next();
                    if(rt.xoaPhieu(ma)){
                        System.out.println("Thanh cong!");
                    }else{
                        System.out.println("That bai!");
                    }
                    break;
                case 3:
                    System.out.println("\n3. Kiem tra ma so du thuong co ton tai hay khong");
                    System.out.print("Nhap ma du thuong can kiem tra: ");
                    ma = sc.next();
                    if(rt.kiemTraPhieuTonTai(ma)){
                        System.out.println("Ma co ton tai");
                    }else{
                        System.out.println("Ma khong ton tai");
                    }
                    break;
                case 4:
                    System.out.println("\b4. Xoa tat ca cac phieu du thuong");
                    rt.xoaTatCaPhieuDuThuong();
                    System.out.println("Da xoa tat ca phieu du thuong");
                    break;
                case 5:
                    System.out.println("\n5. So luong phieu du thuong");
                    System.out.println("Ket qua: " + rt.laySoLuong());
                    break;
                case 6:
                    System.out.println("\n6. Rut tham trung thuong");
                    System.out.println("Ma so trung thuong la: " + rt.rutMotPhieu());
                    break;
                case 7:
                    System.out.println("\n7. In ra tat ca cac phieu");
                    rt.inTatCa();
                    break;
                case 0:
                    break Program;
            }

            System.out.println("\nBan co muon tiep tuc khong?");
            System.out.println("1. Co");
            System.out.println("2. Khong");
            luaChon = sc.nextInt();
        }while(luaChon!=0);
        System.out.println("\nHave a good day!");
    }
}
