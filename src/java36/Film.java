package java36;

public class Film {
    private String FilmName;
    private int MFG; // Nam san xuat
    private Manufacturer Manufactuere;
    private double PriceTicket;
    private Date ReleaseDate;

    public Film() {}
    public Film(String filmName, int MFG, Manufacturer manufactuere, double priceTicket, Date releaseDate) {
        FilmName = filmName;
        this.MFG = MFG;
        Manufactuere = manufactuere;
        PriceTicket = priceTicket;
        ReleaseDate = releaseDate;
    }

    public String getFilmName() {
        return FilmName;
    }

    public void setFilmName(String filmName) {
        FilmName = filmName;
    }

    public int getMFG() {
        return MFG;
    }

    public void setMFG(int MFG) {
        this.MFG = MFG;
    }

    public Manufacturer getManufactuere() {
        return Manufactuere;
    }

    public void setManufactuere(Manufacturer manufactuere) {
        Manufactuere = manufactuere;
    }

    public double getPriceTicket() {
        return PriceTicket;
    }

    public void setPriceTicket(double priceTicket) {
        PriceTicket = priceTicket;
    }

    public Date getReleaseDate() {
        return ReleaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        ReleaseDate = releaseDate;
    }

    public boolean kiemTraGiaVeReHon(Film OtherFilm){
        return getPriceTicket() < OtherFilm.getPriceTicket();
    }

    public String layTenHangSanXuatPhim(){
        return getManufactuere().getName();
    }

    public double giaSauKhuyenMai(double x){
        return getPriceTicket() - getPriceTicket()*(x/100);
    }
}
