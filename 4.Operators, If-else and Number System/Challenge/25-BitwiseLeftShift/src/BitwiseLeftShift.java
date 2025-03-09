import java.util.Scanner;

public class BitwiseLeftShift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitwise Left Shift");
        System.out.print("Please enter a number: ");
        int num  = scanner.nextInt();


        //Logic
        int result = num << 1;
        System.out.println("The result is: " + result);
    }
}
