import java.util.Scanner;

public class AbsoluteIntegerTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Absolute Integer");
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        int result = (num >= 0) ? num : -num;
        System.out.println("Absolute value is: " + result);

    }
}
