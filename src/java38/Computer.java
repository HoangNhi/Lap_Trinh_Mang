package java38;

public class Computer {
    private Manufacturer Manu;
    private Date Date;
    private double Price, WarrantyPeriod;
    public Computer() {}

    public Computer(Manufacturer manu, java38.Date date, double price, double warrantyPeriod) {
        Manu = manu;
        Date = date;
        Price = price;
        WarrantyPeriod = warrantyPeriod;
    }

    public Manufacturer getManu() {
        return Manu;
    }

    public void setManu(Manufacturer manu) {
        Manu = manu;
    }

    public java38.Date getDate() {
        return Date;
    }

    public void setDate(java38.Date date) {
        Date = date;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public Double getWarrantyPeriod() {
        return WarrantyPeriod;
    }

    public void setWarrantyPeriod(Double warrantyPeriod) {
        WarrantyPeriod = warrantyPeriod;
    }

    public boolean kiemTraGiaThapHon(Computer OtherComputer){
        return getPrice() < OtherComputer.getPrice();
    }

    public String layTenQuocGia(){
        return getManu().getCountry().getName();
    }
}
