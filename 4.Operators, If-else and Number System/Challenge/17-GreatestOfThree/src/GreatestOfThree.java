import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Greatest of the Three");
        System.out.println("Please enter the Three Numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        //Logic
        if(a >= b && a >= c){
            System.out.println(a + " is the Greatest");
        } else if(b > a && b > c){
            System.out.println(b + " is the Greatest");
        } else {
            System.out.println(c + " is the Greatest");
        }
    }
}
