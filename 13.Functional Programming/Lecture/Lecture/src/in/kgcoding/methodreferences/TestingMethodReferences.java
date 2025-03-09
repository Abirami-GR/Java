package in.kgcoding.methodreferences;

import java.util.List;


public class TestingMethodReferences {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,3,4,2,5,6,3);

        numbers.stream()
                .filter(number -> number % 2 == 1)
                .forEach(System.out::println); //consumer type method in system.out object
        // takes one variable and prints that variable
        // one parameter no return type

        numbers.stream()
                .filter(number -> number % 2 == 1)
                .forEach(number -> System.out.println(number));


        //Lambda Reduce
        System.out.println();
        System.out.println("Using Lambda Reduce");
        // Reduce - Terminal
        int lambdaSum = numbers.stream().reduce(0, (a,b) -> a + b);
        System.out.printf("The Sum is: %d", lambdaSum);


        //Lambda Reduce
        System.out.println();
        System.out.println("Using Lambda Reduce");
        // Reduce - Terminal
         lambdaSum = numbers.stream().reduce(0, Integer::sum);
        System.out.printf("The Sum is: %d", lambdaSum);

    }
}
