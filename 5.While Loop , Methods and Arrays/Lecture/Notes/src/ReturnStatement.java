import java.util.Scanner;

public class ReturnStatement {
    public static void main(String[] args) {
        greet();
        int first = readNumber();
        int second = readNumber();


        int sum = first + second;
        System.out.println("The sumTwoNumbers of the two numbers is : " + sum);
    }
    public static void greet(){
        System.out.println("Welcome to the calculator");
    }

    public static int readNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter first number:");
        int number = scanner.nextInt();
        return number;
    }
}
