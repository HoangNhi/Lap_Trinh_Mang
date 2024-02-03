package java42;

public class Cat extends Animal {
    public Cat() {
        super("Cat");
    }

    @Override
    public void eat(){
        System.out.println("Eat fish");
    }

    @Override
    public void makeSound(){
        System.out.println("Meow Meow");
    }
}
