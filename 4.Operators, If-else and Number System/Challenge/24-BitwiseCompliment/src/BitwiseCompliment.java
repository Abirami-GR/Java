import java.util.Scanner;

public class BitwiseCompliment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitwise Compliment");
        System.out.print("Please enter a number: ");
        int num  = scanner.nextInt();


        //Logic
        int result = ~num;
        System.out.println("The result is: " + result);
    }
}
