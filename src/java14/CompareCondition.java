package java14;

import java.util.Scanner;

public class CompareCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a va b: ");
        int a = sc.nextInt(), b = sc.nextInt();

        System.out.println("-----");
        System.out.println(a + " == " + b + " : " + (a==b));
        System.out.println(a + " != " + b + " : " + (a!=b));
        System.out.println(a + " < " + b + " : " + (a<b));
        System.out.println(a + " <= " + b + " : " + (a<=b));
        System.out.println(a + " > " + b + " : " + (a>b));
        System.out.println(a + " >= " + b + " : " + (a>=b));
        System.out.println("-----");
        System.out.println("Ca hai so la so chan: " + (a%2==0 && b%2==0 ? true : false));
        System.out.println("Co it nhat 1 so chan: " + (a%2==0 || b%2==0 ? true : false));
    }
}
