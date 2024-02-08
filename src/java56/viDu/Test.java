package java56.viDu;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String s = "Xin chao cac ban, tui la Peter";

        String[] a = s.split(" ");
        System.out.println(Arrays.toString(a));

        String[] b = s.split(",");
        System.out.println(Arrays.toString(b));

        String s2 = "Xin chao, minh la Peter. Minh la lap trinh vien";
        String[] c = s2.split("\\.|\\,");
        System.out.println(Arrays.toString(c));

        String s3 = "Nguyen Van A";
        String ten = s3.trim().split(" ")[s3.trim().split(" ").length - 1];
        System.out.println(ten);
    }
}
