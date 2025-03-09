import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Factorial");
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        long fact = factorial(num);
        System.out.println("The factorial of " + num + " is :" + fact );
    }
    public static long factorial(int num){
        if(num < 2){
            return 1;
        }

        long fact = 1;
        int i = 2;
        while(i <= num){
            fact *= i;
            i++;
        }

        return fact;
    }
}
