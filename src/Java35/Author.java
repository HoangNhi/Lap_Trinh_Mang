package Java35;

public class Author {
    private String Name;
    private Date Birthday;

    public Author(){}

    public Author(String name, Date birthday) {
        Name = name;
        Birthday = birthday;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Date getBirthday() {
        return Birthday;
    }

    public void setBirthday(Date birthday) {
        Birthday = birthday;
    }
}
