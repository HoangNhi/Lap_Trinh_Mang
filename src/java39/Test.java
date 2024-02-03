package java39;

public class Test {
    public static void main(String[] args) {
        System.out.println("Kiem tra con nguoi");
        People cn = new People("TITV", 2021);
        cn.Eat();
        cn.Drink();
        cn.Sleep();

        System.out.println("\nKiem tra hoc sinh");
        Student hs = new Student("TITV", 2021, "Lop 1", "Truong 1");
        hs.Eat();
        hs.Drink();
        hs.Sleep();
        hs.DoHomework();
    }
}
