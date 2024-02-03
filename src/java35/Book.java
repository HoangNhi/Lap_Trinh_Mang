package java35;

public class Book {
    private String NameBook;
    private double Price;
    private int ReleaseYear;
    private Author Author;

    public Book(){}

    public Book(String nameBook, double price, int releaseYear, java35.Author author) {
        NameBook = nameBook;
        Price = price;
        ReleaseYear = releaseYear;
        Author = author;
    }

    public String getNameBook() {
        return NameBook;
    }

    public void setNameBook(String nameBook) {
        NameBook = nameBook;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public int getReleaseYear() {
        return ReleaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        ReleaseYear = releaseYear;
    }

    public java35.Author getAuthor() {
        return Author;
    }

    public void setAuthor(java35.Author author) {
        Author = author;
    }

    public void inTenSach(){
        System.out.println("Ten sach: " + getNameBook());
    }

    public boolean kiemTraCungNam(Book OtherBook){
        return this.getReleaseYear() == OtherBook.getReleaseYear();
    }

    public double giaSauKhiGiam(double x){
        return getPrice() - (getPrice()*x/100);
    }
}
