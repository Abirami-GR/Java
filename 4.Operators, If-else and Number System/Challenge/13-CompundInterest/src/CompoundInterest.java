import java.util.Scanner;


public class CompoundInterest {
    public static void main(String[] args) {
        //Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Compound Interest Calculator!");
        System.out.print("Enter Your principle amount in Rs: ");
        int p = scanner.nextInt();
        System.out.print("Enter rate of Interest: ");
        float r= scanner.nextFloat();
        System.out.print("Enter the Term: ");
        float t = scanner.nextFloat();

        //Logic
        double compInt = p * Math.pow((1 + r / 100),t);

        //Output
        System.out.println("Compound Interest: " + compInt);

    }
}
