package in.kgcoding.polymorphism;

public class Overloading {

    Overloading(){
        System.out.println("Default constructor call");
    }

    Overloading(String pop){
        System.out.printf("Parameterized constructor call: %s",pop);
    }

    public int add(int a, int b){
        return a + b;
    }

    public int add(int a, int b, int c, int d){
        return a + b + c + d;
    }

    public String add(String str1, String str2){
        return str1.concat(str2);
    }

    public static void main(String[] args) {
        System.out.println("Method Overloading");
        Overloading overload = new Overloading();
        System.out.printf("The sum is: %d \n", overload.add(5,4));
        System.out.printf("The concat String is: %s \n", overload.add("Hello ", "World!"));
        Overloading ol = new Overloading("World!");
        System.out.printf("\n The sum is: %d \n", ol.add(5,4, 3, 2));
    }
}
