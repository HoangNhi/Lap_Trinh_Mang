package java34;

public class Test {
    public static void main(String[] args) {
        MyDate md = new MyDate(15, 5, 2025);
        MyDate md2 = new MyDate(11, 1, 2021);
        MyDate md3 = new MyDate(15, 5, 2025);

        System.out.println(md);
        System.out.println(md2);
        System.out.println(md3);

        System.out.println("\n-----\n");

        System.out.println("md so sanh bang md2: " + md.equals(md2));
        System.out.println("md so sanh bang md3: " + md.equals(md3));

        System.out.println("\n-----\n");

        System.out.println("Hashcode md: " + md.hashCode());
        System.out.println("Hashcode md2: " + md2.hashCode());
        System.out.println("Hashcode md3: " + md3.hashCode());
    }
}
