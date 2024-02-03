package java42;

public class Dog extends Animal{
    public Dog() {
        super("Dog");
    }

    @Override
    public void eat(){
        System.out.println("Eating bone");
    }

    @Override
    public void makeSound(){
        System.out.println("Gau Gau");
    }
}
