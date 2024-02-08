package java55.viDu;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    public static int[] reverse(int[] x){
        int[] res = new int[x.length];
        int index = 0;
        for(int i = x.length - 1; i>=0; i--){
            res[index] = x[i];
            index++;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] a = new int[] {1,8,2,6,4,3,7,9};
        int[] b = new int[15];
        //Ham sap xep
        System.out.println("mang a ban dau: " + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("mang a sau khi sap xep: " + Arrays.toString(a));
        // Ham tim kiem
        System.out.println(Arrays.binarySearch(a, 4));
        System.out.println(Arrays.binarySearch(a, -1));
        // Ham diem gia tri
        Arrays.fill(b,5);
        System.out.println("b sau khi dien gia tri: " + Arrays.toString(b));
        // Ham sap xep giam dan
        Arrays.sort(a);
        a = Test.reverse(a);
        System.out.println("a sau khi sap xep giam dan: " + Arrays.toString(a));
    }
}
