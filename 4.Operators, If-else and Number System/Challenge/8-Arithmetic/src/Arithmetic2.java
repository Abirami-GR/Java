import java.util.Scanner;

public class Arithmetic2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Input
        System.out.println("Welcome to Arithmetic Operators");
        System.out.print("Please enter First Number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Please enter Second Number: ");
        int secondNumber = scanner.nextInt();

        //Logic
        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiply = firstNumber * secondNumber ;
        int division = firstNumber / secondNumber;
        int modulo = firstNumber % secondNumber;

        //output
        System.out.println("Addition : " + addition);
        System.out.println("Subtraction : " + subtraction);
        System.out.println("Multiplication : " + multiply);
        System.out.println("Division : " + division);
        System.out.println("Modulus : " + modulo);
    }
}
