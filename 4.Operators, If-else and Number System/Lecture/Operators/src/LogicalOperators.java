import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        //Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Ticket Discount Calculator");
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Are you a female: (true/false): ");
        boolean isFemale = scanner.nextBoolean();

        //Logic
        if(age < 5){
            System.out.println("You get 75% discount");
        }  else if(isFemale){
            System.out.println("You get 50% discount");
        } else if(age > 60 && (!isFemale)){
            System.out.println("You get 25% discount");
        } else {
            System.out.println("You get NO discount");
        }




    }
}
