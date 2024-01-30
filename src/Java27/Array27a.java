package Java27;

import java.util.Scanner;

public class Array27a {
    public static void main(String[] args) {
        double[] mang1;
        double mang2[];
        double sum = 0;

        mang1 = new double[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<mang1.length;i++){
            System.out.print("mang1["+i+"] = ");
            mang1[i] = sc.nextInt();
            sum+=mang1[i];
        }
        System.out.println("\n-----\n");
        for(int i=0;i<mang1.length;i++){
            System.out.println("mang1["+i+"] = " + mang1[i]);
        }
        System.out.println("Tong mang 1: " + sum);
        mang2 = new double[]{1,2,3,4,5};
        System.out.print("Mang 2: ");
        for (int i = 0; i<mang2.length;i++){
            System.out.print(mang2[i] + " ");
        }
    }
}
