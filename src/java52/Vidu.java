package java52;

public class Vidu {
    public static void main(String[] args) {
        String s1 = "tItv";
        String s2 = ".Vn";

        String s3 = s1 + s2;

        // Ham concat => noi chuoi
        String s4 = s1.concat(s2);
        System.out.println("s3: " + s3);
        System.out.println("s4: " + s4);

        // Ham replace => thay the
        String s5 = "Tung.vn";
        String s6 = s5.replace("Tung", "TITV");
        System.out.println("s6: " + s6);

        // Ham toLowerCase
        // Ham toUpperCase
        String s7 = s3.toLowerCase();
        String s8 = s3.toUpperCase();
        System.out.println("s7: " + s7);
        System.out.println("s8: " + s8);

        // Ham trim()
        // Xoa khoang trang du thua o dau va cuoi chuoi
        String s9 = "     Xin chao cac ban, minh la Titv.vn     ";
        System.out.println(s9.trim());

        // subString => cat chuoi con
        String s10 = "Xin chao cac ban, minh la TITV.vn";
        String s11 = s10.substring(10);
        String s12 = s10.substring(10,15);
        System.out.println("s11: " + s11);
        System.out.println("s12: " + s12);
    }
}
