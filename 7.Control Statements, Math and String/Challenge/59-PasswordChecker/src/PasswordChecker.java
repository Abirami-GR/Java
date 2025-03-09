import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Password Checker Using Do-While");

        String password;
        do{
            System.out.print("Please enter the password: ");
            password = scanner.next();
        }while(!isValidPassword(password));
        System.out.println("Thanks for entering a valid password");
    }

    public static boolean isValidPassword(String password){
        return password.length() > 6;
    }
}
