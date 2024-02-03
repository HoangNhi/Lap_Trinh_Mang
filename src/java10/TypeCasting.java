package java10;

public class TypeCasting {
    public static void main(String[] args) {
        int a = 100, b = 2;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        float c = a;
        float d = b;

        System.out.println("c = " + c);
        System.out.println("d = " + d);

        // Ep kieu tuong minh
        float e = 3.5F;
        float f = 9.5F;
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        int g = (int)e;
        int h = (int)f;
        System.out.println("g = " + g);
        System.out.println("h = " + h);
    }
}
