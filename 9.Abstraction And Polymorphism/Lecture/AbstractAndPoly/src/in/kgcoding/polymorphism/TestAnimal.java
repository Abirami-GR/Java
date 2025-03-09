package in.kgcoding.polymorphism;

public class TestAnimal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Duck duck = new Duck();

//        System.out.println("Dog: ");
//        dog.sound();
//
//        System.out.println();
//        System.out.println("Cat: ");
//        cat.sound();
//
//        System.out.println();
//        System.out.println("Duck: ");
//        duck.sound();

        castTest(dog);
        castTest(cat);
        castTest(duck);


    }

    public static void castTest(Animal ani){
        System.out.println("Object Name: " + ani);
        ani.sound();  //Object call
    }


}
