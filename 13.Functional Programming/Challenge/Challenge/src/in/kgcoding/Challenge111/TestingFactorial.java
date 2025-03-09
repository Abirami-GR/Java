package in.kgcoding.Challenge111;

import java.util.stream.IntStream;

public class TestingFactorial {
    public static void main(String[] args) {
        System.out.println("Factorial using two ways");
        int number = 9;
        System.out.printf("Structural Programming: %d\n", structuralFactorial(number));
        System.out.print("Functional Programming: ");
        IntStream.rangeClosed(2,number)
                .reduce((a,b) -> a * b)
                .ifPresent(System.out::println);
    }

    //Structural
    public static long structuralFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }

        long fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
