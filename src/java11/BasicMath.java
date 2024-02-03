package java11;

import java.util.Scanner;

public class BasicMath {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a va b: ");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(a + " + " + b + " = " + (a+b));
        System.out.println(a + " - " + b + " = " + (a-b));
        System.out.println(a + " * " + b + " = " + (a*b));
        System.out.println(a + " / " + b + " = " + (1.0*a/b));
        System.out.println(a + " % " + b + " = " + (a%b));
    }
}
