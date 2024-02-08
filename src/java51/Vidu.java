package java51;

public class Vidu {
    public static void main(String[] args) {
        String s1 = "Xin chao co chu, xin chao cac ban, Xin chao";
        String s2 = "Xin chao";
        String s3 = "Xin chao 123";
        char c1 = 'o';

        // Ham indexOf
        System.out.println("s1.indexOf(s2): " + s1.indexOf(s2)); // Index: 0
        System.out.println("s1.indexOf(s3): " + s1.indexOf(s3)); // Index: -1

        // Su dung vi tri bat dau
        System.out.println("Vi tri cua s2 trong s1 la: " + s1.indexOf(s2, 2));

        // Tim kiem char
        System.out.println("Vi tri cua c1 trong s1 la: " + s1.indexOf(c1));
        System.out.println("Vi tri cua c1 trong s1 la: " + s1.indexOf(s2, 20));

        // Ham lastIndexOf
        // Tim kiem tu cuoi chuoi len dau chuoi
        System.out.println("s1.lastIndexOf(s2): " + s1.lastIndexOf(s2));
    }
}
