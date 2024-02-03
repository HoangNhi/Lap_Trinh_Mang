package java38;

public class Manufacturer {
    private String Name;
    private Country Country;

    public Manufacturer() {}

    public Manufacturer(String name, java38.Country country) {
        Name = name;
        Country = country;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public java38.Country getCountry() {
        return Country;
    }

    public void setCountry(java38.Country country) {
        Country = country;
    }
}
