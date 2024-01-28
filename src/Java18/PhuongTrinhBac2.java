package Java18;

import java.util.Scanner;

public class PhuongTrinhBac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chuong trình giai phuong trình bac hai");
        System.out.println("-     ax^2 + bx + c = 0     -");
        System.out.println("\nNhap so nguyen a, b va c");

        System.out.print("a = " );
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        System.out.print("c = ");
        int c = sc.nextInt();

        System.out.println("-----");
        System.out.println("Giai phuong trinh: " + a + "x^2 + " + b + "x + " + c  + " = 0");

        if(a==0){
            if(b==0){
                if(c==0){
                    System.out.println("Phuong trinh co vo so nghiem");
                }else{
                    System.out.println("Phuong trinh vo nghiem");
                }
            }else{
                System.out.println("Phuong trinh co 1 nghiem: x = " + (-1.0*c/b));
            }
        }else{
            if(b==0){
                if(c==0){
                    // ax2=0
                    System.out.println("Phuong trinh 1 nghiem: x = 0");
                }else{
                    // ax2 + c = 0
                    System.out.println("Phuong trinh co 2 nghiem");
                    System.out.println("x1 = " + Math.sqrt(-1.0*c/a));
                    System.out.println("x1 = " + -1.0*Math.sqrt(-1.0*c/a));
                }
            }else{
                if(c==0){
                    System.out.println("Phuong trinh co 2 nghiem");
                    System.out.println("x1 = 0");
                    System.out.println("x2 = " + -1.0*b/a);
                }else{
                    int delta = b*b - 4*a*c;
                    if(delta == 0){
                        System.out.println("Phuong trinh co 1 nghiem: x = "+ (-1.0*b/(2*a)));
                    }else if(delta > 0){
                        System.out.println("Phuong trinh co 2 nghiem");
                        System.out.println("x1 = " + (-b - Math.sqrt(delta))/(2.0*a));
                        System.out.println("x2 = " + (-b + Math.sqrt(delta))/(2.0*a));
                    }else{
                        System.out.println("Phuong trinh vo nghiem");
                    }
                }
            }
        }
    }
}
