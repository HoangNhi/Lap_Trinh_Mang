package Java17;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen n: ");
        int n = sc.nextInt();

        System.out.println("-----");
        if(n%2==0){
            System.out.println(n + " la so chan");
        }else{
            System.out.println(n + " la so le");
        }
    }
}
