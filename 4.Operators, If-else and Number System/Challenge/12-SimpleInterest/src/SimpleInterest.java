import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple Interest Calculator!");
        System.out.print("Enter Principle amount in Rs:");
        int p = scanner.nextInt();
        System.out.print("Enter Term: ");
        float t = scanner.nextFloat();
        System.out.print("Enter Rate of interest: ");
        float r = scanner.nextFloat();

        //Logic
        float simpleInterest = (p * t * r) / 100;

        //Output
        System.out.println("Simple Interest is : " + simpleInterest);
    }
}