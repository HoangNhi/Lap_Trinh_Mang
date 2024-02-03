package java16;

import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao a va b: ");
        double a = sc.nextDouble(), b = sc.nextDouble();

        System.out.println("-----");
        System.out.println("|a| = " + Math.abs(a));
        System.out.println("min(a,b) = " + Math.min(a,b));
        System.out.println("max(a,b) = " + Math.max(a,b));
        System.out.println("ceil(a) = " + Math.ceil(a));
        System.out.println("floor(a) = " + Math.floor(a));
        System.out.println("sqrt(a) = " + Math.sqrt(a));
        System.out.println("a^b = " + Math.pow(a,b));
    }
}
