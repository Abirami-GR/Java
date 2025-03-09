import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number guessing game");
        int num = 5, guess;

        do{
            System.out.print("Enter the number between 0 to 10: ");
             guess= scanner.nextInt();
        } while (num != guess);
        System.out.println("You guessed it right this time");

    }
}
