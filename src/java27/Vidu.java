package java27;

import java.util.Scanner;

public class Vidu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        try {
            System.out.print("Nhap vao so nguyen n: ");
            n = sc.nextInt();
        }catch (Exception e){
            System.out.println("Nhap du lieu khong dung");
        }finally {
            System.out.println("Finnaly");
        }

        System.out.println("Gia tri nhap la: " + n);
        System.out.println("Ket thuc chuong trinh");
    }
}
