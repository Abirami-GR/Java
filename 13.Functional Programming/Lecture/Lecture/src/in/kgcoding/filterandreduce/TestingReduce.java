package in.kgcoding.filterandreduce;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestingReduce {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,3,4,2,5,6,3);
        
        //For
        System.out.println("Using forEach");
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }

        System.out.printf("The Sum is: %d", sum);

        //Stream
        System.out.println();
        System.out.println("Using Stream");
        int newSum = numbers.stream().reduce(0, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        });
        System.out.printf("The Sum is: %d", newSum);


        //Lambda Reduce
        System.out.println();
        System.out.println("Using Lambda Reduce");
        // Reduce - Terminal
        int lambdaSum = numbers.stream().reduce(0, (a,b) -> a + b);
        System.out.printf("The Sum is: %d", lambdaSum);

        //Lambda Reduce MinMax
        System.out.println();
        System.out.println("Using Lambda Reduce MinMax");
        // Reduce - Terminal
        int lambdaMinMax = numbers.stream()
                .reduce(Integer.MIN_VALUE, (a,b) -> a > b ? a : b);
        System.out.printf("The Max is: %d", lambdaMinMax);


    }
}
