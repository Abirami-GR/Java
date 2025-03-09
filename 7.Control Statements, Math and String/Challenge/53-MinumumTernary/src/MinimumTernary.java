import java.util.Scanner;

public class MinimumTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Minimum of Two numbers");
        System.out.print("Please enter first number: ");
        int first = scanner.nextInt();
        System.out.print("Please enter second number: ");
        int second = scanner.nextInt();
        MinimumTernary ternary = new MinimumTernary();
        int min = ternary.min(first, second);
        System.out.println("Minimum of Two numbers is: " + min);
    }

    public int min(int first, int second){
        return (first < second) ? first : second;
    }
}
