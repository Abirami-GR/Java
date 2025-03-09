import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Odd Or Even");
        System.out.print("Please enter the number: ");
        int num = scanner.nextInt();

        if(num % 2 == 0){
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }
    }
}
