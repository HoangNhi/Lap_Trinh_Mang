package Java35;

public class Test {
    public static void main(String[] args) {
        Date date1 = new Date(15,5,2021);
        Date date2 = new Date(15,9,2030);
        Date date3 = new Date(15,9,2025);

        Author Author1 = new Author("Tung ITV", date1);
        Author Author2 = new Author("Tung Le", date2);
        Author Author3 = new Author("Peter Le", date3);

        Book Book1 = new Book("Lap trinh C", 5000, 2023, Author1);
        Book Book2 = new Book("Lap trinh Java", 10000, 2029, Author2);
        Book Book3 = new Book("Lap trinh Mang", 15000, 2029, Author3);

        Book1.inTenSach();
        Book2.inTenSach();
        Book3.inTenSach();

        System.out.println("\nSo sanh NXB sach 1 va 3: " + Book1.kiemTraCungNam(Book3));
        System.out.println("So sanh NXB sach 2 va 3: " + Book2.kiemTraCungNam(Book3));

        System.out.println("\nSach 1 giam 10%: " + Book1.giaSauKhiGiam(10));
        System.out.println("\nSach 2 giam 20%: " + Book2.giaSauKhiGiam(20));
        System.out.println("\nSach 3 giam 50%: " + Book3.giaSauKhiGiam(50));
    }
}
