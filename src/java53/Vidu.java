package java53;

import java.util.Arrays;

public class Vidu {
    public static void main(String[] args) {
        // Kieu nguyen thuy
        int[] mang1 = {1,2,3};

        // Copy mang
        int[] mang1_a = mang1; // Gan dia chi cua mang1: [I@6acbcfc0
        mang1_a[0] = 100; // mang1[0] cung se bi thay doi
        System.out.println("Mang 1: " + Arrays.toString(mang1));
        System.out.println("Mang 1_a: " + Arrays.toString(mang1_a));

        int[] mang1_b = mang1.clone();
        mang1_a[0] = 50;
        System.out.println("Mang 1_b: " + Arrays.toString(mang1_b));

        // Copy mang cach 3 - dung ham System.arraycopy
        int[] mang1_c = new int[mang1.length];
        System.arraycopy(mang1, 0, mang1_c, 0, mang1.length);
        mang1_c[0] = 90;
        System.out.println("Mang 1_C: " + Arrays.toString(mang1_c));

        //
        String[] mang_doi_tuong = {"TITV", ".vn"};
    }
}
