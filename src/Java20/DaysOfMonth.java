package Java20;

import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao thang can kiem tra: ");
        int month = sc.nextInt();
        System.out.print("Nhap vao nam can kiem tra: ");
        int year = sc.nextInt();

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("So ngay cua thang " + month + " nam " + year + " la: 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("So ngay cua thang " + month + " nam " + year + " la: 30 ngay");
                break;
            case 2:
                if ((year%4==0 && year%100!=0) || year%400==0){
                    System.out.print("So ngay cua thang " + month + " nam " + year + " la: 29 ngay");
                }else{
                    System.out.print("So ngay cua thang " + month + " nam " + year + " la: 28 ngay");
                }
                break;
            default:
                System.out.println("Nhap du lieu sai");
                break;
        }
    }
}
