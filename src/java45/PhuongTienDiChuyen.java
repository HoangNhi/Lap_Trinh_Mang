package java45;

public abstract class PhuongTienDiChuyen {
    protected String loaiPhuongTien;
    protected HangSanXuat hangSanXuat;

    public PhuongTienDiChuyen(String loaiPhuongTien, HangSanXuat hangSanXuat) {
        this.loaiPhuongTien = loaiPhuongTien;
        this.hangSanXuat = hangSanXuat;
    }

    public String getLoaiPhuongTien() {
        return loaiPhuongTien;
    }

    public void setLoaiPhuongTien(String loaiPhuongTien) {
        this.loaiPhuongTien = loaiPhuongTien;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public String layTenHangSanXuat(){
        return getHangSanXuat().getTenHangSanXuat();
    }

    public void batDau(){
        System.out.println(getLoaiPhuongTien() + " bat dau");
    }
    public void tangToc(){
        System.out.println(getLoaiPhuongTien() + " tang toc");
    }

    public void dungLai(){
        System.out.println(getLoaiPhuongTien() + " dung lai");
    }

    public abstract double layVanToc();
}
