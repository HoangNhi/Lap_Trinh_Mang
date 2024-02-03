package java42;

public class Bird extends Animal {
    public Bird() {
        super("Bird");
    }

    @Override
    public void eat(){
        System.out.println("Eat worm");
    }

    @Override
    public void makeSound(){
        System.out.println("Quoac Quoac");
    }
}
