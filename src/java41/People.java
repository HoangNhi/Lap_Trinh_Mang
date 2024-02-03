package java41;

public class People {
    protected String FullName;
    protected int YearOfBirth;

    public People(String fullName, int yearOfBirth) {
        FullName = fullName;
        YearOfBirth = yearOfBirth;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public int getYearOfBirth() {
        return YearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        YearOfBirth = yearOfBirth;
    }
    public void Eat() {
        System.out.println("Mam Mam");
    }

    public void Sleep() {
        System.out.println("Zzzzz");
    }
}
