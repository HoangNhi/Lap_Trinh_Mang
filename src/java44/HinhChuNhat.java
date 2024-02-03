package java44;

public class HinhChuNhat extends Hinh {
    private double chieuRong, chieuCao;

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public HinhChuNhat(ToaDo toaDo, double chieuCao, double chieuRong) {
        super(toaDo);
        this.chieuCao = chieuCao;
        this.chieuRong = chieuRong;
    }

    @Override
    public double tinhDienTich() {
        return getChieuCao() * getChieuRong();
    }
}
