package java25;

import java.util.Scanner;

public class Vidu {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Nhap vao n>0: ");
            n = sc.nextInt();
        }while(n<=0);
    }
}
