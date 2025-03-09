import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        //Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Positive, Negative or Zero");
        System.out.print("Please enter the number: ");
        int num = scanner.nextInt();

        //Logic
        if(num > 0){
            System.out.println("The Number is Positive");
        } else if(num < 0){
            System.out.println("The Number is Negative");
        } else {
            System.out.println("The Number is Zero");
        }
    }
}
