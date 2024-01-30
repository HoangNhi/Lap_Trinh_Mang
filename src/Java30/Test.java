package Java30;

public class Test {
    public static void main(String[] args) {
        Date d = new Date(30,1,2024);
        System.out.println("Day: " + d.getDay());
        System.out.println("Month: " + d.getMonth());
        System.out.println("Year: " + d.getYear());
        d.show();

    }
}
