package java38;

public class Test {
    public static void main(String[] args) {
        Date ngay1 = new Date(15, 8, 2025);
        Date ngay2 = new Date(1, 3, 2025);
        Date ngay3 = new Date(6, 9, 2025);

        Country quocGia1 = new Country("VN", "Việt Nam");
        Country quocGia2 = new Country("USA", "Hoa Kỳ");
        Country quocGia3 = new Country("TW", "Đài Loan");

        Manufacturer hangSanXuat1 = new Manufacturer("VNLaptop", quocGia1);
        Manufacturer hangSanXuat2 = new Manufacturer("Macbook", quocGia2);
        Manufacturer hangSanXuat3 = new Manufacturer("Asus", quocGia3);

        Computer mayTinh1 = new Computer(hangSanXuat1, ngay1, 1500, 12);
        Computer mayTinh2 = new Computer(hangSanXuat2, ngay2, 2000, 24);
        Computer mayTinh3 = new Computer(hangSanXuat3, ngay3, 1000, 12);

        System.out.println("So sanh gia thấp hơn: ");
        System.out.println("M1 < M2: "+ mayTinh1.kiemTraGiaThapHon(mayTinh2));
        System.out.println("M1 < M3: "+ mayTinh1.kiemTraGiaThapHon(mayTinh3));


        System.out.println("Tên quốc gia: ");
        System.out.println("M1: "+ mayTinh1.layTenQuocGia());
        System.out.println("M2: "+ mayTinh2.layTenQuocGia());
        System.out.println("M3: "+ mayTinh3.layTenQuocGia());
    }
}
