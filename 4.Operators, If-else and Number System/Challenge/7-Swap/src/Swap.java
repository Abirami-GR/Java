import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Swapping Station");
        System.out.print("Please enter the value of A: ");
        int a = scanner.nextInt();
        System.out.print("Please enter the value of B: ");
        int b = scanner.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("Swapping Done....");
        System.out.println("The value of A: " + a +"\n The value of B: " + b);
    }
}
