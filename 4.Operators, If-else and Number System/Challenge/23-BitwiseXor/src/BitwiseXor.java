import java.util.Scanner;

public class BitwiseXor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitwise XOR");
        System.out.print("Please enter two numbers: ");
        int first  = scanner.nextInt();
        int second = scanner.nextInt();

        //Logic
        int result = first ^ second;
        System.out.println("The result is: " + result);
    }
}
