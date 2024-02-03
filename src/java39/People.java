package java39;

public class People {
    private String FullName;
    private int YearOfBirth;
    public People() {}

    public People(String fullName, int yearOfBirth) {
        FullName = fullName;
        YearOfBirth = yearOfBirth;
    }

    public String getFullName() {
        return FullName;
    }

    public int getYearOfBirth() {
        return YearOfBirth;
    }

    public void Eat(){
        System.out.println("Mam mam");
    }

    public void Drink() {
        System.out.println("uc uc");
    }

    public void Sleep() {
        System.out.println("Kho kho");
    }
}
