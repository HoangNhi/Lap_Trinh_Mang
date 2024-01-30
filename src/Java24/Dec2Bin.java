package Java24;

import java.util.Scanner;

public class Dec2Bin {
    public static void main(String[] args) {
        StringBuilder res = new StringBuilder();
        System.out.println("Chuong trinh chuyen doi so thap phan sang nhi phan");
        System.out.print("Nhap so nguyen n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n>0){
            int m = n%2;
            res.append(m);
            n/=2;
        }
        System.out.println("Ket qua: " + res.reverse());
    }
}
