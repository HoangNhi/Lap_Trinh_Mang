package Java17;

import java.util.Scanner;

public class PhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chuong trình giai phuong trình bac nhat");
        System.out.println("-     ax + b = 0     -");
        System.out.println("\nNhap so nguyen a va b: ");
        int a = sc.nextInt(), b = sc.nextInt();

        System.out.println("-----");
        System.out.println("Giai phuong trinh: " + a + "x + " + b + " = 0");

        if(a == 0){
            if(b == 0){
                System.out.println("Phuong trinh co vo so nghiem");
            }else{
                System.out.println("Phuong trinh vo nghiem");
            }
        }else{
            if(b==0){
                System.out.println("Phuong trinh co 1 nghiem la: 0");
            }else{
                System.out.println("Phuong trinh co 1 nghiem la: " + (-1.0*b/a));
            }
        }
    }
}
