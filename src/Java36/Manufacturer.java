package Java36;

public class Manufacturer {
    private String Name, Country;

    public Manufacturer() {}
    public Manufacturer(String name, String country) {
        Name = name;
        Country = country;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }
}
