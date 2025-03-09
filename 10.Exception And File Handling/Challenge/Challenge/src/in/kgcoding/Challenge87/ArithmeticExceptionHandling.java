package in.kgcoding.Challenge87;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Arithmetic Exception Handling");
        System.out.print("Enter first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter second number: ");
        // int second = scanner.nextInt();
        scanner.close();

        try {
            int second = scanner.nextInt();
            int result = first / second;
            System.out.printf("The Result is: %d", result);
        } catch (ArithmeticException exception) {
            if (exception.getMessage().equals("/ by zero")) {
                System.out.println("Divide by zero occurred");
            } else {
                throw exception;
            }
        } catch (InputMismatchException ime) {
            System.out.println("Input mismatch exception");
        }
    }
}
