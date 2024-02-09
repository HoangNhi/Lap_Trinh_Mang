package java62.main;

import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        // Stack - Last In First Out
        Scanner sc = new Scanner(System.in);
        Stack<String> stackChuoi = new Stack<String>();

//        stackChuoi.push("giaitri"); // Dua gia tri vao stack
//        stackChuoi.pop(); // Lay gia tri ra
//        stackChuoi.peek(); // Lay gia tri ra nhunng khong xoa
//        stackChuoi.clear(); // Xoa tat ca phan tu co trong stack
//        stackChuoi.contains("Hello"); // Kiem tra gia tri ton tai trong mang
//        stackChuoi.size(); // Lay do lon (kich thuoc cua stakc)

        // Dao nguoc chuoi
        System.out.print("Nhap vao chuoi: ");
        String s = sc.nextLine();

        for(int i=0;i<s.length();i++){
            stackChuoi.push(s.charAt(i) + "");
        }

        System.out.print("Chuoi dao nguoc: ");
        do{
            System.out.print(stackChuoi.pop());
        }while (!stackChuoi.isEmpty());

        // Dec to Bin
        System.out.print("\nNhap n: ");
        int n = sc.nextInt();
        do{
            stackChuoi.push(n%2+"");
            n/=2;
        }while(n!=0);
        System.out.print("Ket qua: ");
        do{
            System.out.print(stackChuoi.pop());
        }while (!stackChuoi.isEmpty());

    }
}
