import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Adding Two Numbers");
        System.out.print("Enter your First Number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter Your Second Number: ");
        int num2 = scanner.nextInt();
        int total = num1 + num2;
        System.out.println("Your Total is: " + total);
    }
}
