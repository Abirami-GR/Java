import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Factorial");
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        long factIt = factorialIterative(num);
        System.out.println("The factorial Iterative: " + factIt);

        long factRec = factorialRecursion(num);
        System.out.println("The factorial Recursion: " + factRec);
    }
    public static long factorialIterative(int num){
        long result = 1;
        for(int i = 1; i <= num; i++){
            result *= i;
        }
        return result;
    }

    public static long factorialRecursion(int num) {
        System.out.println("Function called for: " + num);
        if(num == 1){
            return 1;
        }
        return num * factorialRecursion(num - 1);
    }
}
