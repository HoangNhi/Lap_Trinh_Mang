package Java38;

public class Manufacturer {
    private String Name;
    private Country Country;

    public Manufacturer() {}

    public Manufacturer(String name, Java38.Country country) {
        Name = name;
        Country = country;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Java38.Country getCountry() {
        return Country;
    }

    public void setCountry(Java38.Country country) {
        Country = country;
    }
}
