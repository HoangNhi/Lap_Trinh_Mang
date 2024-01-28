package Java12;

public class UnaryMath {
    public static void main(String[] args) {
        int a = 5;
        boolean b = false;

        System.out.println("Giá trị mặc định của a: " + a);
        System.out.println("Giá trị mặc định của b: " + b);
        System.out.println("-----");
        System.out.println(" -a => giá trị: " + (-a));
        System.out.println(" +a => giá trị: " + (+a));
        System.out.println(" !b => giá trị: " + (!b));
        System.out.println("-----");
        System.out.println("a = " + a);
        System.out.println("++a = " + (++a));
        System.out.println("a++ = " + (a++));
        System.out.println("a = " + a);
        System.out.println("--a = " + (--a));
        System.out.println("a-- = " + (a--));
        System.out.println("a = " + a);
    }
}
