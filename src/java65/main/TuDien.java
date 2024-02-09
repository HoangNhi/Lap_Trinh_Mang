package java65.main;

import java.util.*;

public class TuDien {
    private Map<String, String> data = new TreeMap<String, String>();
    public TuDien() {}

    public String themTu(String key, String value){
        return this.data.put(key, value);
    }

    public String xoaTu(String key){
        return this.data.remove(key);
    }

    public String traTu(String key){
        return data.get(key);
    }

    public void inTuKhoa(){
        Set<String> tapHopTuKhoa = this.data.keySet();
        System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
    }

    public int soLuong(){
        return data.size();
    }

    public void xoaTatCa(){
        data.clear();
    }

    public static void main(String[] args) {
        TuDien td = new TuDien();
        Scanner sc = new Scanner(System.in);
        int luaChon = 0;
        String key, value;
        Start: do {
            System.out.println("\n---------");
            System.out.println("Menu");
            System.out.println("----- Tra tu dien Anh - Viet -----");
            System.out.println("1. Them tu (tu khoa, y nghia)");
            System.out.println("2. Xoa tu");
            System.out.println("3. Tra tu");
            System.out.println("4. In danh sach tu khoa");
            System.out.println("5. In so luong tu khoa");
            System.out.println("6. Xoa tat ca tu khoa");
            System.out.println("0. Thoat chuong trinh");

            System.out.print("\nLua chon cua ban: ");
            luaChon = sc.nextInt();
            sc.nextLine();
            switch (luaChon){
                case 1:
                    System.out.println("\n1. Them tu (tu khoa, y nghia)");
                    System.out.print("Nhap tu khoa: ");
                    key = sc.nextLine();
                    System.out.print("Nhap y nghia: ");
                    value = sc.nextLine();
                    td.themTu(key, value);
                    System.out.println("\nThanh cong");
                    break;
                case 2:
                    System.out.println("\n2. Xoa tu");
                    System.out.print("Nhap tu khoa can xoa: ");
                    key = sc.nextLine();
                    td.xoaTu(key);
                    System.out.println("\nThanh cong");
                    break;
                case 3:
                    System.out.println("\n3. Tra tu");
                    System.out.print("Nhap tu can tra: ");
                    key = sc.nextLine();
                    System.out.print("Ket qua: " + td.traTu(key));
                    break;
                case 4:
                    System.out.println("\n4. In danh sach tu khoa");
                    System.out.println("Ket qua: ");
                    td.inTuKhoa();
                    break;
                case 5:
                    System.out.println("\n5. In so luong tu khoa");
                    System.out.println("Ket qua: " + td.soLuong());
                    break;
                case 6:
                    System.out.println("\n6. Xoa tat ca tu khoa");
                    td.xoaTatCa();
                    System.out.println("\nThanh cong");
                    break;
                case 0:
                    break Start;
            }

            System.out.println("\n\nBan co muon tiep tuc khong?");
            System.out.println("1. Co");
            System.out.println("2. Khong");
            System.out.print("\nLua chon cua ban: ");
            luaChon = sc.nextInt();

        }while(luaChon!=0);

        System.out.println("\nHave a good day!");
    }
}
