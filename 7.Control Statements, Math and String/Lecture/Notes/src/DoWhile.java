import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do While");
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//
//        while( age < 0 || age > 100){
//            System.out.print("Invalid age, Please enter again: ");
//             age = scanner.nextInt();
//        }

        int age;
        do{
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        } while(age < 0 || age > 100);

        System.out.println("Your age is: " + age);
    }
}
