import java.util.Scanner;

public class RelationalOperator {
    public static void main(String[] args) {
        //Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Driving License Portal");
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        //Logic
        if(age >= 18){
            System.out.println("You are eligible to drive");
        } else {
            System.out.println("You are not eligible to drive");
        }




    }
}
