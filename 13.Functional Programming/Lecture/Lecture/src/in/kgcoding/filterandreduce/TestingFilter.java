package in.kgcoding.filterandreduce;

import java.util.List;
import java.util.function.Consumer;

public class TestingFilter {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "mango", "cherry", "date");
        System.out.println(fruits.size());

        //for
        System.out.println("Printing fruits normally");
        for(String fruit : fruits){
            System.out.println(fruit);
        }

        //Stream
        System.out.println("Printing fruits using streams");
        fruits.stream().forEach(new Consumer<String>() {  //functional Interfaces
            @Override
            public void accept(String fruit) {
                System.out.println(fruit);
            }
        });
        //1) one function
        //2) returns nothing
        //3) body has only one statement

        //Lambda
        System.out.println("Printing fruits using filter");
        //Stream<String> fruitStream = fruits.stream();
        // Nothing will be saved inside fruitStream until forEach is called
        fruits.stream()
                // takes a predicate(Interface) one function returns boolean
                //.filter(fruit -> { return  fruit.endsWith("e");})
                .filter(fruit -> fruit.endsWith("e"))
                //Terminal Operation - others start working only if this is called
                .forEach(fruit -> System.out.println(fruit));
    }
}
