package java16;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        double r, dienTich, chuVi;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ban kinh r: ");
        r = sc.nextDouble();

        System.out.println("-----");
        System.out.println("Chu vi = " + (2.0*r*Math.PI));
        System.out.println("Math.Round(Chu vi) = " + Math.round(2.0*r*Math.PI));
        System.out.println("Dien tich = " + (Math.pow(r,2)*Math.PI));
        System.out.println("Math.Round(Dien tich) = " + Math.round(Math.pow(r,2)*Math.PI));
    }
}
