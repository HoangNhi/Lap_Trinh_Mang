package java36;

public class Test {
    public static void main(String[] args) {
        Date Date1 = new Date(15, 05, 2022);
        Date Date2 = new Date(31, 01, 2025);
        Date Date3 = new Date(16, 02, 2030);

        Manufacturer Manu1 = new Manufacturer("Hang A", "Viet Nam");
        Manufacturer Manu2 = new Manufacturer("Hang B", "My");
        Manufacturer Manu3 = new Manufacturer("Hang C", "Ba Lan");

        Film Film1 = new Film("Bo Gia", 2020, Manu1, 65000, Date1);
        Film Film2 = new Film("Running Man", 2021, Manu2, 100000, Date2);
        Film Film3 = new Film("Kham pha Ba Lan", 2025, Manu3, 115000, Date3);

        System.out.println("SS gia 1 re hon 2: " + Film1.kiemTraGiaVeReHon(Film2));
        System.out.println("SS gia 3 re hon 2: " + Film3.kiemTraGiaVeReHon(Film2));

        System.out.println("Ten hang san xuat BP 3: " + Film3.layTenHangSanXuatPhim());

        System.out.println("BP1 giam 10%: " + Film1.giaSauKhuyenMai(10));
        System.out.println("BP2 giam 20%: " + Film2.giaSauKhuyenMai(20));
        System.out.println("BP3 giam 50%: " + Film3.giaSauKhuyenMai(50));

    }
}
