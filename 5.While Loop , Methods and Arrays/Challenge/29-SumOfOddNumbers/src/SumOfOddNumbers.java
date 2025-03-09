import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sum of Odd Numbers");
        System.out.print("Enter the your Number: ");
        int num = scanner.nextInt();
        int sum = oddSum(num);
        System.out.println("Odd sum till " + num + " is: " + sum);
    }

    public static int oddSum(int num){
        int sum = 0;
        int i = 1;
        while(i <= num){
            sum += i;
            i += 2;
        }
        return sum;
    }

}
