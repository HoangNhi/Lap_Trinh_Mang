package java49;

import java.util.Scanner;

public class Vidu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;

        System.out.print("Nhap vao chuoi: ");
        s = sc.nextLine();

        System.out.println("\n-----\n");
        //Ham length(): Lay do dai chuoi
        System.out.println("s.length(): " + s.length());
        int length = s.length();

        //Ham charAt(Index) => lay ra 1 ky tu cua chuoi s tai Index
        System.out.println("\n-----\n");
        System.out.println("s.charAt(index):");
        for(int i=0;i<length;i++){
            System.out.println("s.charAt("+i+"): " + s.charAt(i));
        }

        // Ham getChars(vi tri bat dau, vi tri ket thuc,
        // mang luu du lieu, vi tri bat dau cau mang);
        char[] arrayChar = new char[20];
        s.getChars(2,4,arrayChar,0);
        for(int i=0;i< arrayChar.length;i++){
            System.out.println("Gia tri cua mang tai " + i + " la: " + arrayChar[i]);
        }

        byte[] arrayBytes = s.getBytes();
        for (byte b: arrayBytes){
            System.out.println(b);
        }
    }
}
