import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Name:  ");
        String name = scanner.nextLine();
        System.out.println("Welcome " + name);
        System.out.print(name + ", Also Tell me your age : ");
        int age = scanner.nextInt();
        System.out.println("Hi! " + name + " Your age is " + age );
     }
}
