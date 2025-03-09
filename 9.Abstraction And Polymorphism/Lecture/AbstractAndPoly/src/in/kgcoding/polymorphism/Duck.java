package in.kgcoding.polymorphism;

public class Duck extends Animal{
    @Override
    public void sound() {
        //sound(); // Recursion
        super.sound();
        System.out.println("Quack Quack");
    }
}
