package java37;

public class Test {
    public static void main(String[] args) {
        Date Date1 = new Date(19,7,2002);
        Date Date2 = new Date(17,2,2001);
        Date Date3 = new Date(19,7,2002);

        Classroom Class1 = new Classroom("DH01", "Khoa Cong Nghe Thong Tin");
        Classroom Class2 = new Classroom("DH02", "Khoa Khoa Hoc May Tinh");
        Classroom Class3 = new Classroom("DH03", "Khoa An Ninh Mang");

        Student Sv1 = new Student("0001", "Tung ITV", Date1, 9.0, Class1);
        Student Sv2 = new Student("0002", "Peter Le", Date2, 4.0, Class2);
        Student Sv3 = new Student("0003", "Le Tung", Date3, 6.0, Class3);

        System.out.println("Ten Khoa: ");
        System.out.println("Sv1: " + Sv1.layTenKhoa());
        System.out.println("Sv2: " + Sv2.layTenKhoa());
        System.out.println("Sv3: " + Sv3.layTenKhoa());
        System.out.println("\nKiem tra thi dat: ");
        System.out.println("Sv1: " + Sv1.kiemTraThiDat());
        System.out.println("Sv2: " + Sv2.kiemTraThiDat());
        System.out.println("Sv3: " + Sv3.kiemTraThiDat());

        System.out.println("\nKiem tra cung ngay sinh: ");
        System.out.println("sv1 va sv2: " + Sv1.kiemTraCungNgaySinh(Sv2));
        System.out.println("sv1 va sv3: " + Sv1.kiemTraCungNgaySinh(Sv3));
    }
}
