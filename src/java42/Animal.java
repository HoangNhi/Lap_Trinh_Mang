package java42;

public class Animal {
    protected String name;
    public Animal(String name){
        this.name = name;
    }
    public void eat(){
        System.out.println("Eating...");
    }
    public void makeSound(){
        System.out.println("Animal make soud");
    }

    public void sleep() {
        System.out.println("Zzzzzzzzzzzzzzzz");
    }
}
