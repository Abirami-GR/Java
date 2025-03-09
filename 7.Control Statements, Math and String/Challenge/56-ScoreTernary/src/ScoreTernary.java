import java.util.Scanner;

public class ScoreTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Score: High, Moderate or Low");
        System.out.print("Enter the score: ");
        int score = scanner.nextInt();
        String result = (score >= 50) ? (score <= 80 ? "Moderate" : "High" ) : "Low";
        System.out.println("Your scored: " + result);
    }
}
