import java.util.Scanner;

public class FloatMultiplication {
    public static void main(String[] args) {
        //Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Float Multiplication");
        System.out.print("Enter your first number: ");
        double first = scanner.nextDouble() ;
        System.out.print("Enter your second number: ");
        double second = scanner.nextDouble() ;

        //Logic
        double mul = first * second;

        //Output
        System.out.println("Float Multiplication: " + mul);




    }
}
