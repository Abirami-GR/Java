import java.util.Scanner;

public class BitwiseRightShift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitwise Right Shift");
        System.out.print("Please enter a number: ");
        int num  = scanner.nextInt();


        //Logic
        int result = num >> 1;
        System.out.println("The result is: " + result);
    }
}

