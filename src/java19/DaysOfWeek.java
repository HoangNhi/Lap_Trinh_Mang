package java19;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen tu 2 den 8: ");
        switch (sc.nextInt()){
            case 2:{
                System.out.println("Monday");
                break;
            }
            case 3:{
                System.out.println("Tuesday");
                break;
            }
            case 4:{
                System.out.println("Wednesday");
                break;
            }
            case 5:{
                System.out.println("Thursday");
                break;
            }
            case 6:{
                System.out.println("Friday");
                break;
            }
            case 7:{
                System.out.println("Saturday");
                break;
            }
            case 8:{
                System.out.println("Sunday");
                break;
            }
            default:{
                System.out.println("Nhap du lieu sai");
                break;
            }
        }
    }
}
