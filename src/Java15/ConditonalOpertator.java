package Java15;

import java.util.Scanner;

public class ConditonalOpertator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap a:");
        int a = sc.nextInt();

        System.out.println("-----");
        System.out.println(a + " la " + (a%2==0 ? "So chan" : "So le"));
    }
}
