import java.util.Scanner;

public class OddOrEvenTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Odd or Even");
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        OddOrEvenTernary oddOrEven = new OddOrEvenTernary();
        String result = oddOrEven.oddOrEvenTernary(num);
        System.out.println("The number is " + result);
    }

    public String oddOrEvenTernary(int num){
        return (num % 2 == 0) ? "Even" : "Odd";
    }
}
