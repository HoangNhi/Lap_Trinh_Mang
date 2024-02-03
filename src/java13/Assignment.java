package java13;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a;
        System.out.println("Nhap vao a: ");
        a = sc.nextFloat();
        System.out.println("a = " + a);

        System.out.println("-----");
        System.out.println("a+=3 : " + (a+=3));
        System.out.println("a-=2 : " + (a-=2));
        System.out.println("a*=3 : " + (a*=3));
        System.out.println("a/=3 : " + (a/=3));
        System.out.println("a%=3 : " + (a%=3));
    }
}
