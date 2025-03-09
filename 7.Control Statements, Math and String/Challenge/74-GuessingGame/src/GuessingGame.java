import java.util.Scanner;

public class GuessingGame {
    int random;

    GuessingGame() {
        random = (int) Math.ceil(Math.random() * 100);
    }

    /**
     *
     * @param guessNumber the number that player guessed
     * @return
     * - Negative if the guessed number is smaller
     * - 0 if the guessed number is correct
     * - positive if the guessed number is greater
     */
    int guess(int guessNumber){
       return guessNumber - random;
    }
    public static void main(String[] args) {
        //Input
        Scanner scanner = new Scanner(System.in);
        GuessingGame gg = new GuessingGame();
//        System.out.println("Random: " + gg.random);
        System.out.println("Guessing Game");
        int guess;
        int result;
        do{
            System.out.print("Enter the guess (1 - 100): ");
            guess = scanner.nextInt();
            result = gg.guess(guess);

            if(result > 0){
                System.out.println("Guess smaller");
            } else if(result < 0){
                System.out.println("Guess higher");
            } else{
                System.out.println("Guess is right");
            }
        }while(result != 0);
    }
}
