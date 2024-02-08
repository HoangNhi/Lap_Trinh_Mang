package java50;

import java.util.Scanner;

public class Vidu {
    public static void main(String[] args) {
        String s1 = "titv.vn";
        String s2 = "TITV.vn";
        String s3 = "titv.vn";

        // Ham equals => so sanh 2 chuoi giong nhau
        // Co phan biet hoa, thuong
        System.out.println("s1 equals s2: " + s1.equals(s2));
        System.out.println("s1 equals s3: " + s1.equals(s3));

        // Ham equalsIgnoreCase => so sanh 2 chuoi giong nhau
        // Khong phan biet hoa, thuong
        System.out.println("s1 equalsIgnoreCase s2: " + s1.equalsIgnoreCase(s2));
        System.out.println("s1 equalsIgnoreCase s3: " + s1.equalsIgnoreCase(s3));

        // Ham compareTo => so sanh > < =
        String sv1 = "Nguyen Van A";
        String sv2 = "Nguyen Van B";
        String sv3 = "Nguyen Van";
        String sv4 = "Nguyen Van A";

        System.out.println("sv1 compareTo sv2: " + sv1.compareTo(sv2));
        System.out.println("sv1 compareTo sv3: " + sv1.compareTo(sv3));
        System.out.println("sv1 compareTo sv4: " + sv1.compareTo(sv4));

        // Ham compareToIgnoreCase
        System.out.println("sv1 compareToIgnoreCase sv2: " + sv1.compareToIgnoreCase(sv2));
        System.out.println("sv1 compareToIgnoreCase sv3: " + sv1.compareToIgnoreCase(sv3));
        System.out.println("sv1 compareToIgnoreCase sv4: " + sv1.compareToIgnoreCase(sv4));

        // Ham regionMatches => so sanh 1 doan
        String r1 = "TITV.vn";
        String r2 = "TV.v";
        boolean check = r1.regionMatches(2, r2, 0, 4);
        System.out.println(check);

        // Ham startsWith
        // Ham kiem tra chuoi bat dau bang ...
        String sdt = "037457789";
        System.out.println(sdt.startsWith("037"));
        System.out.println(sdt.startsWith("034"));

        // Ham endsWith
        String tenFile = "I love you.JPG";
        String tenFile2 = "Hoc Java.PDF";
        if(tenFile.endsWith(".JPG")){
            System.out.println("File 1 la hinh anh");
        }else{
            System.out.println("File 1 la file PDF");
        }

        if(tenFile2.endsWith(".JPG")){
            System.out.println("File 1 la hinh anh");
        }else{
            System.out.println("File 1 la file PDF");
        }
    }

}
