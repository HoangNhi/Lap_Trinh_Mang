package java40.Hierarchical;

public class Animal {
    protected String Name;
    public Animal() {}

    public Animal(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void eat(){
        System.out.println("I'm eating");
    }
}
