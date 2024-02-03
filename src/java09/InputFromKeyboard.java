package java09;

import java.util.Scanner;

public class InputFromKeyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao ho va ten: ");
        String hoVaTen = sc.nextLine();

        System.out.println("Nhap vao ma sinh vien: ");
        long maSinhVien = sc.nextLong();

        System.out.println("Nhap vao diem thi: ");
        float diemThi = sc.nextFloat();
        // Remember Input Valid is '3,45' not '3.45'

        System.out.println("----------------------");
        System.out.println("Ho va ten: " + hoVaTen);
        System.out.println("Ma sinh vien: " + maSinhVien);
        System.out.println("Diem thi: " + diemThi);
    }
}
