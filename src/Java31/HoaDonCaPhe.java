package Java31;

public class HoaDonCaPhe {
    private String tenLoaiCaPhe;
    private double giaTien1Kg;
    private double khoiLuong;

    public String getTenLoaiCaPhe() {
        return tenLoaiCaPhe;
    }

    public void setTenLoaiCaPhe(String tenLoaiCaPhe) {
        this.tenLoaiCaPhe = tenLoaiCaPhe;
    }

    public double getGiaTien1Kg() {
        return giaTien1Kg;
    }

    public void setGiaTien1Kg(double giaTien1Kg) {
        this.giaTien1Kg = giaTien1Kg;
    }

    public double getKhoiLuong() {
        return khoiLuong;
    }

    public void setKhoiLuong(double khoiLuong) {
        this.khoiLuong = khoiLuong;
    }

    public HoaDonCaPhe(String tenLoaiCaPhe, double giaTien1Kg, double khoiLuong) {
        this.tenLoaiCaPhe = tenLoaiCaPhe;
        this.giaTien1Kg = giaTien1Kg;
        this.khoiLuong = khoiLuong;
    }
    public HoaDonCaPhe(){}

    public double tinhTongTien(){
        return getGiaTien1Kg()*getKhoiLuong();
    }

    public boolean kiemTraKhoiLuongLonHon(double khoiLuong){
        return getKhoiLuong()>khoiLuong;
    }

    public boolean kiemTraTongTienLonHon500K(){
        return tinhTongTien()>500000;
    }

    public double giamGia(double x){
        if(tinhTongTien() > 500000) return tinhTongTien()*x/100;
        else return 0;
    }
    public double soTienPhaiTraSauGiamGia(double x){
        return tinhTongTien() - giamGia(x);
    }
}
